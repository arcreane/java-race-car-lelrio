package devgarage09;

import java.util.*;
import java.util.Scanner;

public class speedCars {
	int speed;
	int NbWheels;
	int Motor;
	int SteeringWheel;
	int Brakes;
	private static Scanner repare;

	public speedCars() {
		super();
		this.speed = 100;
		this.NbWheels = 4;
		this.Motor = 1;
		this.SteeringWheel = 1;
		this.Brakes = 1;
	}

	public int getSpeed() {
		return speed;
	}

	void BreakCar() {
		repare = new Scanner(System.in);
		Random rand = new Random();
		String reparated;
		int rand_int1 = rand.nextInt(3);

		switch (rand_int1) {
		case 0:
			NbWheels = 0;
			System.out.println("tu as cassé tes roux tape vite le mot roux, écris vite roux");

			reparated = repare.next();
			while (!reparated.equals("roux")) {
				reparated = repare.next();
			}

			break;

		case 1:
			Motor = 0;
			System.out.println("tu as cassé tes motor tape vite le mot motor, écris vite moteur");
			reparated = repare.next();
			while (!reparated.equals("moteur")) {
				reparated = repare.next();

			}

			break;

		case 2:
			SteeringWheel = 0;
			System.out.println("tu as cassé ton volant tape vite le mot volant, écris vite volant");
			reparated = repare.next();
			while (!reparated.equals("volant")) {
				reparated = repare.next();
			}

			break;

		case 3:
			Brakes = 0;
			System.out.println("tu as cassé tes freins tape vite le mot freins, écris vite freins");
			reparated = repare.next();
			while (!reparated.equals("freins")) {
				reparated = repare.next();
			}

			break;
		}
	}
}
