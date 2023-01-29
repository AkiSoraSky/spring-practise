package com.springOne.demoPkg.game;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.print("PacMan ");
		System.out.println("Jump Up");
	}

	@Override
	public void down() {
		System.out.println("Bend");
	}

	@Override
	public void left() {
		System.out.println("back");
	}

	@Override
	public void right() {
		System.out.println("Forward");
	}
}
