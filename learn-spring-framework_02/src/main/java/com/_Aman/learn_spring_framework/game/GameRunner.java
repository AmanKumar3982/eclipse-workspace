package com._Aman.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class GameRunner {
	private gaming_cansole game;
	@Autowired
//	public GameRunner(gaming_cansole game) {
//		this.game = game;
//	}
	public GameRunner(@Qualifier("MarioGameQualifier") gaming_cansole game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: "+ game );
		game.down();
		game.up();
		game.left();
		game.right();
	}
	
}

//package com._Aman.learn_spring_framework.game;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//@Component
//public class GameRunner {
//
//    private gaming_cansole game;
//
//    private final gaming_cansole pacman;
//    private final gaming_cansole marioGame;
//
//    @Autowired
//    public GameRunner(@Qualifier("pacman") gaming_cansole pacman, @Qualifier("marioGame") gaming_cansole marioGame) {
//        this.pacman = pacman;
//        this.marioGame = marioGame;
//    }
//
//    // Method to set game based on user input
//    public void setGameChoice(String gameChoice) {
//        if (gameChoice.equalsIgnoreCase("pacman")) {
//            this.game = pacman;
//        } else if (gameChoice.equalsIgnoreCase("marioGame")) {
//            this.game = marioGame;
//        } else {
//            System.out.println("Invalid choice, defaulting to Pacman.");
//            this.game = pacman;
//        }
//    }
//
//    public void run() {
//        System.out.println("Running game: " + game);
//        game.down();
//        game.up();
//        game.left();
//        game.right();
//    }
//}
//

//THIS PROCESS IS USED TO RUM BOTH THE GAME TOGATHER
//package com._Aman.learn_spring_framework.game;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

//@Component
//public class GameRunner {
//    private final gaming_cansole pacman;
//    private final gaming_cansole marioGame;
//
//    @Autowired
//    public GameRunner(Pacman pacman, MarioGame marioGame) {
//        this.pacman = pacman;
//        this.marioGame = marioGame;
//    }
//
//    public void run() {
//        // Running Pacman game
//        System.out.println("Running Pacman:");
//        pacman.down();
//        pacman.up();
//        pacman.left();
//        pacman.right();
//
//        // Running MarioGame game
//        System.out.println("\nRunning MarioGame:");
//        marioGame.down();
//        marioGame.up();
//        marioGame.left();
//        marioGame.right();
//    }
//}


