package com.springOne.demoPkg.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //when found multiple dependency use this or Qualifier
public class MarioGame implements GamingConsole{
	
	public void up() {
		System.out.print("Mario ");
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Go Down");
	}
	
	public void left() {
		System.out.println("Go back");
	}
	
	public void right() {
		System.out.println("Accelerate");
	}
}
