package ru.itpark;

import ru.itpark.model.House;
import ru.itpark.service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseService service = new HouseService();
        service.houses.add(new House(1, "Купить", "квартира",
                "Новостройка", 2, 35, 2_500_000, "Приволжский"));
        service.houses.add(new House(2, "Снять", "квартира",
                "Новостройка", 1, 42, 15_000, "Кировский"));
        service.houses.add(new House(3, "Купить", "дом",
                "Вторичка", 3, 100, 5_500_000, "Кировский"));

        System.out.println(service.searchForDistrict("снять", "кировский"));
        System.out.println(service.searchByPrice("Купить", 2_000_000, 2_600_000));
        System.out.println(service.searchByPrice("Снять", 5_000, 15_000));
    }
}
