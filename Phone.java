public class Phone {
	public String make; 
	public String model;
	public int quantity; 
	}

/*---------------------------------------------------------------*/	

Phone () {

	make = "Unknown";
	model = "Unknown";
	quantity = 2010; 
	}


	
Phone (String thisMake) {
	this (); 
	make = thisMake; 
	}







Phone (String thisMake, int thisYear) {
	make = thisMake;

	year = thisYear; 
	}

public String toString () {
	String desc = "Make: " + make + " Year: " + year;
	return desc;
	}
}  
