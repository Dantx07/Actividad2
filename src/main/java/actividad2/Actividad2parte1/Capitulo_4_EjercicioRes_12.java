package actividad2.Actividad2parte1;

                //////////

import java.util.Scanner;
import java.util.ArrayList;

                //////////

public class Capitulo_4_EjercicioRes_12 {
    public static void main(String[] args){
 
        
        //Lista de datos solicitados
        String[] solicitud = {"Ingrese su nombre: ",
                              "Ingrese su numero de horas trabajadas: ",
                              "Ingrese el valor de las horas de trabajo: "};


        //Lista de datos
        ArrayList<Object> datos = new ArrayList<>();


        //Entrada de datos solicitados
        try (Scanner scanner = new Scanner(System.in))  {
            for (String sol: solicitud)     {
                System.out.println(sol);
                 Object dato = scanner.nextLine();
                 datos.add(dato);
            }
        }


        //verificar horas de trabajo
        double pago;
        double valor = Double.parseDouble(datos.get(2).toString());
        double horas = Double.parseDouble(datos.get(1).toString());
        if (horas > 40)  {
            double horas_extras = horas - 40;
            if (horas_extras > 8)   {
                double horas_exedentes = horas_extras - 8;
                pago = (valor * 40) + (16 * valor) + (horas_exedentes * valor * 3);
            } else  {
              pago = (valor * 40) + (horas_extras * valor * 2);
            }
        }   else    {
            pago = valor * horas;
        }


        //Salida del codigo
        System.out.println("El trabajador " + datos.get(0) + " Devengo: " + pago);
        
        
    }
}