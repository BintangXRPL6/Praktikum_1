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
public class segitiga //subclass
        extends Bangun2Dimensi {
    
    segitiga(double alas, double tinggi)//constructor
    {
        super.alas = alas;
        super.tinggi = tinggi;
    }
    
    public double luas()
    {
        return alas * tinggi * 0.5;
    }
}

class run
{
    public static void main(String[] args) {
        segitiga segitiga1 = new segitiga(5,5);
        System.out.println("Luas = "+segitiga1.luas());
    }
}
