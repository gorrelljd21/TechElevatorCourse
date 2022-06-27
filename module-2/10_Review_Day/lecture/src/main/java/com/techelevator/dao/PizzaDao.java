package com.techelevator.dao;

import com.techelevator.Pizza.model.Pizza;
//has to be imported because it's in a different package

public interface PizzaDao {
    //what can we do w pizzas

    void createPizza(Pizza pizza);

}
