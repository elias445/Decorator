package ExemploReal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplo_Collections {
    public static void main(String[] args) {
        System.out.println("--- USO REAL DO DECORATOR (API JAVA) ---");

        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");

        // O Collections atua como um Decorator, adicionando o comportamento "ReadOnly"
        List<String> listaImutavel = Collections.unmodifiableList(nomes);

        System.out.println("Lendo da lista decorada: " + listaImutavel.get(0));

        try {
            System.out.println("Tentando adicionar item na lista decorada...");
            listaImutavel.add("Carlos"); // Vai estourar um erro
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro capturado! O Decorator impediu a modificação da lista.");
        }
    }
}
