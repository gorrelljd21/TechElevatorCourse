package com.techelevator;

public class Airplane {

    private String planeNumber = "";
    private int  totalFirstClassSeats = 0;
    private int  bookedFirstClassSeats = 0;
    private int  totalCoachSeats = 0;
    private int  bookedCoachSeats = 0;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableFirstClassSeats(){
        int availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
        return availableFirstClassSeats;
    }

    public int getAvailableCoachSeats() {
        int availableCoachSeats = totalCoachSeats - bookedCoachSeats;
        return availableCoachSeats;
    }

    public boolean reserveSeats (boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass && totalNumberOfSeats <= getAvailableFirstClassSeats()) {
            bookedFirstClassSeats += totalNumberOfSeats;
            return true;
        } else if (!forFirstClass && totalNumberOfSeats <= getAvailableCoachSeats()) {
            bookedCoachSeats += totalNumberOfSeats;
            return true;
        } else {
            return false;
        }
    }


//    If forFirstClass is true, add totalNumberOfSeats to the value for BookedFirstClassSeats.
//    If forFirstClass is false, add totalNumberOfSeats to the value for BookedCoachSeats.
//    It returns true if there were enough seats to make the reservation, otherwise it returns false and the number of booked seats doesn't change.
// I need to add total number of seat ^^^^^^^^^^^^^^^^^^^^^^
}
