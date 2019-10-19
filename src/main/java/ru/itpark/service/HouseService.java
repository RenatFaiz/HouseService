package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    public List<House> houses = new ArrayList<>();

    public List<House> searchForArea(String text) {
        for (House house : houses) {
            if(text == house.getArea()) {
                System.out.println(house.getCategory() + " " + house.getPrice() + "руб. "
                        + house.getRooms() + " комнаты");
            }
        }
        return houses;
    }


}
