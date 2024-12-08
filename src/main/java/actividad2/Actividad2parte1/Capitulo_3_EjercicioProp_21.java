package actividad2.Actividad2parte1;

                //////////

import java.util.Scanner;
import java.util.ArrayList;

                //////////

public class Capitulo_3_EjercicioProp_21 {
    public static void main(String[] args){
        
        
        //Lista de lados
        ArrayList<Double> lados = new ArrayList<>();


        //Entrada de los datos con los que trabajaremos
        try (Scanner scanner = new  Scanner(System.in)) {
            for (int k = 1; k < 4; k++) {
                System.out.println(("Ingrese el lado " + k + ": "));
                double lado = scanner.nextInt();
                lados.add(lado);
            }

        }


        //formulas y salidas del programa
        var p = lados.get(0) + lados.get(1) + lados.get(2);
        System.out.println("El valor del perimetro es: " + p);
        var s = p/2;
        System.out.println("El valor del semiperimetro es: " + s);
        var a = Math.sqrt(s * (s - lados.get(0)) * (s - lados.get(1)) * (s - lados.get(2)));
        System.out.println("El valor del area es: " + a);


    }


}