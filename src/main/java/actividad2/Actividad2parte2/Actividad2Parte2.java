package actividad2.Actividad2parte2;
        
                //////////

import java.util.Scanner;

                //////////


public class Actividad2Parte2 {

    public static void main(String[] args) {


        //Crea la instancia Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println(("Ingrese el radio del circulo: "));
        int r = scanner.nextInt();
        Circle circle_figure = new Circle(r);
        System.out.println("El area del circulo es: " + circle_figure.area());
        System.out.println("El perimetro del circulo es: " + circle_figure.perimeter() + "\n");

        System.out.println(("Ingrese la base del rectangulo: "));
        int b_r = scanner.nextInt();
        System.out.println(("Ingrese la altura del rectangulo: "));
        int h_r = scanner.nextInt();
        Rectangle rectangle_figure = new Rectangle(b_r, h_r);
        System.out.println("El area del rectangulo es: " + rectangle_figure.area());
        System.out.println("El perimetro del rectangulo es: " + rectangle_figure.perimeter() + "\n");

        System.out.println(("Ingrese el lado del cuadrado: "));
        int l = scanner.nextInt();
        Square square_figure = new Square(l);
        System.out.println("El area del cuadrado es: " + square_figure.area());
        System.out.println("El perimetro del cuadrado es: " + square_figure.perimeter() + "\n");

        System.out.println(("Ingrese la base del triangulo: "));
        int b_t = scanner.nextInt();
        System.out.println(("Ingrese la altura del triangulo5: "));
        int h_t = scanner.nextInt();
        Triangle triangle_figure = new Triangle(b_t, h_t);
        System.out.println("El area del triangulo es: " + triangle_figure.area());
        System.out.println("El perimetro del triangulo es: " + triangle_figure.perimeter());
        System.out.println("El tipo de triangulo es: " + triangle_figure.triangle_type());


    }


}

class Circle {

    int ratio;

    Circle(int ratio) {
        this.ratio = ratio;
    }

    double area() {
        return (double) Math.round(Math.PI * Math.pow(ratio, 2) * 100) / 100;
    }

    double perimeter() {
        return (double) Math.round(2 * Math.PI * ratio * 100) / 100;
    }

}

class Rectangle {

    int base;
    int heigth;

    Rectangle(int base, int heigth) {
        this.base = base;
        this.heigth = heigth;
    }

    double area() {
        return base * heigth;
    }

    double perimeter() {
        return (2 * base) + (2 * heigth);
    }

}

class Square {

    int side;

    Square(int side) {
        this.side = side;
    }

    double area() {
        return side * side;
    }

    double perimeter() {
        return 4 * side;

    }

}

class Triangle {

    int base;
    int heigth;

    Triangle(int base, int heigth) {
        this.base = base;
        this.heigth = heigth;
    }

    double area() {
        return (double) Math.round((base * heigth) / 2 * 100) / 100;
    }

    double hypotenuse() {
        return (double) Math.round(Math.sqrt(base * base + heigth * heigth) * 100) / 100;
    }

    double perimeter() {
        return (double) Math.round((base + heigth + hypotenuse()) * 100) / 100;
    }

    String triangle_type() {
        String type;
        if ((base == heigth) && (base == hypotenuse()) && (heigth == hypotenuse())) {
            type = "Equilatero";
        } else if ((base != heigth) && (base != hypotenuse()) && (heigth != hypotenuse())) {
            type = "Escaleno";
        } else {
            type = "Isoceles";
        }
        return type;
    
    }
  
}
