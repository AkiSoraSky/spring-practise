package com.springOne.demoPkg.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier") //a specific bean autowired
public class SuperContra implements GamingConsole{

	@Override
	public void up() {
		System.out.print("SuperContra ");
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("down");
	}

	@Override
	public void left() {
		System.out.println("left");
	}

	@Override
	public void right() {
		System.out.println("Forward");
	}
	
}
