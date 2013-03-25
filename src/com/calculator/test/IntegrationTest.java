package com.calculator.test;

import java.util.ArrayList;
import java.util.Iterator;

import android.view.KeyEvent;
import android.view.View;

import com.calculator.Main;

public class IntegrationTest extends MainTest<Main> {
	
	private MainPage mainPage;
		
	public IntegrationTest() {
		super(Main.class);
	}
	
	public void Alarme() throws InterruptedException {
		mainPage = new MainPage(solo);
		
		mainPage.enterFirstNumber(0);
		//solo.goBack();
		System.out.println("Antes");
		
		//EH ISSO QUE A GENTE QUER QUE FUNCIONE
		solo.sendKey(KeyEvent.KEYCODE_HOME);
		
		
		System.out.println("Depois");
		mainPage.enterSecondNumber(10);
		
		ArrayList<View> views = solo.getCurrentViews();
		Iterator<View> iterator = views.iterator();
		
				
		while (iterator.hasNext()) {
			System.out.println("description: " +iterator.next().getContentDescription());
		}
		
		
		
//		solo.sendKey(KeyEvent.KEYCODE_APP_SWITCH);
		
		
	}

}
