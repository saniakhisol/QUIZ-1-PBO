/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kuispbo;

import java.util.Scanner;

/**
 *
 * @author Violin
 */
public class persipanjang {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double p , l, luas,keliling;
        System.out.println("\n-->Persegi Panjang<--");
        System.out.print("Masukkan Panjang : ");
        p = input.nextDouble();
        System.out.print("Masukkan lebar : ");
        l = input.nextDouble();
        System.out.println("=>");
        luas = p * l;
        keliling = 2*p + 2*l;
        System.out.print("Luas  = " + (int)luas + " \nKeliling  = "+ (int)keliling);
        System.out.println("");
        }
}
