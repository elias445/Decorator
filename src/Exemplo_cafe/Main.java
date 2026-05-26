package Exemplo_cafe;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- CÓDIGO COM DECORATOR (DINÂMICO) ---");
        Cafe meuCafe = new CafeSimples();
        meuCafe = new ComLeite(meuCafe);
        meuCafe = new ComLeite(meuCafe);

        System.out.println(meuCafe.getDescricao() + " -> R$ " + meuCafe.getCusto());
    }
}
