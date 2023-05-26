/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w03_overload;

/**
 *
 * @author Saiful Nur Budiman
 * Teknik Informatika - Univ.Islam Balitar
 * 2022-2023
 */
public class Exponential {

   public double hasil;

    public Exponential() {
    }

    public Exponential(double inputX) {
        this.hasil = Math.pow(inputX, 2);
    }
    
    public Exponential(double inputX, double inputY) {
        this.hasil = Math.pow(inputX, inputY);
    }
   
   
   
    public static void main(String[] args) {
//        Exponential exponential = new Exponential();
//        exponential.pangkat(3);
//        exponential.showHasil();
//        exponential.pangkat(4, 3);
        
        //menggunakan constructor
        Exponential exp1 = new Exponential(3);
        exp1.showHasil();
        Exponential exp2 = new Exponential(5, 3);
        exp2.showHasil();
    }

    private double pangkat(double inputY) {
        return hasil = Math.pow(inputY, 2);
    }
    
    private void showHasil() {
        System.out.println("Hasil exponential : "+hasil);
    }

    private double pangkat(int inputX, int inputY) {
         return hasil = Math.pow(inputX, inputY);
    }
}
