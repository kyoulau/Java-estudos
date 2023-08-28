import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1 = input.nextInt(); //retorna scanner input
        int numero2 = input.nextInt(); //retorna scanner input

        if (numero1 % numero2 ==0 || numero2 % numero1 == 0){
            System.out.print("é divisivel");
        }
        else {
            System.out.print("nao é divisivel ");
        }

        input.close();
    }
}