import java.util.Scanner;

public class switch_case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = input.next();

        switch (nome){
            case "FIAP":
            case "fiap":
            case "Fiap":
                System.out.println("Nome ok!");
                break;
            default:
                System.out.println("Nome Inválido!");
        }
    }
}
