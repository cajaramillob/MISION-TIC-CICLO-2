package co.edu.utp.misiontic2022.c2;

import java.io.IOException;
// Programa que lea un carácter por teclado y compruebe si es
// una letra mayúscula.
import java.util.Scanner;
public class Ejercicio7_LetraenMayuscula {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char letra;
        System.out.print("Introduzca una Letra: ");
        letra = (char)System.in.read(); 
               
        if(Character.isUpperCase(letra)){
           System.out.println("Es una letra mayúscula");}
        else{
            System.out.println("No es una letra mayúscula");}
           sc.close();
 }
}
