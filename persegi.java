/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Praktikum_1;

/**
 *
 * @author moklet
 */
public class persegi //subclass
        extends Bangun2Dimensi {
 
    persegi(double sisi)//consturctor
    {
        super.sisi = sisi;
    }
    
    public double luas()
    {
        return sisi*sisi;
    }
}

class run 
{
    public static void main(String[] args) {
        persegi persegil = new persegi(4);
        System.out.println("Luas = "+persegil.luas());
    }
}

