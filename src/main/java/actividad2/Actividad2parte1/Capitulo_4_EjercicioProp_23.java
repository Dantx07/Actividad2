package actividad2.Actividad2parte1;

                //////////

import java.util.Scanner;
import java.util.ArrayList;

                //////////

public class Capitulo_4_EjercicioProp_23 {
    public static void main(String[] args){
        
        
        //Lista de datos solicitados
        String[] solicitados = {"Ingrese el valor A: ",
                                "Ingrese el valor B: ",
                                "Ingrese el valor C: "};


        //Lista de datos
        ArrayList<Double> datos = new ArrayList<>();


        //Lista de soluciones
        ArrayList<Double> soluciones = new ArrayList<>();


        //Entrada de datos
        try(Scanner scanner = new Scanner(System.in))   {
            for (String sol: solicitados)   {
                System.out.println(sol);
                double dato = scanner.nextDouble();
                datos.add(dato);
            }
        }


        //Formulas
        double a = Double.parseDouble(datos.get(0).toString());
        double b = Double.parseDouble(datos.get(1).toString());
        double c = Double.parseDouble(datos.get(2).toString());
        double d = Math.sqrt((Math.pow(b, 2) - 4 * a * c));
        double solucion_1 = (-b + d) / 2 * a;
        soluciones.add(solucion_1);
        double solucion_2 = (-b - d) / 2 * a;
        soluciones.add(solucion_2);


        //Imprimir ambos resultados
        for (int k = 1; k < 3; k++) {
            System.out.println("El resultado " + k + " es igual a: " + soluciones.get(k-1));
        }
        
        
    }
    

}