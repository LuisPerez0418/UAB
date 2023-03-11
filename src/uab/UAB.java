/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uab;

import java.util.Scanner;

/**
 *
 * @author Luis Mario
 */
public class UAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String estracto;
        String genero;

        System.out.println("Digite su estracto");
        estracto = sc.next();

        switch (estracto) {
            case "1":
                int porcentajeFemenino1 = 50;
                int porcentajeMasculino1 = 50;
                System.out.println("Cual es tu genero M = masculino o F = femenino ");
                genero = sc.next();

                genero = genero.toUpperCase();

                if (genero.equals("M")) {
                    porcentajeMasculino1 += 1;
                    porcentajeFemenino1 -= 1;
                    System.out.println("En el estracto 1 existe un porcentaje masculino de " + porcentajeMasculino1 + "% Y de porcentaje Femenino de " + porcentajeFemenino1 + "%");
                } else if (genero.equals("F")) {
                    porcentajeFemenino1 += 1;
                    porcentajeMasculino1 -= 1;
                    System.out.println("En el estracto 1 existe un porcentaje masculino de " + porcentajeMasculino1 + "% Y de porcentaje Femenino de " + porcentajeFemenino1 + "%");

                } else {
                    System.out.println("No valido");
                }

                break;

            case "2":
                int porcentajeFemenino2 = 40;
                int porcentajeMasculino2 = 60;
                System.out.println("Cual es tu genero M = masculino o F = femenino ");
                genero = sc.next();

                genero = genero.toUpperCase();

                if (genero.equals("M")) {
                    porcentajeMasculino2 += 1;
                    porcentajeFemenino2 -= 1;
                    System.out.println("En el estracto 2 existe un porcentaje masculino de " + porcentajeMasculino2 + "% Y de porcentaje Femenino de " + porcentajeFemenino2 + "%");
                } else if (genero.equals("F")) {
                    porcentajeFemenino2 += 1;
                    porcentajeMasculino2 -= 1;
                    System.out.println("En el estracto 2 existe un porcentaje masculino de " + porcentajeMasculino2 + "% Y de porcentaje Femenino de " + porcentajeFemenino2 + "%");

                } else {
                    System.out.println("No valido");
                }

                break;
                
            case "3":
                int porcentajeFemenino3 = 60;
                int porcentajeMasculino3 = 40;
                System.out.println("Cual es tu genero M = masculino o F = femenino ");
                genero = sc.next();

                genero = genero.toUpperCase();

                if (genero.equals("M")) {
                    porcentajeMasculino3 += 1;
                    porcentajeFemenino3 -= 1;
                    System.out.println("En el estracto 3 existe un porcentaje masculino de " + porcentajeMasculino3 + "% Y de porcentaje Femenino de " + porcentajeFemenino3 + "%");
                } else if (genero.equals("F")) {
                    porcentajeFemenino3 += 1;
                    porcentajeMasculino3 -= 1;
                    System.out.println("En el estracto 3 existe un porcentaje masculino de " + porcentajeMasculino3 + "% Y de porcentaje Femenino de " + porcentajeFemenino3 + "%");

                } else {
                    System.out.println("No valido");
                }

                break;
                
            case "4":
                int porcentajeFemenino4 = 20;
                int porcentajeMasculino4 = 80;
                System.out.println("Cual es tu genero M = masculino o F = femenino ");
                genero = sc.next();

                genero = genero.toUpperCase();

                if (genero.equals("M")) {
                    porcentajeMasculino4 += 1;
                    porcentajeFemenino4 -= 1;
                    System.out.println("En el estracto 4 existe un porcentaje masculino de " + porcentajeMasculino4 + "% Y de porcentaje Femenino de " + porcentajeFemenino4 + "%");
                } else if (genero.equals("F")) {
                    porcentajeFemenino4 += 1;
                    porcentajeMasculino4 -= 1;
                    System.out.println("En el estracto 4 existe un porcentaje masculino de " + porcentajeMasculino4 + "% Y de porcentaje Femenino de " + porcentajeFemenino4 + "%");

                } else {
                    System.out.println("No valido");
                }

                break;

            default:
                System.out.print("Estracto no valido" + "\t");

        }

    }

}
