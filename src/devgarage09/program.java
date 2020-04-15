package devgarage09;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;


public class program {
	private static Scanner choixCars;
	private static Scanner choixCarsColor;
	private static speedCars schumacher;
	private static slowCars lewishamilton;
	Timer timer = new Timer();

	public static void main(String[] args) {
		choixCars = new Scanner(System.in);
		choixCarsColor = new Scanner(System.in);
		int distance = 0;

		System.out.println(
				"Hello player ! What car would you like to play a fast one that can break tap f, or a slow one that can get turbo upgrade every 2 secs tap s");

		String Cars = choixCars.next();

		while (!Cars.equals("f") && !Cars.equals("s")) {
			System.out.println("Je n'ai pas compris votre choix ! on ta dit d'appuyer sur f ou s IDIOT");
			System.out.println(
					"Hello player ! What car would you like to play a fast one that can break tap f, or a slow one that can get turbo upgrade every 2 secs tap s");

			Cars = choixCars.next();
		}

		if (Cars.equals("f")) {
			System.out.println("Bien vu vous avez choisis une voiture rapide vous allez ptet gagner");

		} else if (Cars.equals("s")) {
			System.out.println("Bien vu frero vous avez choisis une voiture lente vous allez ptet gagner");

		}

		System.out.println("Okay then what color do you want you can choose blue tap b or red tap r");

		String CarsColor = choixCarsColor.next();

		while (!CarsColor.equals("b") && !CarsColor.equals("r")) {
			System.out.println("Choose blue or red don't be annoying man you can't choose anything else");
			System.out.println("Okay then what color do you want you can choose blue tap b or red tap r");

			Cars = choixCarsColor.next();
		}

		if (CarsColor.equals("b")) {
			System.out.println("you car is blue");
		} else if (CarsColor.equals("r")) {
			System.out.println("you car is red");
		}

		System.out.println("The race will begin now ");
		System.out.println("3");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("2");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("GOOOOOOOO !!!!!");

		Random rand = new Random();
		int randBreak;

		lewishamilton = new slowCars();
		schumacher = new speedCars();

		if (Cars.equals("f")) {
			while (distance < 50) {
				randBreak = rand.nextInt(100);
				if (randBreak < 60) {
					schumacher.BreakCar();
					System.out.println(distance);
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				distance += schumacher.getSpeed() / 20;
			}
		} else {
			while (distance < 50) {
				randBreak = rand.nextInt(100);

				if (randBreak < 30) {
					lewishamilton.Turbo();
					System.out.println("vous avez parcouru :" + distance);
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				distance += lewishamilton.getSpeed() / 10;

				lewishamilton.setSpeed(50);
				
			}

		}
		if(distance == 50) {
			System.out.println("La course est finis vous avez parcouru les 50km !");
		}

	}
}
