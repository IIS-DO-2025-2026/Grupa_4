package facade;

public class Contact {
	private Car car;
	private String carKey;
	private String message;

	public Contact(Car car, String carKey) {
		this.car = car;
		this.carKey = carKey;
	}
	
	public boolean giveContract() {
		if(car.getCarKey() == carKey) {
			message = "brmbrmbrm";
			return true;
		} else {
			message = "Wrong key!";
			return false;
		}
	}

	public String getMessage() {
		return message;
	}
	
	

}
