package problema;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- CÓDIGO SEM DECORATOR (RÍGIDO) ---");
        Notificador alerta = new NotificadorEmailESMS();
        alerta.enviar("Sistema fora do ar!");
    }
}