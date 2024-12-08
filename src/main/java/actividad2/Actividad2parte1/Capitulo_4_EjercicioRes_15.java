package actividad2.Actividad2parte1;

                //////////

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

                //////////

public class Capitulo_4_EjercicioRes_15 {
    public static void main(String[] args){
 
        
        //Lista de objetos
        String[] bolas = {"Peso bola A: ",
                          "Peso bola B: ",
                          "Peso bola C: ",
                          "Peso bola D: "};


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
        if (Objects.equals(datos.get(0), datos.get(1)) && Objects.equals(datos.get(0), datos.get(2)))   {
            if (datos.get(0) < datos.get(3))    {
                System.out.println("La esfera D es la diferente y es de mayor peso");
            } else  {
                System.out.println("La esfera D es la diferente y es de menor peso");
            }
        } else if (Objects.equals(datos.get(0), datos.get(1)) && Objects.equals(datos.get(0), datos.get(3))) {
            if (datos.get(0) < datos.get(2))    {
                System.out.println("La esfera C es la diferente y es de mayor peso");
            } else  {
                System.out.println("La esfera C es la diferente y es de menor peso");
            }
        } else if (Objects.equals(datos.get(0), datos.get(2)) && Objects.equals(datos.get(0), datos.get(3))) {
            if (datos.get(0) < datos.get(1))    {
                System.out.println("La esfera B es la diferente y es de mayor peso");
            } else  {
                System.out.println("La esfera B es la diferente y es de menor peso");
            }
        } else  {
            if (datos.get(1) < datos.get(0))    {
                System.out.println("La esfera A es la diferente y es de mayor peso");
            } else  {
                System.out.println("La esfera A es la diferente y es de menor peso");
            }
        }
        
        
    }
}