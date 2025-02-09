package edu.neu.csye6200;

public class ServiceItem extends Item {
	
	private String serviceDuration;
	
	public ServiceItem(String csv) {
		
		super(
				Integer.parseInt(csv.split(",")[0]),
	            csv.split(",")[1],
	            Double.parseDouble(csv.split(",")[2])
	        );
        this.serviceDuration = csv.split(",")[3];
	} 

	@Override
    public String toString() {
        return "ServiceItem [ID=" + id + ", Name=" + name + ", Price=" + price + 
               ", Service Durration=" + serviceDuration + " months]";
    }
		
		
		
	}
