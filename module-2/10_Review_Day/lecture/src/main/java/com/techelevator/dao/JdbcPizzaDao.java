package com.techelevator.dao;

import com.techelevator.Pizza.model.Pizza;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


public class JdbcPizzaDao implements PizzaDao{
    //implements every method in that database

    private DataSource dataSource;
    //what is role of server, where is it, what are the credentials
    private JdbcTemplate jdbcTemplate;

    public JdbcPizzaDao(DataSource dataSource){
        this.dataSource = dataSource; //where is it
        this.jdbcTemplate = new JdbcTemplate(dataSource); //shove sql down the pipe
    }

    public void createPizza(Pizza pizza){
        String insertPizzaSql =
                    "insert into pizza(sale_id, size_id, crust, sauce, price, additional_instructions)" +
                    " values (?, ?, ?, ?, ?, ?);";
        jdbcTemplate.update(insertPizzaSql, pizza.getSaleId(), pizza.getSizeId(), pizza.getCrust(), pizza.getSauce(),
                pizza.getPrice(), pizza.getAdditionalInstructions());
    }

}
