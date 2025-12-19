package com.Vehicle;

public class Car implements Vehicle{
    public Car(DataBaseOperation dataBaseOperation) {
        this.dataBaseOperation = dataBaseOperation;
    }

    private DataBaseOperation dataBaseOperation;



    @Override
    public void storeVehicle() {
        dataBaseOperation.storeVehicleIntoDataBase("car");

    }
}
