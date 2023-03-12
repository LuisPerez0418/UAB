/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uab;

/**
 *
 * @author Luis Mario
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 2, 3, 4, 4, 5};
        
        String estrella = "";

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i+1 == array[j]) {
                    estrella+="*";
                }
            }
            System.out.println(i+1+" "+estrella+"\n");
            estrella="";
        }
    }
}
