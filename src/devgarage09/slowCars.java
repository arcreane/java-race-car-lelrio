package devgarage09;

import java.util.*;

public class slowCars {
	private static Scanner myTime;
	int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public slowCars() {
		super();
		this.speed = 50;
	}

	void Turbo() {

		myTime = new Scanner(System.in);
		System.out.println("écris vitesse");

		long startTime = System.nanoTime();

		String parts = myTime.next();

		long endTime = System.nanoTime();

		long diff = endTime - startTime;

		long diff1 = diff / 1000000;

		if (diff1 < 3000 && parts.equals("vitesse")) {
			System.out.println("bien joué tu vas vite !");
			this.speed = 120;
		}
	}

}
