package com.study.domain.strategy;

public class FlyMove implements MoveStrategy {
    public void move() {
        System.out.println("Started to fly to the destination.");
    }
}
