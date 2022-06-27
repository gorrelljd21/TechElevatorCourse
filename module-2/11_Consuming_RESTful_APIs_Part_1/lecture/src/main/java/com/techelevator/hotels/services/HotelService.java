package com.techelevator.hotels.services;

import com.techelevator.hotels.model.Hotel;
import com.techelevator.hotels.model.Review;
import com.techelevator.hotels.model.StarWarsMovie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private static final String API_BASE_URL = "http://localhost:3000/";
    private final RestTemplate restTemplate = new RestTemplate(); //used to handle all client-server communication, handle request,
    // and turn JSON to string.
    // this is all client code, server is on port 3000

    public Hotel[] listHotels() {
        String endpointUrl = API_BASE_URL + "hotels";
        Hotel[] hotels = restTemplate.getForObject(endpointUrl, Hotel[].class);
        return hotels;
    }
// when use getObject, you lose all response information (headers, etc)

    public Review[] listReviews() {
//        String endpointUrl = API_BASE_URL + "reviews";
//        Review[] reviews = restTemplate.getForObject(endpointUrl, Review[].class);
//        return reviews;
        String endpointUrl = API_BASE_URL + "reviews";
        ResponseEntity<Review[]> response = restTemplate.getForEntity(endpointUrl, Review[].class);

        System.out.println(response.getStatusCode());

        return response.getBody();
    }
    //getforentity returns response information
    //based off API and per documentation to tell you when you need to get all information
    //authentication

    public Hotel getHotelById(int id) {
        String endpointUrl = API_BASE_URL + "hotels/" + id;
        return restTemplate.getForObject(endpointUrl, Hotel.class);
    } //not getting an array, just one object
    // take JSON and map everything across = hotel.class

    public Review[] getReviewsByHotelId(int hotelID) {
        String endpointUrl = API_BASE_URL + "hotels/" + hotelID + "/reviews";
        return restTemplate.getForObject(endpointUrl, Review[].class);
    }

    public Hotel[] getHotelsByStarRating(int stars) {
        return null;
    }

    public StarWarsMovie getWithCustomQuery(){
        return restTemplate.getForObject("https://swapi.dev/api/films/1", StarWarsMovie.class);
    }

}
