package actividad2.Actividad2parte1;

                //////////

import java.util.Scanner;
import java.util.ArrayList;

                //////////

public class Capitulo_4_EjercicioRes_14 {
    public static void main(String[] args){
  
        
        //Lista de datos
        ArrayList<Double> datos = new ArrayList<>();


        //Salarios
        ArrayList<Double> salarios = new ArrayList<>();


        //Entrada de datos
        try(Scanner scanner = new Scanner(System.in))   {
            for (int k = 1; k < 4; k++) {
                System.out.println("Ventas del departamento " + k + ": ");
                double ventas_dep = scanner.nextInt();
                datos.add(ventas_dep);
            }
            System.out.println("Ingrese el salario base: ");
            double salario_base = scanner.nextInt();
            datos.add(salario_base);
        }


        //Formulas y equivalencias
        double porcentaje = (datos.get(0) + datos.get(1) + datos.get(2)) * 0.33;
        double salario = datos.get(3);
        System.out.println(porcentaje);
        if (datos.get(0) > porcentaje)  {
            double salario_1 = salario + (salario * 0.2);
            salarios.add(salario_1);
        }   else    {
            salarios.add(salario);
        }
        if (datos.get(1) > porcentaje)  {
            double salario_2 = salario + (salario * 0.2);
            salarios.add(salario_2);
        }   else    {
            salarios.add(salario);
        }
        if (datos.get(2) > porcentaje)  {
            double salario_3 = salario + (salario * 0.2);
            salarios.add(salario_3);
        }   else    {
            salarios.add(salario);
        }


        //Salida del codigo
        int k = 1;
        for (double sa: salarios) {
            System.out.println("Salario vendedores Departamento " + k + ": " + sa);
            k += 1;
        }
        
        
    }
    
    
}