package com.inclass1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        TemperatureConverter converter = new TemperatureConverter();

        System.out.println("Temperature converter");
        System.out.println("1. F to C");
        System.out.println("2. C to F");
        System.out.println("3. K to C");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Fahrenheit: ");

            double fahrenheit = scanner.nextDouble();

            double celsius = converter.fahrenheitToCelsius(fahrenheit);

            System.out.println("Result: " + celsius + " C");

            if (converter.isExtremeTemperature(celsius)) {
                System.out.println("Extreme temperature.");
            }
        } else if (choice == 2) {
            System.out.print("Celsius: ");

            double celsius = scanner.nextDouble();

            double fahrenheit = converter.celsiusToFahrenheit(celsius);

            System.out.println("Result: " + fahrenheit + " F");

            if (converter.isExtremeTemperature(celsius)) {
                System.out.println("Extreme temperature.");
            }
        } else if (choice == 3) {
            System.out.print("Kelvin: ");

            double kelvin = scanner.nextDouble();

            double celsius = converter.kelvinToCelsius(kelvin);

            System.out.println("Result: " + celsius + " C");

            if (converter.isExtremeTemperature(celsius)) {
                System.out.println("Extreme temperature.");
            }
        }

        scanner.close();
    }
}
