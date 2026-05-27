package Exemplo_cafe;

public class ComCanela extends CafeDecorator {

    public ComCanela(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com Canela";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 1.00;
    }
}
