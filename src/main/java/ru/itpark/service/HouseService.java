package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    public List<House> houses = new ArrayList<>();

    public List<House> searchForDistrict(String buyType, String district) {
        if (buyType.isEmpty() && district.isEmpty()) {
            throw new IllegalArgumentException("Введите название района и тип");
        }
        List<House> results = new ArrayList<>();
        for (House house : houses) {
            if (house.getBuyType().toLowerCase().equalsIgnoreCase(buyType) &&
                    house.getDistrict().toLowerCase().equalsIgnoreCase(district)) {
                results.add(house);
            }
        }
        return results;
    }

    public List<House> searchByPrice(String buyType, int minPrice, int maxPrice) {
        if (buyType.isEmpty()) {
            throw new IllegalArgumentException("Введите тип: купить или снять");
        }
        if (minPrice < 0 && maxPrice <= 0) {
            throw new IllegalArgumentException("Неверный диапазон цен");
        }
        List<House> results = new ArrayList<>();

        for (House house : houses) {
            boolean isCondition = house.getBuyType().toLowerCase().equalsIgnoreCase(buyType);
            boolean isPrice = house.getPrice() >= minPrice && house.getPrice() <= maxPrice;

            if (!isCondition) {
                continue;
            }
            if (isPrice) {
                results.add(house);
            }
        }
        return results;
    }
}