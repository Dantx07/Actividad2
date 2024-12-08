package actividad2.Actividad2parte1;

                //////////

import java.util.Scanner;

                //////////

public class Capitulo_3_EjercicioProp_19 {
    public static void main(String[] args){


        //Crea la instancia Scanner
        Scanner scanner = new Scanner(System.in);


        //Entrada de los datos con los que trabajaremos
        System.out.println("Ingrese la medida del lado del triangulo: ");
        double lado = scanner.nextDouble();


        //Formulas necesarias e impresion de datos
        double perimetro = lado*3;
        System.out.println("El perimetro es: " + perimetro);
        double altura = ((lado*Math.sqrt(3))/2);
        System.out.println("La altura es: " + altura);
        double area = ((lado*altura)/2);
        System.out.println("El area es: " + area);


    }


}