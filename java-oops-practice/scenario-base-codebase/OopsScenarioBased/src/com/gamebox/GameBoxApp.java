package com.gamebox;

//main class for execution
public class GameBoxApp {

    //method for main execution
    public static void main(String[] args) {

        User user = new User("Anvesh");

        Game arcade = new ArcadeGame("Speed Racer", 499);
        Game strategy = new StrategyGame("War Planner", 799);

        arcade.playDemo();
        strategy.playDemo();

        user.buyGame(arcade, 20);
        user.buyGame(strategy, 30);

        user.showLibrary();
    }
}
