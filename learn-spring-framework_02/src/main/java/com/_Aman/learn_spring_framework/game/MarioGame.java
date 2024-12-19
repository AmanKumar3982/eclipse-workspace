package com._Aman.learn_spring_framework.game;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGameQualifier")

public class MarioGame implements gaming_cansole {
	public void up() {
		System.out.println("jump");
		
	}
	public void down() {
		System.out.println("go into a hole");
		
	}
	public void left() {
		System.out.println("go back");
	}
	public void right() {
		System.out.println("Acclerate");
		
	}
}
