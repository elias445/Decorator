package Exemplo_cafe;

public class CafeSimples implements Cafe {
    @Override
    public String getDescricao() { return "Café Simples"; }

    @Override
    public double getCusto() { return 5.00; }
}
