package com.mygame.service;
import com.mygame.dao.GameDAO;

public class GameService {
	
	GameDAO gameDao;
	
	GameService gameservice=new GameService();
	
	public String[] getCityNamesService() {
		
		String cityName[]=gameDao.getCityName();
		
		
		return cityName;
	}
	

}
