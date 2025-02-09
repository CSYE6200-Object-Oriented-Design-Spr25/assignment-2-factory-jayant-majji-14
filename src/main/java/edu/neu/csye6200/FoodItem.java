package edu.neu.csye6200;

public class FoodItem extends Item {
	
	private String expirationDate;
	
	public FoodItem(String csv) {		
		super(
				Integer.parseInt(csv.split(",")[0]),
	            csv.split(",")[1],
	            Double.parseDouble(csv.split(",")[2])
	        );
        this.expirationDate = csv.split(",")[3];
        }

	@Override
	public String toString() {
		return "FoodItem [ID=" + id + ", Name=" + name + ", Price=" + price + ", Expiration Date=" + expirationDate + " days]";
	}
	

}
