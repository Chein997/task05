package com.chein.task5.model.showroom;

import com.chein.task5.model.car.Car;

import java.util.ArrayList;
import java.util.List;

public class BmwSr extends Showroom{
    private List<Car> carList = new ArrayList<>();

    @Override
    public ShowroomBrand getBrand() {
        return ShowroomBrand.BMW_SHOWROOM;
    }

    @Override
    public void bringCar(Car car) {
        super.log("Загоняем машину в салон бмв");
        this.carList.add(car);
    }

    @Override
    public List<Car> getCars() {
        return this.carList;
    }

    @Override
    public void clearShowroom() {
        this.carList =  new ArrayList<>();
    }
}