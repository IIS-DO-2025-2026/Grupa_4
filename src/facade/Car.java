package facade;

public class Car {
	private int remoteCode = 1234;
	private String carKey = "šara";
	private boolean isRaining = true;
	private boolean previousState = false; //radio
	
	public int getRemoteCode() {
		return remoteCode;
	}
	
	public String getCarKey() {
		return carKey;
	}
	
	public boolean isRaining() {
		return isRaining;
	}
	
	public boolean isPreviousState() {
		return previousState;
	}
	
	
	

}
