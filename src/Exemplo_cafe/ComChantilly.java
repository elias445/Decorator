package Exemplo_cafe;

public class ComChantilly extends CafeDecorator {

    public ComChantilly(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com Chantilly";
    }

    @Override
    public double getCusto() {
        return super.getCusto() + 2.00;
    }
}
