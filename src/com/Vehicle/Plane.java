package com.Vehicle;

public class Plane implements Vehicle{
    public void setDataBaseOperation(DataBaseOperation dataBaseOperation) {
        this.dataBaseOperation = dataBaseOperation;
    }

    private DataBaseOperation dataBaseOperation;
    @Override
    public void storeVehicle() {
        dataBaseOperation.storeVehicleIntoDataBase("Plane");

    }
}
