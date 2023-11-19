import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int optionMenu = 0;
        try {
            Scanner scanner = new Scanner(System.in);

            double valorDollar = 4.84;
            double valorEuro = 5.29;

            do {

                System.out.println("""
                        Escolha uma opção:
                        1 - Converter Real para Dolar
                        2 - Converter Real para Euro
                        3 - Sair
                        """);
                optionMenu = scanner.nextInt();

                switch (optionMenu) {
                    case 1:
                        System.out.println("Quantos reais quer converter para dolar ?");
                        int valorRealParaDolar = scanner.nextInt();
                        System.out
                                .println("O valor em real convertido em dolar é " + (valorRealParaDolar / valorDollar));
                        break;

                    case 2:
                        System.out.println("Quantos reais quer converter para euro ?");
                        int valorRealParaEuro = scanner.nextInt();
                        System.out.println("O valor em real convertido em euro é " + (valorRealParaEuro / valorEuro));
                        break;
                    default:
                        System.out.println("Obrigado pro utilizar o programa.");
                        break;
                }

            } while (optionMenu != 3);
        } catch (Exception e) {
        }
    }
}
