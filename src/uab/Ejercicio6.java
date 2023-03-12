/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uab;

/**
 *
 * @author Luis Mario
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 1, 2, 2, 3, 4, 4, 5};
        int con1 = 0;
        int con2 = 0;
        int numero = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    con1++;
                }
            }
            if (con1 > con2) {
                con2 = con1;
                numero = i;
            }
            con1 = 0;
        }
        System.out.println("El numero es "+numero+" y se repite: " + con2);
        
    }

}
