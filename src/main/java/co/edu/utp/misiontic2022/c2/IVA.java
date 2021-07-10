package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class IVA {
    public static void main (String[] args) {
     Scanner sc = new Scanner (System.in);
     int precioSinIva;
     int iva;
     int nproductos;
     int totalIVA;
     int precioTotal;

     System.out.println("Precio Sin IVA");
     precioSinIva = sc.nextInt();
     System.out.println("Número de Productos");
     nproductos = sc.nextInt();
     System.out.println("Porcentaje de IVA");
     iva = sc.nextInt();

     precioTotal = (precioSinIva * nproductos);
     totalIVA = ((precioTotal*iva)/100);
     precioTotal = (precioTotal + totalIVA);
     System.out.println("Precio de Venta es:" +precioTotal);
     sc.close();
    }
    
}
