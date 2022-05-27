package com.techelevator;

public class Elevator {
    public int currentFloor = 0;
    public int numberOfFloors = 0;
    public boolean doorOpen = false;

    public Elevator(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getCurrentFloor() {
        return currentFloor = 1;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void openDoor(){
        if(!doorOpen) {
            doorOpen = true;
        }
    }
    public void closeDoor(){
        if(doorOpen){
            doorOpen = false;
        }
    }
    public void goUp(int desiredFloor){
        if(doorOpen){
            if(getCurrentFloor() < getNumberOfFloors()) {
                desiredFloor = (desiredFloor - currentFloor) + currentFloor;
            }
        }
    }

    public void goDown(int desiredFloor){
        if(doorOpen){
            if(getCurrentFloor() < getNumberOfFloors()){
                desiredFloor = (currentFloor - desiredFloor) - currentFloor;
            }
        }
    }
}

//        goUp(int desiredFloor) sends the elevator upward to the desired floor as long as the door isn't open. The elevator can't go past the last floor.
//        goDown(int desiredFloor) sends the elevator downward to the desired floor as long as the door isn't open. It can't go past floor one.
