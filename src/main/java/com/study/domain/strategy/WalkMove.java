package com.study.domain.strategy;

public class WalkMove implements MoveStrategy {
    public void move() {
        System.out.println("Started walk to the destination");
    }
}
