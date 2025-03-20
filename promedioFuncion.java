/*Obtener el promedio de edad de tres personas. */

import java.util.Scanner;

public class Promediofuncion{

    public static int promedio(int edad1 , int edad2, int edad3){
        return (edad1+edad2+edad3)/3;
    } 

    public static void main(String[] args) {
        int e1,e2,e3;

     Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la edad1 :");
        e1 = entrada.nextInt();

        System.out.print("Ingrese la edad2 :");
        e2 = entrada.nextInt();

        System.out.print("Ingrese la edad3 :");
        e3 = entrada.nextInt();

        System.out.println("el promedio es :" + promedio(e1, e2, e3));

        




    }
}