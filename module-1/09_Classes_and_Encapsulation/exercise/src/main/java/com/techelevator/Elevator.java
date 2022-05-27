package com.techelevator;

public class Elevator {
    private int currentFloor = 1;
    private int numberOfFloors;
    private boolean doorOpen = false;

    public Elevator(int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void openDoor(){
            doorOpen = true;
    }
    public void closeDoor(){
            doorOpen = false;
    }
    public void goUp(int desiredFloor){
        if(!doorOpen){
            if(desiredFloor > currentFloor && desiredFloor <= numberOfFloors) {
                currentFloor = desiredFloor;
            }
        }
    }

    public void goDown(int desiredFloor){
        if(!doorOpen){
            if(desiredFloor < currentFloor && desiredFloor > 0){
                currentFloor = desiredFloor;
            }
        }
    }
}

