package actividad2.Actividad2parte1;

                //////////

import java.util.Scanner;
import java.util.ArrayList;

                //////////

public class Capitulo_3_EjercicioProp_18 {
    public static void main(String[] args) {
        
        
        //Lista de frases para la salida
        String[] salida = {"Su codigo de empleado: ", "Su nombre completo: ",
                "Su salario bruto: ",
                "Su salario neto: "};


        //Lista de datos solicitados al empleado
        String[] dat = {"su codigo: ", "su nombre completo: ",
                        "su numero de horas trabajadas al mes: ",
                        "el valor de la hora trabajada al mes: ",
                        "el porcentaje de retencion de la fuente: "};


        //Lista de datos del empleado
        ArrayList<Object> datos = new ArrayList<>();


        //Lista de objetos a imprimir
        ArrayList<Object> imprimir = new ArrayList<>();


        //Entrada de todos los datos con los que trabajaremos
        try (Scanner scanner = new  Scanner(System.in)) {
            for (String daat : dat) {
                System.out.println(("Ingrese " + daat));
                Object dato = scanner.nextLine();
                datos.add(dato);
            }
        }


        //Datos finales del ejercicio
        String codigo = datos.get(0).toString();
        imprimir.add(codigo);
        String nombre = datos.get(1).toString();
        imprimir.add(nombre);
        double salario_bruto = Double.parseDouble(datos.get(2).toString()) * Double.parseDouble(datos.get(3).toString());
        imprimir.add(salario_bruto);
        double retencion = salario_bruto * (Double.parseDouble(datos.get(4).toString())/100);
        double salario_neto = salario_bruto - retencion;
        imprimir.add(salario_neto);


        //Imprimir datos
        int i = 0;
        for (Object impr: imprimir) {
            System.out.println(salida[i] + impr);
            i += 1;
        }


    }


}