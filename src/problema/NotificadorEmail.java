package problema;

public class NotificadorEmail implements Notificador {
    public void enviar(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
}
