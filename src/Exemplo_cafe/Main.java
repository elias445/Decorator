package Exemplo_cafe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cafe meuCafe = new CafeSimples();
        boolean fazendoPedido = true;

        System.out.println("--- BEM-VINDO À CAFETERIA ---");

        while (fazendoPedido) {
            System.out.println("\nPedido atual: " + meuCafe.getDescricao());
            System.out.printf("Custo atual: R$ %.2f\n", meuCafe.getCusto());

            System.out.println("\nEscolha um adicional:");
            System.out.println("1 - Com Leite (R$ 1.50)");
            System.out.println("2 - Com Chantilly (R$ 2.00)");
            System.out.println("3 - Com Canela (R$ 1.00)");
            System.out.println("0 - Finalizar Pedido");
            System.out.print("Sua opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    meuCafe = new ComLeite(meuCafe);
                    break;
                case 2:
                    meuCafe = new ComChantilly(meuCafe);
                    break;
                case 3:
                    meuCafe = new ComCanela(meuCafe);
                    break;
                case 0:
                    fazendoPedido = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        System.out.println("\n--- RESUMO DO PEDIDO FINAL ---");
        System.out.println("Você pediu: " + meuCafe.getDescricao());
        System.out.printf("Total a pagar: R$ %.2f\n", meuCafe.getCusto());

        scanner.close();
    }
}