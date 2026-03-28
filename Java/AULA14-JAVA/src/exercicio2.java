import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = input.nextInt();

        if (idade < 0){
            System.out.println("Idade Invalida!");
        } else if (idade > 60) {
            System.out.println("Idoso!");
        } else if (idade >= 18) {
            System.out.println("adulto!");
        } else if (idade >= 13) {
            System.out.println("adolescente!");
        } else if (idade >= 0) {
            System.out.println("criança!");
        }
    }
}
