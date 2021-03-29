package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	private String[] carToStringArray(Car car) {
		String[] carInfo = {car.getMake(), car.getModel(), Integer.toString(car.getYear())};
		return carInfo;
	}
	
	@Test
	void verifyCar() {
		String[] expected = {"ferrari", "abc", "2009"};
		Car actual = new Car("ferrari", "abc", 2009, 30, 70000);
		assertArrayEquals(expected, carToStringArray(actual) );
	}
}