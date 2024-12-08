package actividad2parte1;

                //////////

import java.util.Scanner;
import java.util.ArrayList;

                //////////

public class Capitulo_4_EjercicioRes_11 {
    public static void main(String[] args) {
        
        
        
        //Crea la instancia Scanner
        Scanner scanner = new Scanner(System.in);


        //Crea una lista con los datos que utilizaremos
        ArrayList<Double> valor = new ArrayList<>();


        //Entrada de datos con los que trabajaremos
        for (int k = 1; k < 4; k++)     {
            System.out.println("Ingrese el Numero " + k + ": ");
            double numero = scanner.nextDouble();
            valor.add(numero);
        }


        //Identificamos el numero mayor
        double mayor = 0;
        if (valor.getFirst() > valor.get(1) && valor.getFirst() > valor.get(2))     {
            mayor = valor.getFirst();
        }   else if (valor.get(1) > valor.get(0) && valor.get(1) > valor.get(2)) {
            mayor = valor.get(1);
        }   else if (valor.get(2) > valor.get(1) && valor.get(2) > valor.get(0)) {
            mayor = valor.get(2);
        }


        //Salida del codigo
        System.out.println("El valor mayor entre: " +  valor.get(0) +  ", " + valor.get(1) + " y " + valor.get(2) + " es: " +  mayor);
        
        
    }


}
