package com.calculator.test;

import android.widget.EditText;

import com.calculator.R;
import com.jayway.android.robotium.solo.Solo;

public class MainPage {
	
	private Solo solo;
	
	public MainPage(Solo solo) {
		this.solo = solo;
	}
	
	public void enterFirstNumber(double num) {
		EditText editText01 = (EditText) solo.getView(R.id.EditText01);
		solo.enterText(editText01, String.valueOf(num));
	}
	
	public void enterSecondNumber(double num) {
		EditText editText02 = (EditText) solo.getView(R.id.EditText02);
		solo.enterText(editText02, String.valueOf(num));
	}
	
	public void clickMultiply() {
		solo.clickOnButton("Multiply");
		
	}
	
	public void multiply(double num1, double num2) {
		enterFirstNumber(num1);
		enterSecondNumber(num2);
		
		clickMultiply();
	}

}
