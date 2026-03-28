import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o ultimo digito da sua placa?");
        int placa = input.nextInt();

        System.out.println("Dia da semana?");
        int semana = input.nextInt();

        switch(semana) {
            case 1:
                if (placa == 1 || placa == 2){
                    System.out.println("Seu Veiculo não pode Rodar na Segunda-Feira!");
                } else {
                    System.out.println("Seu veiculo pode rodar na Segunda-Feira!");
                }
                break;
            case 2:
                if (placa == 3 || placa == 4){
                    System.out.println("Seu Veiculo não pode Rodar na terça-Feira!");
                } else {
                    System.out.println("Seu veiculo pode rodar na terça-Feira!");
                }
                break;
            case 3:
                if (placa == 5 || placa == 6){
                    System.out.println("Seu Veiculo não pode Rodar na quarta-Feira!");
                } else {
                    System.out.println("Seu veiculo pode rodar na quarta-Feira!");
                }
                break;
            case 4:
                if (placa == 7 || placa == 8){
                    System.out.println("Seu Veiculo não pode Rodar na quinta-Feira!");
                } else {
                    System.out.println("Seu veiculo pode rodar na quinta-Feira!");
                }
                break;
            case 5:
                if (placa == 9 || placa == 0){
                    System.out.println("Seu Veiculo não pode Rodar na sexta-Feira!");
                } else {
                    System.out.println("Seu veiculo pode rodar na sexta-Feira!");
                }
                break;
        }
    }
}
