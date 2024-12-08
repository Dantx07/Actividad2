package actividad2.Actividad2parte1;

                //////////

import java.util.Scanner;
import java.util.ArrayList;

                //////////

public class Capitulo_4_EjercicioRes_10 {
    public static void main(String[] args){
        
        
        //Lista de datos a solicitar
        String[] solicitud = {"numero de inscripcion: ",
                           "nombre completo: ",
                           "patrimonio: ",
                           "estrato social: "};


        //Lista de datos a utilizar
        ArrayList<Object> datos = new ArrayList<>();


        //Entrada de datos solicitados
        try (Scanner scanner = new Scanner(System.in))   {
            for (String dat: solicitud)     {
                System.out.println("Ingrese su " + dat);
                Object dato = scanner.nextLine();
                datos.add(dato);
            }
        }


        //Verificacion de datos y agregado a lista de salida
        var patri = Double.parseDouble(datos.get(2).toString());
        var estra = Double.parseDouble(datos.get(3).toString());
        double matri = 50000;
        if (patri > 2000000 && estra > 3)   {
            matri = (patri * 0.03) + matri;
        }



        //Salida
        System.out.println("El estudiante con numero de inscripcion " + datos.get(0) + " y nombre " + datos.get(1) + " debe pagar $" + matri);


    }
    
    
}