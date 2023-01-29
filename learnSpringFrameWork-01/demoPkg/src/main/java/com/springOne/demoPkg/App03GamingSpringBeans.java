package com.springOne.demoPkg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springOne.demoPkg.game.GameRunner;
import com.springOne.demoPkg.game.GamingConsole;
import com.springOne.demoPkg.game.PacManGame;

public class App03GamingSpringBeans {


	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		
		context.getBean(GamingConsole.class).up();
		
		context.getBean(GameRunner.class).run();
	}
}
