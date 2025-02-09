package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Store extends AbstractStore {
    
	@Override
    public void loadItems() {
        items.addAll(FoodItemFactory.createItemsFromCSV("FoodItemCSV.txt"));
        items.addAll(ElectronicItemFactory.getInstance().createItemsFromCSV("ElectronicItemCSV.txt"));
        items.addAll(ServiceItemFactory.getInstance().createItemsFromCSV("ServiceItemCSV.txt"));
    }

	@Override
    public void demo() {
        System.out.println("All Items:");
        items.forEach(System.out::println);

        // Sorting items by ID
        items.sort(Comparator.comparing(Item::getId));
        System.out.println("\nSorted Items by ID:");
        items.forEach(System.out::println);

        // Sorting items by Name
        items.sort(Comparator.comparing(Item::getName));
        System.out.println("\nSorted Items by Name:");
        items.forEach(System.out::println);

        // Sorting items by Price
        items.sort(Comparator.comparing(Item::getPrice));
        System.out.println("\nSorted Items by Price:");
        items.forEach(System.out::println);
    }
}
