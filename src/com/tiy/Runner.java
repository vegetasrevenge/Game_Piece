package com.tiy;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        GamePiece gamePiece = new GamePiece();

        Scanner scanner = new Scanner(System.in);
//

        if(gamePiece.frozen == false) {
            gamePiece.freeze();
//          System.out.println(gamePiece.getFrozen());
            System.out.println("You are frozen!");
        }
        if(gamePiece.frozen == true) {
            gamePiece.unfreeze();
            System.out.println(gamePiece.getFrozen());
            System.out.println("You are unfrozen!");
        }

        System.out.println("Try to move!");
        scanner.nextLine();
        gamePiece.move(4, 5);

        System.out.println("You are at " + gamePiece.getPositionX() + ", " + gamePiece.getPositionY());


    }
}
