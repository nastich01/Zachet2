package com.example.openweathermap2.entity;

import java.util.ArrayList;

public class CitiesProvider {
    private static final ArrayList<City> cities;

    static {
        cities = new ArrayList<>();
        cities.add(new City("Sochi", 39.73, 43.6));
        cities.add(new City("Kazan", 49.13, 55.75));
        cities.add(new City("Moscow", 37.617568, 55.75154));
    }

    public static ArrayList<City> getCities() {
        return cities;
    }

    public static void deleteCity(City city) {
        cities.remove(city);
    }

    public static void addCity(City city) {
        cities.add(city);
    }
}
