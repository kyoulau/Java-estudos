import java.util.Scanner;

public class Seila {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o numero de testes: ");
        int numero_testes = scanner.nextInt();


        for( int i=0; i< numero_testes; i++){
            for (int j=0; j<= numero_testes; j++){


                System.out.printf("selecione uma nota: ");
                double valor1 = scanner.nextDouble();

                System.out.printf("selecione uma nota: ");
                double valor2 = scanner.nextDouble();

                System.out.printf("selecione uma nota: ");
                double valor3 = scanner.nextDouble();


                double media = (valor1 + valor2 + valor3)/3;

                System.out.println("A média das notas é: " + media);
            }
            scanner.close();
        }
    }
}
