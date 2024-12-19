package com._Aman.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com._Aman.learn_spring_framework.game")
public class GamingApplauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingApplauncherApplication.class)) {
            context.getBean(GameRunner.class).run();
            context.getBean(gaming_cansole.class).up();
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
