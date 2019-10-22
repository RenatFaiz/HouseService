package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    public List<House> houses = new ArrayList<>();


    public List<House> searchForDistrict(String text) {

        for (House house : houses) {
            boolean checkText = house.getDistrict().toLowerCase()
                    .contains(text.toLowerCase());

            if (house.getBuyType().equals("Снять") && checkText) {
                house.printInfo();
                house.printRentPrice();
            }

            if (house.getBuyType().equals("Купить") && checkText) {
                house.printInfo();
                house.printBuyPrice();
            }
        }
        return houses;
    }

    public List<House> searchByPrice(String buyType, int minPrice, int maxPrice) {

        for (House house : houses) {
            if (buyType.equals("Купить") && house.getPrice() <= maxPrice
                    && house.getPrice() > minPrice) {
                house.printInfo();
                house.printBuyPrice();
            }
            if (buyType.equals("Снять") && house.getPrice() <= maxPrice
                    && house.getPrice() > minPrice) {
                house.printInfo();
                house.printRentPrice();
            }
        }
        return houses;
    }
}
