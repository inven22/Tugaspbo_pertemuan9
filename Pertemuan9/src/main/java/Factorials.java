/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmad al fajri
 */
import java.util.Scanner;
public class Factorials {
     public static void main(String[] args){
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        
        while (keepGoing.equals("y") || keepGoing.equals("Y")){
            try{
                System.out.print("Enter an integer: ");
                int val = scan.nextInt();
                System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
            }
            catch(IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}
