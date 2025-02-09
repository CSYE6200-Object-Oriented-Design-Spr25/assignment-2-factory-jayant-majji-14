package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ServiceItemFactory {
	
	private static final ServiceItemFactory instance = new ServiceItemFactory();

    private ServiceItemFactory() {}

    public static ServiceItemFactory getInstance() {
        return instance;
    }
    
    public List<ServiceItem> createItemsFromCSV(String fileName) {
        List<ServiceItem> items = new ArrayList<>();
        for (String line : FileUtil.readCSV(fileName)) {
            items.add(new ServiceItem(line));
        }
        return items;
    }

}
