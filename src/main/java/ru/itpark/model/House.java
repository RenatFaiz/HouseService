package ru.itpark.model;

public class House {
    private long id;
    private String buyType;
    private String category;
    private String houseType;
    private int rooms;
    private int price;
    private String area;
    // private String image;


    public House(long id, String buyType, String category,
                 String houseType, int rooms, int price, String area) {
        this.id = id;
        this.buyType = buyType;
        this.category = category;
        this.houseType = houseType;
        this.rooms = rooms;
        this.price = price;
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public String getArea() {
        return area;
    }

    public String getBuyType() {
        return buyType;
    }

    public String getCategory() {
        return category;
    }

    public int getRooms() {
        return rooms;
    }
}
