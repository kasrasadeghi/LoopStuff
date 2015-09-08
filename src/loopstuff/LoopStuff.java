/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopstuff;

/**
 *
 * @author KSADEGHI
 */
public class LoopStuff {

    public static void main(String[] args) {
        int input = 10;
        //printAsterisks(input);
        printAsteriskTriangle(input);
    }

    public static void printstring(String input) {
        System.out.print(input);
    }

    public static void printAsterisks(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                printstring("*");
            }

            System.out.println("");
        }
    }

    public static void printAsteriskTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length - i; j++)
                printstring(" ");
            for (int j = 1; j < 2 * i; j++)
                printstring("*");
            for (int j = 1; j <= length - i; j++)
                printstring(" ");
            printstring("\n");
        }
        for (int i = length-1; i > 0; i--) {
            for (int j = 1; j <= length - i; j++)
                printstring(" ");
            for (int j = 1; j < 2 * i; j++)
                printstring("*");
            for (int j = 1; j <= length - i; j++)
                printstring(" ");
            printstring("\n");
        }
    }
}
