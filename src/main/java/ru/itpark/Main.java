package ru.itpark;

import ru.itpark.model.House;
import ru.itpark.service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseService service = new HouseService();
        service.houses.add(new House(1, "Купить", "Квартира",
                "Новостройка", 2, 2_500_000, "Приволжский"));
        service.houses.add(new House(2, "Снять", "Квартира",
                "Новостройка", 1, 15_000, "Ново-Савиновский"));
        service.houses.add(new House(3, "Купить", "Дом",
                "От собственников", 3, 5_500_000, "Кировский"));

       // System.out.println(service.houses);
        service.searchForArea("Кировский");
    }
}
