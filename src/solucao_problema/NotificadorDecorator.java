package solucao_problema;

public abstract class NotificadorDecorator implements Notificador{
    private Notificador notificadorEmbutido;
    public NotificadorDecorator(Notificador notificador) {
        this.notificadorEmbutido = notificador;
    }
    @Override
    public void enviar(String mensagem) {
        notificadorEmbutido.enviar(mensagem);
    }
}
