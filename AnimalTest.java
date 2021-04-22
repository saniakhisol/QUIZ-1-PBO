/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package makhlukhidup;

/**
 *
 * @author Violin
 */
public class AnimalTest
{
 
    public static void main(String[] args)
    {
        Animal animal1 = new Animal();
        animal1.nama = "Binatang Abstrak";
        animal1.mengeluarkanSuara();
 
        Kucing kucing1 = new Kucing();
        kucing1.nama = "Kitten";
        kucing1.mengeluarkanSuara();
 
        Animal animal2 = new Kucing();
        animal2.nama = "Mew";
 
    }
 
}