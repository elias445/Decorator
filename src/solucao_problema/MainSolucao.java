package solucao_problema;

import java.util.Scanner;

public class MainSolucao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Notificador alerta = new NotificadorEmail();
        System.out.println("\nCanal base: Email configurado.");
        System.out.println();
        System.out.print("Deseja adicionar envio por SMS?\n1- Sim\n2- Não ");
        String opcaoSms = scanner.nextLine().trim();

        switch (opcaoSms) {
            case "1":
                alerta = new NotificadorSMS(alerta);
                System.out.println("[+] SMS adicionado com sucesso!");
                break;
            case "2":
                System.out.println("[-] SMS ignorado.");
                break;
            default:
                System.out.println("[!] Opção inválida. SMS ignorado por padrão.");
                break;
        }
        System.out.print("Deseja adicionar envio por WhatsApp?\n1- Sim\n2- Não ");
        String opcaoWpp = scanner.nextLine().trim();

        switch (opcaoWpp) {
            case "1":
                alerta = new NotificadorWhatsApp(alerta);
                System.out.println("[+] WhatsApp adicionado com sucesso!");
                break;
            case "2":
                System.out.println("[-] WhatsApp ignorado.");
                break;
            default:
                System.out.println("[!] Opção inválida. WhatsApp ignorado por padrão.");
                break;
        }
        System.out.println("\n--- DISPARANDO NOTIFICAÇÃO ---");
        System.out.print("Digite a mensagem de alerta: ");
        String mensagem = scanner.nextLine();

        System.out.println("\nResultado final do disparo:");
        alerta.enviar(mensagem);

        scanner.close();
    }
}
