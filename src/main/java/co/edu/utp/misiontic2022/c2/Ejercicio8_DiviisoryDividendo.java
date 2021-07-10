package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ejercicio8_DiviisoryDividendo {

      private static Object close;

    public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
double P,S,R;
System.out.println("Introduce el Dividendo: ");
P=teclado.nextInt();
System.out.println("Introduce el Divisor: ");
S=teclado.nextInt();
if (P==0){
    System.out.println("El divisor no puede ser cero");
    }
        else{
            R=P/S;
            System.out.println("El resultado de la division es: " + R);
            teclado.close();
            }
  }
}

