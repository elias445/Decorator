# Padrão de Projeto: Decorator em Java 🛠️

Este repositório é um estudo prático sobre o **Design Pattern Decorator** (Padrão Estrutural). O objetivo é demonstrar na prática a diferença entre um código rigidamente acoplado por herança e um código flexível utilizando a decoração dinâmica de objetos, além de mostrar como a própria linguagem Java utiliza esse padrão nativamente em suas bibliotecas.

## 📁 Estrutura do Projeto

O projeto está dividido em cinco cenários de estudo para facilitar o entendimento, indo do problema conceitual até casos de uso reais da arquitetura Java:

### 1. `problema` (O Caos da Herança)
Neste pacote, simulamos um sistema de notificações (Email, SMS, WhatsApp) desenvolvido utilizando **herança simples**. 
* **O que observar:** O anti-pattern conhecido como "Explosão de Classes". Para combinar envios simultâneos (ex: Email e SMS ao mesmo tempo), foi necessário criar uma classe específica e engessada (`NotificadorEmailESMS`). Conforme novos canais são adicionados, o número de classes necessárias cresce exponencialmente.

### 2. `solucao_notificacao` (A Mágica da Composição)
Resolvemos o problema exato do pacote anterior, mas agora aplicando o padrão Decorator.
* **O que observar:** Criamos uma estrutura onde as notificações (`NotificadorSMS`, `NotificadorWhatsApp`) atuam como "envelopes". Em vez de criar classes fundidas, instanciamos a notificação base e a decoramos dinamicamente em tempo de execução. O código fica aberto para extensão e fechado para modificação.

### 3. `exemplo_cafe` (O Exemplo Clássico)
Neste pacote, implementamos o exemplo mais famoso da literatura sobre o padrão Decorator: o sistema de pedidos de uma cafeteria.
* **O que observar:** Como um `CafeSimples` (Componente Base) pode ser "decorado" com ingredientes extras como `ComLeite` ou `ComCanela`. Cada ingrediente adicionado soma dinamicamente o seu preço e a sua descrição ao objeto base, sem a necessidade de criar classes rígidas como `CafeComLeiteECanela`.

### 4. `exemplo_colecoes` (API `java.util`)
Demonstração de como o padrão Decorator é utilizado "por debaixo dos panos" pela biblioteca de coleções nativa do Java.
* **O que observar:** Quando usamos o método `Collections.unmodifiableList()`, a API do Java atua como um Decorator. Ela recebe a sua lista normal (`ArrayList`) e a envelopa com uma camada protetora que intercepta o método `.add()`, bloqueando a escrita e transformando-a em uma lista "somente leitura" dinamicamente.

### 5. `exemplo_visual` (Java Swing API)
Um exemplo altamente visual de Decorator presente no Java desktop para construção de interfaces.
* **O que observar:** Um campo de texto puro (`JTextArea`) não possui a capacidade de criar barras de rolagem nativamente. Em vez de recorrer à herança, o Java fornece o `JScrollPane` (o Decorador). Ele "engole" o campo de texto e desenha as barras de rolagem ao redor dele apenas quando o texto excede o tamanho da tela.

---

## 🎯 Vantagens do Padrão Decorator

* **Fuga da Herança:** Substitui a herança pela composição de objetos, evitando a criação infinita de subclasses.
* **Adição Dinâmica:** Permite atribuir novas responsabilidades a um objeto em tempo de execução, dependendo da necessidade do usuário ou do sistema.
* **Single Responsibility:** Cada classe decoradora tem um único trabalho (ex: "apenas adicionar o SMS", "apenas somar o preço do leite" ou "apenas desenhar a barra de rolagem").

## 🚀 Como testar localmente

1. Faça o clone deste repositório: 
   ```bash
   git clone https://github.com/elias445/Decorator.git
