package ru.itpark.model;

public class House {
    private long id;
    private String buyType;
    private String category;
    private String houseType;
    private int rooms;
    private int area;
    private int price;
    private String district;

    public House(long id, String buyType, String category, String houseType,
                 int rooms, int area, int price, String district) {
        this.id = id;
        this.buyType = buyType;
        this.category = category;
        this.houseType = houseType;
        this.rooms = rooms;
        this.area = area;
        this.price = price;
        this.district = district;
    }

    public String getBuyType() {
        return buyType;
    }

    public int getPrice() {
        return price;
    }

    public String getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return rooms + "-комн. " + category + ", " + area + " м2 "
                + district + " район, цена " + price
                + " руб. (" + houseType + ") № объявл. " + id + "\n";
    }
}
