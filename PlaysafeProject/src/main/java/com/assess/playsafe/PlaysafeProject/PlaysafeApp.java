package com.assess.playsafe.PlaysafeProject;

import com.assess.playsafe.PlaysafeProject.service.ConversionService;
import com.assess.playsafe.PlaysafeProject.service.impl.ConversionServiceImpl;

/**
 * Hello world!
 *
 */
public class PlaysafeApp 
{
    public static void main( String[] args )
    {
    	ConversionService conversionService = new ConversionServiceImpl();
    	
    	double myKelvin = 3;
    	double myMiles = 7;
		double myPounds = 9;

		System.out.println("Kelvin to Celcius: " + conversionService.kelvinToCelcius(myKelvin ));
		System.out.println("Miles to Kilometers: " + conversionService.milesToKilometers(myMiles));
		System.out.println("Pounds to Kilograms: " + conversionService.poundsToKilograms(myPounds));
		
		
        System.out.println( "Playsafe application ran successfully..." );
    }
}
