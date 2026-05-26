package Exemplo_cafe;

public class ComLeite extends CafeDecorator {
    public ComLeite(Cafe cafe) {
        super(cafe);
    }
    @Override
    public String getDescricao() { return super.getDescricao() + ", com Leite"; }

    @Override
    public double getCusto() { return super.getCusto() + 1.50; }
}
