package com.techelevator.reservations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelReservationsApplication {

    public static void main(String[] args) { //passes controll to the Spring Application
        SpringApplication.run(HotelReservationsApplication.class, args); //Spring Application - never stops until you kill 'em
    }
}
