package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class NumSuerte2 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner (System.in);
        int dia, mes, year, nsuerte, suma, digito1, digito2, digito3, digito4;
        System.out.println("Introdusca la Fecha de Nacimiento");
        System.out.print("dia: ");
        dia = sc.nextInt();
        System.out.print("mes: ");
        mes = sc.nextInt();
        System.out.print("year: ");
        year = sc.nextInt();
        suma = dia + mes + year;
        digito1 = suma/1000;
        digito2 = suma/100%10;
        digito3 = suma/10%10;
        digito4 = suma%10;
        nsuerte = digito1 + digito2 + digito3 + digito4;
        System.out.println("El Bendido Número de la Suerte es: " +nsuerte);

        sc.close();
    }
}
