package solucao_problema;

public class NotificadorEmail implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
}
