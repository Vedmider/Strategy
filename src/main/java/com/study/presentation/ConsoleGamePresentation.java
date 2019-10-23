package com.study.presentation;

import com.study.domain.CharacterType;
import com.study.domain.GameCharacter;
import com.study.domain.strategy.FlyMove;
import com.study.domain.strategy.MagicFlyMove;
import com.study.domain.strategy.WalkAndFlyMove;
import com.study.domain.strategy.WalkMove;

import java.util.Scanner;

public class ConsoleGamePresentation {

    public static void main(String[] args) {
        System.out.println("Hello!\n" +
                "This is console game presentation\n" +
                "Please choose number of your character:\n" +
                "1 - ORK \n" +
                "2 - ELF\n" +
                "3 - HUMAN \n" +
                "4 - TROLL\n" +
                "5 - Vampire \n" +
                "6 - PEGASUS");
        initiateGameCharacter();
    }

    private static void initiateGameCharacter() {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int characterNumber;
        GameCharacter gameCharacter;

        while (i > 0) {
            characterNumber = Integer.parseInt(scanner.nextLine());
            switch (characterNumber) {
                case 1:
                    gameCharacter = new GameCharacter(CharacterType.ORK, new WalkMove());
                    gameCharacter.moveAction();
                    i = -1;
                    break;
                case 2:
                    gameCharacter = new GameCharacter(CharacterType.ELF, new WalkMove());
                    gameCharacter.moveAction();
                    i = -1;
                    break;
                case 3:
                    gameCharacter = new GameCharacter(CharacterType.HUMAN, new MagicFlyMove());
                    gameCharacter.moveAction();
                    i = -1;
                    break;
                case 4:
                    gameCharacter = new GameCharacter(CharacterType.TROLL, new WalkMove());
                    gameCharacter.moveAction();
                    i = -1;
                    break;
                case 5:
                    gameCharacter = new GameCharacter(CharacterType.VAMPIRE, new WalkAndFlyMove());
                    gameCharacter.moveAction();
                    i = -1;
                    break;
                case 6:
                    gameCharacter = new GameCharacter(CharacterType.PEGASUS, new FlyMove());
                    gameCharacter.moveAction();
                    i = -1;
                    break;
                default:
                    System.out.println("Wrong choose, try again");
            }
        }

    }
}
