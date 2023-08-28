import java.util.Scanner;

public class Retanglemain {
    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in );
        Retangulo retangule = new Retangulo();

        System.out.println("Determine width: ");
        retangule.width = scanner.nextDouble();

        System.out.println("Determine height: ");
        retangule.height = scanner.nextDouble();


        System.out.printf("AREA = %.2f%n", retangule.calcularArea());
        System.out.printf("PERIMETER = %.2f%n", retangule.calcularPerimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangule.calcularDiagonal());
        scanner.close();

    }
}
