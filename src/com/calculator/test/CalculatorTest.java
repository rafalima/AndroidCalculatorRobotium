package com.calculator.test;

import com.calculator.Main;

public class CalculatorTest extends MainTest<Main> {

	private MainPage mainPage;
	
	public CalculatorTest() {
		super(Main.class);
	}
		
	public void happyPath() {
		double num1 = 10;
		double num2 = 23;
		String result = String.valueOf(num1*num2);
		
		mainPage = new MainPage(solo);
		mainPage.multiply(num1, num2);
		
		assertTrue(solo.searchText(result));
	}

}
