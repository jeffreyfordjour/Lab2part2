
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("How much was the written check for this month:");
        double writtenChecksForMonth = keyboard.nextDouble();
        int baseFee = 10;
        
        if (writtenChecksForMonth < 20){
        System.out.println("Your fees are " +"$"+(writtenChecksForMonth + 0.10 + baseFee));
        }
        else if (writtenChecksForMonth >= 20 && writtenChecksForMonth <= 39 ){
        System.out.println("Your fees are " +"$"+(writtenChecksForMonth + 0.08 + baseFee));
        
        }
        else if (writtenChecksForMonth >= 40 && writtenChecksForMonth <= 59 ){
        System.out.println("Your fees are " +"$"+(writtenChecksForMonth + 0.06 + baseFee));
            
    }
        else if (writtenChecksForMonth >= 60){
        System.out.println("Your fees are " +"$"+(writtenChecksForMonth + baseFee + 0.04));
}
    }
}
    
