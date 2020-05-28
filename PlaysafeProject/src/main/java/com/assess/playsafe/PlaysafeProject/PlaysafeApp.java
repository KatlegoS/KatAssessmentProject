package com.assess.playsafe.PlaysafeProject;

import com.assess.playsafe.PlaysafeProject.service.ConversionService;
import com.assess.playsafe.PlaysafeProject.service.impl.ConversionServiceImpl;


public class PlaysafeApp 
{
    public static void main( String[] args )
    {
    	ConversionService conversionService = new ConversionServiceImpl();
    	
    	double myKelvinValue = 3;
    	double myMilesValue = 7;
		double myPoundsValue = 9;

		System.out.println("Kelvin to Celcius: " + conversionService.kelvinToCelcius(myKelvinValue ));
		System.out.println("Miles to Kilometers: " + conversionService.milesToKilometers(myMilesValue));
		System.out.println("Pounds to Kilograms: " + conversionService.poundsToKilograms(myPoundsValue));
		
		
        System.out.println( "Playsafe application ran successfully..." );
    }
}
