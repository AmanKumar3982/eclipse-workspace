package com._Aman.learn_spring_framework.example.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com._Aman.learn_spring_framework.game.GameRunner;
import com._Aman.learn_spring_framework.game.gaming_cansole;
@Component
class YourBussinessclass {
	@Autowired
	Dependency1 dependency1;
	@Autowired
	Dependency2 dependency2;
	public String toString() {
		return "using + "+ dependency1 +" + and + "+dependency2;
		
	}
}
@Component
class  Dependency1{
	
}
@Component
class Dependency2{
	
}
@Configuration
@ComponentScan
public class DepInjectionlauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectionlauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBussinessclass.class));
            
            
        }
    }
}
//package com._Aman.learn_spring_framework;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Scanner;
//
//@Configuration
//@ComponentScan("com._Aman.learn_spring_framework.game")
//public class GamingApplauncherApplication {
//
//    public static void main(String[] args) {
//        try (var context = new AnnotationConfigApplicationContext(GamingApplauncherApplication.class)) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter the game to run (pacman/marioGame): ");
//            String gameChoice = scanner.nextLine();
//
//            // Pass user input to GameRunner
//            GameRunner gameRunner = context.getBean(GameRunner.class);
//            gameRunner.setGameChoice(gameChoice); // Set the game based on input
//            gameRunner.run();
//        }
//    }
//}
