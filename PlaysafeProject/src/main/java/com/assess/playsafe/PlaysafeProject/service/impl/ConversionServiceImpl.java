package com.assess.playsafe.PlaysafeProject.service.impl;

import com.assess.playsafe.PlaysafeProject.service.ConversionService;

public class ConversionServiceImpl implements ConversionService {

	public double kelvinToCelcius(double kelvin) {

		double celcius = kelvin - 273.0;
		
		return celcius;
	}

	public double poundsToKilograms(double pounds) {
		double kilo = pounds * 0.45;
		
		return kilo;
	}

	public double milesToKilometers(double miles) {
		double kilometers = miles * 1.60934;
		
		return kilometers;
	}

	
	
	
}
