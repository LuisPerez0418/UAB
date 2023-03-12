/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uab;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Luis Mario
 */
public class Icfes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int estracto = 0;
        //Creacion  e inicializacion de diccionario departamento
        HashMap<Integer, String> departamentos = new HashMap<>();

        departamentos.put(1, "Bogota, 267.886987");
        departamentos.put(2, "Santander, 265.857387");
        departamentos.put(3, "Boyaca, 262.909390");
        departamentos.put(4, "Cundinamarca, 257.643275");
        departamentos.put(5, "Risalda , 255.774858");
        departamentos.put(6, "Quindio, 254.983682");
        departamentos.put(7, "Narino, 254.874578");
        departamentos.put(8, "Meta, 253.170546");
        departamentos.put(9, "Casanare, 252.430580");
        departamentos.put(10, "Huila, 251.921625");

        //Creacion e inicializacion
        HashMap<String, Integer> Genero = new HashMap<>();
        //Estracto1
        Genero.put("F1", 8284);
        Genero.put("M1", 9321);
        //Estracto2
        Genero.put("F2", 10000);
        Genero.put("M2", 9321);
        //Estracto3
        Genero.put("F3", 7000);
        Genero.put("M3", 8321);
        //Estracto4
        Genero.put("F3", 7899);
        Genero.put("M3", 9024);
        //Keys
        Set<Integer> id = departamentos.keySet();

        System.out.println("Digite estracto");
        estracto = sc.nextInt();

        switch (estracto) {
            case 1:

                System.out.println("En el estracto 1 hay " + Genero.get("F1") + " Mujeres y " + Genero.get("M1") + " Hombres y el puntaje Nacional de los 10 mejores departamento es ");

                for (Integer key : id) {
                    String valor = departamentos.get(key);
                    System.out.println(key + " " + valor);
                }
                break;

            case 2:
                System.out.println("En el estracto 2 hay " + Genero.get("F2") + " Mujeres y " + Genero.get("M2") + " Hombres y el puntaje Nacional de los 10 mejores departamento es ");

                for (Integer key : id) {
                    String valor = departamentos.get(key);
                    System.out.println(key + " " + valor);

                }
                break;
            case 3:
                System.out.println("En el estracto 3 hay " + Genero.get("F3") + " Mujeres y " + Genero.get("M3") + " Hombres y el puntaje Nacional de los 10 mejores departamento es ");

                for (Integer key : id) {
                    String valor = departamentos.get(key);
                    System.out.println(key + " " + valor);

                }
                break;
            case 4:
                System.out.println("En el estracto 4 hay " + Genero.get("F4") + " Mujeres y " + Genero.get("M4") + " Hombres y el puntaje Nacional de los 10 mejores departamento es ");

                for (Integer key : id) {
                    String valor = departamentos.get(key);
                    System.out.println(key + " " + valor);

                }
        }
    }
}
