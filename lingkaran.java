/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author Violin
 */
public class lingkaran {
    public static void main(String[] args){ 
       Scanner input = new Scanner(System.in);
        double phi = 3.14;
        double r, luas,keliling;
        System.out.println("\n--> lingkaran <--");
        System.out.print("Masukkan Panjang Ja3.14"
                + "ri-jari : ");
        r = input.nextDouble();
        System.out.println("=>");
        luas = phi * r * r;
        keliling = 2 * phi * r;
        System.out.print("Luas  = " + (int)luas + " \nKeliling  = "+ (int)keliling);
        System.out.println("");
        }
   }
