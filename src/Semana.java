import java.util.Scanner;

public class Semana {
    public static void main(String[] args){
        System.out.println("selecione 1 numero ");

        Scanner input = new Scanner(System.in);
        int numeroCorrespondenteAoDia = input.nextInt();

        String dia = null;

        switch (numeroCorrespondenteAoDia) {
            case 1:
                dia ="domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor inválido";
                break;
        }

        System.out.println("Dia da samane:"+ dia);
        input.close();
    }
}
