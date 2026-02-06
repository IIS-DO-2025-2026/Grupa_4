package adapter;

import hexagon.Hexagon;

public class TestAdapter {
	//private Hexagon hexagon;

	public static void main(String[] args) {
		/* Čvrsta veza između objekata i pojedinačnih klasa može biti problematična
		Car car = new Car();
		Plane plane = new Plane();
		Train train = new Train();
		Boat boat = new Boat();
		*/
		
		Vehicle car = new Car();
		Vehicle plane = new Plane();
		Vehicle train = new Train();
		//Vehicle boat = new Boat();
		Boat boat = new Boat();
		Vehicle boatAdapter = new BoatAdapter(boat);
		
		

	}

}
