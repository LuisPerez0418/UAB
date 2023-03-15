/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uab;

import java.util.Scanner;

/**
 *
 * @author Luis Mario
 */
public class Fimonasi {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Digite un numero");
        n = sc.nextInt();
        
        
        int[] fibonacci = new int[n];
        
        double[]arreglo = new double[n];
        
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        }
        System.out.print("[");
        for (int i = 0; i < fibonacci.length; i++) {
            arreglo[i]=(Math.pow(fibonacci[i],3));
            System.out.print((arreglo[i]+","));
        }
        System.out.println("]");
    }
}
