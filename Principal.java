import java.util.Scanner;
public class Principal {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre de la figura: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el color de la figura: ");
            String color = scanner.nextLine();

            System.out.print("Ingrese el tipo de figura (1:Círculo, 2:Rectángulo, 3:Triángulo): ");
            int tipoFigura = scanner.nextInt();

            double radio, lado1, lado2, base, altura;

            switch (tipoFigura) {
                case 1: // Círculo
                    System.out.print("Ingrese el radio del círculo: ");
                    radio = scanner.nextDouble();

                    Circulo circulo = new Circulo(nombre, color, radio);

                    System.out.println("Área del círculo: " + circulo.obtenerArea());
                    System.out.println("Perímetro del círculo: " + circulo.obtenerPerimetro());
                    break;

                case 2: // Rectángulo
                    System.out.print("Ingrese el valor del lado1 del rectángulo: ");
                    lado1 = scanner.nextDouble();
                    System.out.print("Ingrese el valor del lado2 del rectángulo: ");
                    lado2 = scanner.nextDouble();

                    Rectangulo rectangulo = new Rectangulo(nombre, color, lado1, lado2);

                    System.out.println("Área del rectángulo: " + rectangulo.obtenerArea());
                    System.out.println("Perímetro del rectángulo: " + rectangulo.obtenerPerimetro());
                    break;

                case 3: // Triángulo
                    System.out.print("Ingrese el valor de la base del triángulo: ");
                    base = scanner.nextDouble();
                    System.out.print("Ingrese el valor de la altura del triángulo: ");
                    altura = scanner.nextDouble();

                    Triangulo triangulo = new Triangulo(nombre, color, base, altura);

                    System.out.println("Área del triángulo: " + triangulo.obtenerArea());
                    System.out.println("Perímetro del triángulo: " + triangulo.obtenerPerimetro());
                    break;

                default:
                    System.out.println("Opción no válida.");

                    //Aquí esta su cochino trabajo  (No se me me ofenda es un comentario)

            }
        }
    }