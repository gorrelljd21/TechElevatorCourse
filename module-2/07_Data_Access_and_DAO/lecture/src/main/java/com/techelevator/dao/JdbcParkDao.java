package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Park getPark(int parkId) {
        //will only get one row or none because it is a PK
        String selectPark = "select park_id, park_name, date_established, area, has_camping from park where park_id = ?";
        SqlRowSet parkRowSet = jdbcTemplate.queryForRowSet(selectPark, parkId);
        if (parkRowSet.next()) {

            //return mapRowToPark(parkRowSet);

            Park park = new Park();

            park.setParkId(parkRowSet.getInt("park_id"));
            park.setParkName(parkRowSet.getString("park_name"));

            if (parkRowSet.getDate("date_established") != null) {
                park.setDateEstablished(parkRowSet.getDate("date_established").toLocalDate());
            } else {
                park.setDateEstablished(null);
            }

            park.setArea(parkRowSet.getDouble("area"));
            park.setHasCamping(parkRowSet.getBoolean("has_camping"));

            return park;
        } else {
            return null;
        }
    }
    //other ways to write the if statements as ternary if something is able to be null

    //park.setDateEstablished(parkRowSet.getDate("date_established) == null
    //                              ? null
    //                              : parkRowSet.getDate("date_established").toLocalDate());

    //Date dateEst = parkRowSet.getDate("date_established");
    //park.setDateEstablished(dateEst == null ? null : dateEst.toLocalDate());

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        String selParksByState =
                "select" +
                        " p.park_id, park_name, date_established, area, has_camping" +
                " from" +
                        " park as p" +
                        " join park_state as ps on p.park_id = ps.park_id" +
                " where" +
                        " state_abbreviation = ?;"; //? bind parameter
        SqlRowSet parksRowState = jdbcTemplate.queryForRowSet(selParksByState, stateAbbreviation);

        List<Park> parks = new ArrayList<>();

        while(parksRowState.next()){
            parks.add(mapRowToPark(parksRowState));
        }
        return parks;
    }

    @Override //need method in parkDao, either overriding something or implementing an interface
    public List<Park> searchParksByName(String name){
        String searchParks =
                "select * from park where park_name ilike ? order by park_name;";
        String wildcardedSearch = "%" + name + "%";

        List<Park> parks = new ArrayList<>();

        SqlRowSet parksRowSet = jdbcTemplate.queryForRowSet(searchParks, wildcardedSearch);

        while (parksRowSet.next()){
            Park park = mapRowToPark(parksRowSet);
            parks.add(park);
        }
        return parks;
    }

    //single row/obj search for object, row mapper interface, which is an obj that has maprow method

    @Override
    public Park createPark(Park park) {
        String createPark =
                "insert into park(park_name, date_established, area, has_camping)" +
                " values(?, ?, ?, ?) returning park_id;";

        Integer newParkId = jdbcTemplate.queryForObject(createPark, Integer.class, park.getParkName(),
                park.getDateEstablished(), park.getArea(), park.getHasCamping());

//        park.setParkId(newParkId);
//
//        return park;

        // OR

        return getPark(newParkId);
    }

    @Override
    public void updatePark(Park park) {
        String updatePark =
                "update park" +
                        " set park_name = ?, date_established = ?, area = ?, has_camping = ?" +
                        " where park_id = ?;";
        int numUpdated = jdbcTemplate.update(updatePark, park.getParkName(), park.getDateEstablished(), park.getArea(), park.getHasCamping(),
                park.getParkId());

        //check if it updated nothing, either it will or it won't because of pk
        if(numUpdated == 0){
            //err presents in red text
            System.err.println("Couldn't update park " + park.getParkId());
        }
    }

    @Override
    public void deletePark(int parkId) {

    }

    @Override
    public void addParkToState(int parkId, String stateAbbreviation) {

    }

    @Override
    public void removeParkFromState(int parkId, String stateAbbreviation) {

    }

    private Park mapRowToPark(SqlRowSet parkRowSet) {
        Park park = new Park();

        park.setParkId(parkRowSet.getInt("park_id"));
        park.setParkName(parkRowSet.getString("park_name"));

        if (parkRowSet.getDate("date_established") != null) {
            park.setDateEstablished(parkRowSet.getDate("date_established").toLocalDate());
        } else {
            park.setDateEstablished(null);
        }

        park.setArea(parkRowSet.getDouble("area"));
        park.setHasCamping(parkRowSet.getBoolean("has_camping"));

        return park;
    }
}
