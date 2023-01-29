package com.springOne.demoPkg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springOne.demoPkg.game.GameRunner;
import com.springOne.demoPkg.game.GamingConsole;
import com.springOne.demoPkg.game.PacManGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		return new PacManGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
}
