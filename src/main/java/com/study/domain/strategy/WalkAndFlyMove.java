package com.study.domain.strategy;

import java.util.Scanner;

public class WalkAndFlyMove implements MoveStrategy {
    public void move() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        int i = 1;
        System.out.println("Choose move type number: 1 - fly; 2 - walk");
        while (i > 0){
            inputNumber = Integer.parseInt(scanner.nextLine());
            if (inputNumber == 1){
                System.out.println("you started to fly");
                i = -1;
                break;
            } else if (inputNumber == 2){
                System.out.println("you started to walk");
                i = -1;
                break;
            } else {
                System.out.println("wrong choose, you will stay on the place");
                continue;
            }
        }
    }
}
