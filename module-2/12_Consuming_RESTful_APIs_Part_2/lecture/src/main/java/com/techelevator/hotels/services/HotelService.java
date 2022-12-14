package com.techelevator.hotels.services;

import com.techelevator.hotels.model.Hotel;
import com.techelevator.hotels.model.Reservation;
import com.techelevator.util.BasicLogger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;


public class HotelService {

    private static final String API_BASE_URL = "http://localhost:3000/";
    private final RestTemplate restTemplate = new RestTemplate();

    /**
     * Create a new reservation in the hotel reservation system
     */
    public Reservation addReservation(Reservation newReservation) { //populated model object
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON); //setting the header
        HttpEntity<Reservation> httpEntity = new HttpEntity<>(newReservation, headers);  //gonna have a reservation in it

        Reservation result = null; //make null so it has some value and allows for result to stay in scope

        try {
            result = restTemplate.postForObject(API_BASE_URL + "reservation", httpEntity, Reservation.class);
        } catch (ResourceAccessException rae){ //couldn't get there
            BasicLogger.log("Error connecting to server. Msg: " + rae.getMessage());
        } catch (RestClientResponseException rcre) {
            BasicLogger.log("Error response. Status: " + rcre.getStatusText() + " Msg: " + rcre.getMessage()); //something wrong w conversation
        }
        //where are we sending this, entity, send a reservation in, get a reservation back
        return result;
    }

    /**
     * Updates an existing reservation by replacing the old one with a new
     * reservation
     */
    public boolean updateReservation(Reservation updatedReservation) {
        String endpointUrl = API_BASE_URL + "reservations/" + updatedReservation.getId();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Reservation> httpEntity = new HttpEntity<>(updatedReservation, headers);

//        try{
//            restTemplate.put(endpointUrl, httpEntity);
//        } catch (ResourceAccessException rae){
//            BasicLogger.log("Error connecting to server. Msg: " + rae.getMessage());
//        } catch (RestClientResponseException rcre) {
//            BasicLogger.log("Error response. Status: " + rcre.getStatusText() + " Msg: " + rcre.getMessage());
//        }
        try {
            restTemplate.put(endpointUrl, httpEntity);
            return true;
        } catch (ResourceAccessException | RestClientResponseException e) {
            BasicLogger.log(e.getMessage()); //condensed version, they don't have to be related
            return false;
        }
    }

    /**
     * Delete an existing reservation
     */
    public boolean deleteReservation(int id) {
        String endpointUrl = API_BASE_URL + "reservations/" + id;

        try {
            restTemplate.delete(endpointUrl);
            return true;
        } catch (ResourceAccessException | RestClientResponseException e) {
            BasicLogger.log(e.getMessage());
            return false;
        }
    }

    /* DON'T MODIFY ANY METHODS BELOW */

    /**
     * List all hotels in the system
     */
    public Hotel[] listHotels() {
        Hotel[] hotels = null;
        try {
            hotels = restTemplate.getForObject(API_BASE_URL + "hotels", Hotel[].class);
        } catch (RestClientResponseException e) {
            // handles exceptions thrown by rest template and contains status codes
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            // i/o error, ex: the server isn't running
            BasicLogger.log(e.getMessage());
        }
        return hotels;
    }

    /**
     * List all reservations in the hotel reservation system
     */
    public Reservation[] listReservations() {
        Reservation[] reservations = null;
        try {
            reservations = restTemplate.getForObject(API_BASE_URL + "reservations", Reservation[].class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return reservations;
    }

    /**
     * List all reservations by hotel id.
     */
    public Reservation[] listReservationsByHotel(int hotelId) {
        Reservation[] reservations = null;
        try {
            reservations = restTemplate.getForObject(API_BASE_URL + "hotels/" + hotelId + "/reservations", Reservation[].class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return reservations;
    }

    /**
     * Find a single reservation by the reservationId
     */
    public Reservation getReservation(int reservationId) {
        Reservation reservation = null;
        try {
            reservation = restTemplate.getForObject(API_BASE_URL + "reservations/" + reservationId, Reservation.class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return reservation;
    }

}