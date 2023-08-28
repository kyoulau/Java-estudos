import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int ValorX = input.nextInt();
        int ValorY = input.nextInt();

        if (ValorX > 0 && ValorY > 0){
            System.out.println("Q1");

        } else if (ValorX < 0 && ValorY > 0 ) {
            System.out.println("Q2");
        }

        if (ValorX < 0 && ValorY < 0){
            System.out.println("Q3");
        } else if (ValorX>0 && ValorY < 0) {
            System.out.println("Q4");
        } else if (ValorX== 0 && ValorY== 0) {
            System.out.println("Origem");
        }

        input.close();
    }
}
