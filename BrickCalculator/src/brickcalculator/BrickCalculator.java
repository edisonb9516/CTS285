/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickcalculator;
import java.util.Scanner;
/**
 *
 * @author bedis
 */
public class BrickCalculator {
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //amount of brick in 1 ft horizontal length and 10 ft height including patter at top. 
        int brickInterval = 34; 
        //the running total for bricks
        int brickRunningTotal = 0;
        //the voids that we will use to subtract the number of bricks from
        
        int regDoorWay = 80; //80 bricks for a regular doorway
        int tallWindow = 100; //100 bricks for the tall windows in the wall
        int doorwayWithWindow = 180; //amount of bricks for the doorways with the windows next to them
        int emergencyExits = 200; //amount of bricks for each emergency doorways in the building
        int stairwellWindows = 350;//amount of bricks for the big windows in the stairwells
        
        //call walls function to get the amount of walls
        walls();
        
    
    
    }
    
    public static void walls(){
        Scanner scanner = new Scanner(System.in);
        //ask the user how many walls they would like to enter
        int amountOfWalls;
        System.out.print("Please enter the amount of walls you would like "
                + "to calculate the bricks for: ");
        
        amountOfWalls = scanner.nextInt();
        
        //create an array to store the lengths of each walls. length of array is specified with the user input
        int[] wallLengths = new int[amountOfWalls]; 
        
        //now store the length of the walls in the array
        for (int i = 1; i <= amountOfWalls; i++){
            //ask user for each length of each wall
            System.out.print("What is the length of wall ");
            System.out.print(i);
            
            int lengthOfWall = scanner.nextInt();
            
            wallLengths[i] = lengthOfWall;
        
        }
    }
  
}
