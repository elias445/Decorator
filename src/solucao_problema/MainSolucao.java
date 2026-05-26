package solucao_problema;

public class MainSolucao {
    public static void main(String[] args) {
        System.out.println("--- CLIENTE 1: Quer apenas Email ---");
        Notificador cliente1 = new NotificadorEmail();
        cliente1.enviar("Bem-vindo ao sistema!");

        System.out.println("\n--- CLIENTE 2: Quer Email e SMS ---");
        Notificador cliente2 = new NotificadorSMS(new NotificadorEmail());
        cliente2.enviar("Sua senha foi alterada.");

        System.out.println("\n--- CLIENTE 3: Pacote Completo (Email, SMS e WhatsApp) ---");
        Notificador cliente3 = new NotificadorWhatsApp(new NotificadorSMS(new NotificadorEmail()));

        cliente3.enviar("Alerta de segurança crítico!");
    }
}
