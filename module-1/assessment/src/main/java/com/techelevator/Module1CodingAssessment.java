package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// what is the difference between main/Main
public class Module1CodingAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File carFile = new File("CarInput.csv");


		try (Scanner scanner = new Scanner(carFile)){
			int totalCarAge = 0;
			while (scanner.hasNextLine()) {

				String lineOfInput = scanner.nextLine();
				String[] arrayString = lineOfInput.split(",");

				int yearOfCar = Integer.parseInt(arrayString[0]);
				String makeOfCar = arrayString[1];
				Boolean isAClassicCar = Boolean.parseBoolean(arrayString[2]);

				Car car = new Car (yearOfCar, makeOfCar, isAClassicCar);
				System.out.println(car);

				LocalDateTime date = LocalDateTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
				String todayStr = date.format(formatter);
				Integer today = Integer.parseInt(todayStr);
				int age = today - yearOfCar;

				totalCarAge = totalCarAge + age;

			}
			System.out.println("");
			System.out.println(totalCarAge + " total years of age.");
		} catch (FileNotFoundException fnf) {
			System.out.println("File not found");
		} catch (Exception e) {
			System.out.println("Error");
		}



	}
}