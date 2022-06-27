package com.techelevator.Pizza;

import com.techelevator.Pizza.model.Pizza;
import com.techelevator.Pizza.model.PizzaTopping;
import com.techelevator.dao.JdbcPizzaDao;
import com.techelevator.dao.PizzaDao;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class PizzaApp {
    public static void main(String[] args) {
        BasicDataSource pizzaDataSource = new BasicDataSource();
        //datasource is an interface
        pizzaDataSource.setUrl("jdbc:postgresql://localhost:5432/PizzaSHop");
        pizzaDataSource.setUsername("postgres");
        pizzaDataSource.setPassword("postgres1");

        //need to add returning clause when creating pizza
        PizzaDao pizzaDao = new JdbcPizzaDao(pizzaDataSource);

        Pizza pizza = new Pizza(0, null, "L", "Pan", "Normal",
                null, "asap");

        pizzaDao.createPizza(pizza);

        PizzaTopping pizzaTopping = new PizzaTopping(pizza.getPizzaId());

        pizzaToppingDao.createPizzaTopping();

    }
}
