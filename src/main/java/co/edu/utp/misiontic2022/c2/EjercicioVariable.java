package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class EjercicioVariable {

    public static void main(String[] args) {                                                                      
        Scanner sc = new Scanner(System.in);
        int N, m;
    
        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt();
        System.out.print("Introduzca valor de m: ");
        m = sc.nextInt();
        
        N = N / (int)Math.pow(10,m); //Math.pow devuelve un número de tipo double
                                     //es necesario convertirlo a int para hacer la                               
                                     //división entre enteros
        System.out.println("Número modificado " + N);
    }
}
