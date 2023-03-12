/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uab;

/**
 *
 * @author Luis Mario
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int[]myArray={1,2,4,6,7,5};
        int numero1=0;
        int numero2=0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i+1; j < myArray.length-1; j++) {
                if((myArray[i]+myArray[j])==10){
                    numero1=myArray[i];
                    numero2=myArray[j];
                }
            }
        }
        System.out.println("Los numeros que sumados dan 10 son: "+numero1+" "+numero2);
        
        
    }
}
