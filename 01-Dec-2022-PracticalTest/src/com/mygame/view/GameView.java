package com.mygame.view;
import com.mygame.dao.GameDAO;
import com.mygame.service.GameService;

public class GameView {
	GameService gameservice;
	
	
	GameView gameview=new GameView();
	
	public void displaycityNamesWithBlanks() {
		gameservice.getCityNamesService();
		double ra;
		ra=Math.random();
		System.out.println("_");
		
		
		
	}
	
	

}
