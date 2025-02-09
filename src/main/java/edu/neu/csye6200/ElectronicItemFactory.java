package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ElectronicItemFactory {
	
	private static ElectronicItemFactory instance;
	
	private ElectronicItemFactory() {}
	
	public static ElectronicItemFactory getInstance() {
        if (instance == null) {
            instance = new ElectronicItemFactory();
        }
        return instance;
    }
	
	public List<ElectronicItem> createItemsFromCSV(String fileName) {
        List<ElectronicItem> items = new ArrayList<>();
        for (String line : FileUtil.readCSV(fileName)) {
            items.add(new ElectronicItem(line));
        }
        return items;
    }

}
