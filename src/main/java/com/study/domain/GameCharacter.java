package com.study.domain;

import com.study.domain.strategy.MoveStrategy;

public class GameCharacter {
    private CharacterType type;
    private MoveStrategy strategy;

    public GameCharacter(CharacterType type, MoveStrategy strategy){
        this.strategy = strategy;
        this.type = type;
    }

    public MoveStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(MoveStrategy strategy) {
        this.strategy = strategy;
    }

    public void moveAction(){
        strategy.move();
    }
}
