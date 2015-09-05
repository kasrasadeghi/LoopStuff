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

    
    public static void main(String[] args) 
    {
        int input [] = {10, 10};
        printAsterisks(input[0], input[1]);
    }
    
    public static void printAsterisks(int length, int width)
    {
        for (int i = 1; i <= 6 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}
