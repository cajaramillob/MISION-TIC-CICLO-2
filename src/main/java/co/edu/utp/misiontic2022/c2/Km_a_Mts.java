package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Km_a_Mts{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
System.out.println("Ingrese Km/h");
double ms, Kmh;
Kmh = sc.nextInt();
ms = Kmh*1000/3600;
ms = Math.round(ms * 100) / 100d;
System.out.println("La Velocidad " +Kmh+ "Km/h, es igual a " +ms+ "m/s.");
sc.close();
}
}