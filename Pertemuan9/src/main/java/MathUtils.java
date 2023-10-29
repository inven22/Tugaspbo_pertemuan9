/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ahmad al fajri
 */
class MathUtils {
    public static int factorial(int n)throws IllegalArgumentException{
        
        if(n < 0){
            throw new IllegalArgumentException("Factorial tidak boleh negatif");
        }else if(n > 16){
            throw new IllegalArgumentException("Angka lebih besar dari 16");
        }
        
        int fac = 1;
        for (int i=n; i>0; i--)
        fac *= i;
        return fac;
    }
}
