import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Numero: ");
        int n = input.nextInt();

        switch (n){
            case 1:
                System.out.println("Numero 1");
                break;
            case 2:
                System.out.println("Numero 2");
                break;
            case 3:
                System.out.println("Numero 3");
                break;
            default:
                System.out.println("Seila oq digito");
                break;
        }
    }
}
