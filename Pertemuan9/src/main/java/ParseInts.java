/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmad al fajri
 */
import java.util.Scanner;
public class ParseInts {
    public static void main(String[] args){
        int val, sum=0;
        Scanner scan = new Scanner(System.in);
        String line;
        
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());
        
        while (scanLine.hasNext()){
            try{
                val = Integer.parseInt(scanLine.next());
                sum += val;                
            }
            catch(NumberFormatException ex){
            }
        }
        System.out.println("The sum of the integers on this line is " + sum);
}
}
