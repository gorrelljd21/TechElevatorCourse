package com.techelevator.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcPizzaToppingDao {

    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    public JdbcPizzaToppingDao(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate();
    }


    String pizzaToppings =
            "insert into pizza_topping(pizza_id, topping_name)" +
                    "values(?,?);";
    jdbcTemplate.update()

}
