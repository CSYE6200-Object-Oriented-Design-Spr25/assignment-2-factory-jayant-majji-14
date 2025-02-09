package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractStore {

    
	protected List<Item> items = new ArrayList<>();

    public abstract void loadItems();
    public abstract void demo();
}
