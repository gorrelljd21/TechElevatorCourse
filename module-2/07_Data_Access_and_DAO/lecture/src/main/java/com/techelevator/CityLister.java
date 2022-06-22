package com.techelevator;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class CityLister {

    public static void main(String[] args) {
        //Datasource - where is the computer that has the DB, what DB do I want to connect to, and what are connection credentials
        //goal is to connect to DB to list cities
        //sub protocol clues to sub driver - postgresql
        //localhost - current computer that program is running
        //server runs until you kill it, listening to default port 5432
        //UnitedStates - name of database on server

        BasicDataSource usaDataSource = new BasicDataSource();
        usaDataSource.setUrl("jdbc:postgresql://localhost:5432/UnitedStates");
        usaDataSource.setUsername("postgres");
        usaDataSource.setPassword("postgres1");

        //JDBC template
        JdbcTemplate jdbcTemplate = new JdbcTemplate(usaDataSource);
        String selCities =
                "select city_name, population as num_folks" +
                        " from city" +
                        " where state_abbreviation = ? AND population > ?" + //? is a placeholder
                        " order by city_name";

        SqlRowSet cities = jdbcTemplate.queryForRowSet(selCities, "OH", 100000); //? = % in print format, same concept
        // if you put XX it won't fail, it just won't find any rows that have "XX" as a state_abbreviation
        //cannot use ? for column/table name, only can be used for data

        //SqlRowSet
        //true while there's a next row, false if no more rows, moves cursor to the next row
        while (cities.next()){
            String city = cities.getString("city_name");
            int population = cities.getInt("num_folks");
            System.out.println(city + " | " + population);
        }
    }
}
