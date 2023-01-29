package com.springOne.demoPkg.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;
	
	public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) { //autowiring by constructor
		//directly specifying a specific bean
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: "+game);
		game.down();
		game.left();
		game.right();
		game.up();
	}
}
