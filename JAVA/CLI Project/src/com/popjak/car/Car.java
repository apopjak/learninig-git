package com.popjak.car;

import java.util.Objects;

public class Car {
    private final String spz;
    private final String znacka;
    private final String model;
    private final int rocnik;
    private final String engineType;
    private final String najomNaDenCena;

    public Car(String spz, String znacka, String model, int rocnik, String engineType, String najomNaDenCena) {
        this.spz = spz;
        this.znacka = znacka;
        this.model = model;
        this.rocnik = rocnik;
        this.engineType = engineType;
        this.najomNaDenCena = najomNaDenCena;
    }

    @Override
    public String toString() {
        return  spz +
                "," + znacka +
                "," + model +
                "," + rocnik +
                "," + engineType +
                "," + najomNaDenCena + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return rocnik == car.rocnik && Objects.equals(znacka, car.znacka) && Objects.equals(model, car.model) && engineType == car.engineType && Objects.equals(spz, car.spz) && Objects.equals(najomNaDenCena, car.najomNaDenCena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(znacka, model, rocnik, engineType, spz, najomNaDenCena);
    }



}
