/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmad al fajri
 */
import java.util.Scanner;
public class CountLetters {
     public static void main(String[] args){
        
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        //get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        //convert to all upper case
        word = word.toUpperCase();
        //count frequency of each letter in string
        
        for (int i=0; i < word.length(); i++){
            try{
                counts[word.charAt(i)-'A']++;
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Not a letter: \"" + word.charAt(i) + "\"");
            }
        }
        //print frequencies
        System.out.println();
        for (int i=0; i < counts.length; i++)
            if (counts [i] != 0)
        System.out.println((char)(i +'A') + ": " + counts[i]);
    }
}
