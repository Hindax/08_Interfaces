
package com.cc.java;

import com.cc.java.bees.*;
import com.cc.java.birds.Bird;

public class App {
    
    public static void main(String[] args) {
    
        HoneyBee worker = new Worker();
        HoneyBee queen = new Queen(); 
        HoneyBee drone = new Drone(); 
        HoneyBee bird = new Bird();

        output(worker.doYourJob());
        output(queen.doYourJob());
        output(drone.doYourJob());
        output(bird.doYourJob());

        output("-----------------");

        output(worker.fly());
        output(queen.fly());
        output(drone.fly());
        output(bird.fly());




    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

