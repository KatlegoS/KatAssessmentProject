package com.assess.playsafe.PlaysafeProject.service.impl;

import com.assess.playsafe.PlaysafeProject.service.ConversionService;

public class ConversionServiceImpl implements ConversionService {

	public double kelvinToCelcius(double kelvin) {

		if(kelvin != 0) {
		double celcius = kelvin - 273.0;
		return celcius;
	}else {
		throw new RuntimeException("Kelvin cannot be null or 0");
	}
	}

	public double poundsToKilograms(double pounds) {
		if(pounds != 0) {
		double kilo = pounds * 0.45;
		return kilo;
		}else {
			throw new RuntimeException("Pounds cannot be null or 0");
		}
	}

	public double milesToKilometers(double miles) {
		if(miles != 0) {
		double kilometers = miles * 1.60934;
		return kilometers;
		}else {
			throw new RuntimeException("Miles cannot be null or 0");
		}
	}

	
	
	
}
