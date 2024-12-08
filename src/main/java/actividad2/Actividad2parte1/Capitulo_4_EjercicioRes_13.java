package actividad2parte1;

                //////////

import java.util.Scanner;

                //////////

public class Capitulo_4_EjercicioRes_13 {
    public static void main(String[] args) {


        //Lista de descuentos
        Integer[] descuentos = {10, 25, 50, 100};


        //Crea la instancia Scanner
        Scanner scanner = new Scanner(System.in);


        //Entrada de datos solicitados
        System.out.println("Ingrese el valor de su compra: ");
        double compra = scanner.nextDouble();


        //aplicacion descuentos
        int bolita = (int) (Math.random() * 4);
        double valor_pagar = compra - ((descuentos[bolita] * compra)/100);


        //Salida del programa
        System.out.println("El valor a pagar es: " + valor_pagar);
        
        
    }
    

}