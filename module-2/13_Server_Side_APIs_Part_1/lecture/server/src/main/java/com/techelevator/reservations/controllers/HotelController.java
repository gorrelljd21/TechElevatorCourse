package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //tells spring, in here you'll find mappings. Otherwise, 404 not found is shown
public class HotelController {

    private HotelDao hotelDao; //interface
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET) //adding query params doesn't change the path. Parameters go in the list(!!)
    public List<Hotel> list(@RequestParam(required = false) String cityName,@RequestParam(required = false) String stateName) { //could do name = "state_name" if needed
        //put to false to make it so we aren't required to have these parameters ^^^^
        return hotelDao.list(cityName, stateName); //by doing this, had to update in MemoryHotel and HotelDao and MemoryReservationDao
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET) //{id} placeholder for actual value, PathVariables
    public Hotel get(@PathVariable int id) {
        return hotelDao.get(id);
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.GET) //method request is to tell what verb we want (GET, POST, etc)
    public List<Reservation> getReservations() { //no parameters because we are getting them all
        return reservationDao.findAll(); //this was found in ReservationDao to grab the method within that class
    }

    @RequestMapping(path = "/hotels/{hotelId}/reservations", method = RequestMethod.GET)
    public List<Reservation> getReservationsForHotelId(@PathVariable int hotelId){ //annotating a parameter method
        return reservationDao.findByHotel(hotelId);
    }



}
// query parameter "?hotel=2"
// path variabels not good when there are options to chose from