/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w02_instance;

/**
 *
 * @author Saiful Nur Budiman
 * Teknik Informatika - Univ.Islam Balitar
 * 2022-2023
 */
public class Mobil {
    String pabrikan, type, warna;

    private Mobil(String pabrik, String type, String warna) {
        System.out.println(pabrik);
        System.out.println(type);
        System.out.println(warna);
    }
    
    public void bergerakMaju(){
        System.out.println("Maju");
    }
    
    public void bergerakMundur(){
        System.out.println("Mundur");
    }
    
    public void parkir(){
        System.out.println("Parkir");
    }
    
    public static void main(String[] args) {
//        Mobil Honda = new Mobil();
        Mobil Honda = new Mobil("Honda", "CRV", "Perak Metalik");
        Honda.bergerakMaju();
        Honda.bergerakMundur();
        Honda.parkir();
        
        System.out.println("");
        
//        Mobil Toyota = new Mobil();
        Mobil Toyota = new Mobil("Toyota", "Rush", "Hijau");
        Toyota.bergerakMaju();
        Toyota.bergerakMundur();
        Toyota.parkir();
        
        
        
    }
}
