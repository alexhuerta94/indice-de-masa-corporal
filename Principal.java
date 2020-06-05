//Alejandro Huerta Gonzalez
//Grupo 2S11
package imc;

import java.util.Scanner;

public class Principal { 
    
    public static void main (String[] args) {
    Scanner entrada=new Scanner(System.in);          

     int edad;
    String sex;
    float peso;
    float total;
    float altura;
    String nom;

      
            System.out.println("Hola cual es tu nombre?");
            nom=entrada.nextLine();
            System.out.println("Ingresa tu edad");
            edad=entrada.nextInt();
            System.out.println("Cual es tu sexo? M/F");
            sex=entrada.nextLine();
            sex=entrada.nextLine();
            System.out.println("Ingresa tu peso en Kgs");
            peso=entrada.nextFloat();
            System.out.println("Ingrsa tu estatura en CMS");
            altura=entrada.nextFloat();
        
    }
}
