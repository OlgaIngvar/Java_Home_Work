package src.main.java.org.example;

import src.main.java.org.example.Object1.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Items item1 = new Items("Макароны", 55.1, 2);
        Items item2 = new Items("Каша", 49.88, 1);
        Items item3 = new Items("Мука высший сорт", 60.2, 4);
        Items item4 = new Items("Омары высший сорт", 443.77, 1);
        Items item5 = new Items("Соль гималайская высший сорт", 39.0, 2);
        Items item6 = new Items("Соль", 10.2, 2);
        Items item7 = new Items("Раки", 100.0, 2);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);
        itemsList.add(item6);
        itemsList.add(item7);

        String searchName = "высший";
        Double maxPrice = 0.0;
        String maxPriceSortedNames = "";

        for (Items items : itemsList) {
            if (items.getName().toLowerCase().contains(searchName) && (items.getSort() == 1 || items.getSort() == 2)) {
                if (maxPrice < items.getPrice()) {
                    maxPrice = items.getPrice();
                }
            }
        }

        for (Items items : itemsList) {
            if (items.getName().toLowerCase().contains(searchName) && (items.getSort() == 1 || items.getSort() == 2)) {
                if (Objects.equals(items.getPrice(), maxPrice)) {

                    maxPriceSortedNames += items.getName() + "\n";
                }
            }
        }
        System.out.println("Самые дорогие товары первого и второго сорта, в названии которых есть слово 'высший': ");
        System.out.println(maxPriceSortedNames);
        System.out.println("Максимальная цена: " + maxPrice);
    }
}