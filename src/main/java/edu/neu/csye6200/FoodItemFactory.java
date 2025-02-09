package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class FoodItemFactory {
	
	public static List<FoodItem> createItemsFromCSV(String fileName) {
		List<FoodItem> foodItems = new ArrayList<>();
        for (String line : FileUtil.readCSV(fileName)) {
            foodItems.add(new FoodItem(line));
        }
        return foodItems;
    }

}
