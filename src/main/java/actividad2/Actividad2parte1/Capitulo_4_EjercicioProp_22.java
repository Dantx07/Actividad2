package actividad2parte1;

                //////////

import java.util.Scanner;
import java.util.ArrayList;

                //////////

public class Capitulo_4_EjercicioProp_22 {
    public static void main(String[] args){
 
        
        //Frases de salida
        String[] salidas = {"Nombre del empleado: ",
                            "Salario mensual: "};


        //Lista de datos solicitados
        String[] solicitados = {"Ingrese su nombre: ",
                                "Ingrese su salario basico por hora: ",
                                "Ingrese el numero de horas trabajadas: "};


        //Lista de datos
        ArrayList<Object> datos = new ArrayList<>();


        //Datos de salida
        ArrayList<Object> salida = new ArrayList<>();


        //Entrada de datos
        try(Scanner scanner = new Scanner(System.in))   {
            for (String sol: solicitados)   {
                System.out.println(sol);
                Object dato = scanner.nextLine();
                datos.add(dato);
            }
        }


        //verificacion
        salida.add(datos.get(0));
        int salario_base = Integer.parseInt(datos.get(1).toString());
        int horas = Integer.parseInt(datos.get(2).toString());
        int salario = salario_base * horas;
        if (salario > 450000)   {
            salida.add(salario);
        }


        //Salida del codigo
        int k = 0;
        for (Object sali: salida)   {
            System.out.println(salidas[k] + sali);
            k += 1;
        }
        
        
    }


}