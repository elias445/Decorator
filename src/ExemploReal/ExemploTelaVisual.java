package ExemploReal;

import javax.swing.*;

public class ExemploTelaVisual {
    public static void main(String[] args) {
        // 1. O Componente Base (O "Café Simples")
        // Uma área de texto que só sabe mostrar texto, nada mais.
        JTextArea areaDeTexto = new JTextArea(10, 30);

        // 2. O Decorator (O "Com Leite")
        // Ele "engole" a área de texto e adiciona a funcionalidade visual de rolar a tela
        JScrollPane areaComRolagem = new JScrollPane(areaDeTexto);

        // Criando a janela para mostrar na tela
        JFrame janela = new JFrame("Exemplo de Decorator Visual");

        // Em vez de adicionar a área de texto original, adicionamos a DECORADA!
        janela.add(areaComRolagem);

        janela.pack();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
