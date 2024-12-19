package com._Aman.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pacman implements gaming_cansole {
	public void up() {
		System.out.println("Move front");
	}

	@Override
	public void down() {
		System.out.println("move back");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void left() {
		System.out.println("move left");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void right() {
		System.out.println("move right");
		// TODO Auto-generated method stub
		
	}

}
