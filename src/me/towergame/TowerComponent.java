package me.towergame;


import java.awt.*;

public class TowerComponent extends Canvas implements Runnable {

    private static final long serialVersionUID = 1L;
    private boolean running = false;
    public static final String NAME = "Tower of Death";


    public static final int WIDTH = 640, HEIGHT = 480;


    public TowerComponent() {

    }

    public void startGame() {
        running = true;
        new Thread(this).start();
    }

    public void endGame(){
        running = false;

    }

    @Override
    public void run() {

        int fps = 0, tick = 0;
        double fpsTimer = System.currentTimeMillis();



    }


    public static void main(String[] args) {

    }

}
