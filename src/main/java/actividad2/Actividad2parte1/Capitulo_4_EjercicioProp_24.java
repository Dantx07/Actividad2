package actividad2parte1;

                //////////

import java.util.Scanner;
import java.util.ArrayList;

                //////////

public class Capitulo_4_EjercicioProp_24 {
    public static void main(String[] args){
        
        
        //Lista de objetos
        String[] bolas = {"Peso esfera A: ",
                "Peso esfera B: ",
                "Peso esfera C: "};


        //Lista de datos
        ArrayList<Double> datos = new ArrayList<>();


        //Entrada de datos
        try(Scanner scanner = new Scanner(System.in))    {
            for (String b: bolas)   {
                System.out.println(b);
                double peso = scanner.nextDouble();
                datos.add(peso);
            }
        }


        //Parte logica del codigo
        if (datos.get(0) > datos.get(1) && datos.get(0) > datos.get(2))   {
            System.out.println("La esfera A es de mayor peso");
        } else if (datos.get(1) > datos.get(0) && datos.get(1) > datos.get(2)) {
            System.out.println("La esfera B es de mayor peso");
        } else  {
            System.out.println("La esfera C es de mayor peso");
        }
        
        
    }
 

}