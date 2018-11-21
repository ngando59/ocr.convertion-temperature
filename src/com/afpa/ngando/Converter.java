package com.afpa.ngando;

import java.util.Scanner;

public class Converter {
	static Scanner sc = new Scanner(System.in);
	/**
	 * Convert temperature Celsius on Fahrenheit
	 * @param celsius The temperature on celsius to convert
	 * @return the temperature on Fahrenheit
	 * */
	public float convertToFahrenheit(float celsius) {
		return ((9 * celsius) / 5) + 32;
	}
	/**
	 * Display the convertion of temperature Celsius on Fahrenheit
	 * @param celsius The temperature on celsius to convert
	 * */
	public void displayConvertionCelsiusToFahrenheit(float celsius) {
		float fahrenheit = convertToFahrenheit(celsius);
		System.out.println(celsius+" °C correspond à : "+fahrenheit+" °F.");
	}
	/**
	 * Convert temperature Fahrenheit on Celsius
	 * @param fahrenheit The temperature on Fahrenheit to convert
	 * @return the temperature on Selsius
	 * */
	public float convertToCelsius(float fahrenheit) {
		return ((fahrenheit - 32) * 5) / 9;
	}
	/**
	 * Display the convertion of temperature Fahrenheit on Celsius
	 * @param fahrenheit The temperature on fahrenheit to convert
	 * */
	public void displayConvertionFahrenheitToCelsius(float fahrenheit) {
		float celsius = convertToCelsius(fahrenheit);
		System.out.println(fahrenheit+" °F correspond à : "+celsius+" °C.");
	}
	/**
	 * Display all convertion possible
	 */
	public void displayConvertChoise() {
		System.out.println("Choississez le mode de convertion : ");
		System.out.println("1 - Convertisseur Celsius - Fahrenheit");
		System.out.println("2 - Convertisseur Fahrenheit - Celsius");
		System.out.print("=> ");
	}
	/**
	 * ask the mode of convertion, the temperature to convert
	 * and display the convertion
	 *  
	 * */
	public void displayConverter() {
		this.displayConvertChoise();
		int choise = sc.nextInt();
		System.out.println("Température à convertir : ");
		System.out.print("=> ");
		float temperature = sc.nextFloat();
		
		switch (choise) {
			case 1 :
				this.displayConvertionCelsiusToFahrenheit(temperature);
				break;
			case 2 :
				this.displayConvertionFahrenheitToCelsius(temperature);
				break;
			default:
				System.out.println("Choix incorrect !");
				break;
		}
	}
}
