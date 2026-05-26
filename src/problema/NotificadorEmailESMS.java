package problema;

public class NotificadorEmailESMS extends NotificadorEmail{
    private NotificadorSMS sms = new NotificadorSMS();
    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        sms.enviar(mensagem);
    }
}
