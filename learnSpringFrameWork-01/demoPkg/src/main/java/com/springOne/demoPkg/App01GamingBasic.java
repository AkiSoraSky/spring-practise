package com.springOne.demoPkg;

import com.springOne.demoPkg.game.GameRunner;
import com.springOne.demoPkg.game.PacManGame;

public class App01GamingBasic {

	public static void main(String[] args) {

//		var game = new SuperContra();
//		var game = new MarioGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}
