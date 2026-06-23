# Singleton Pattern

Este projeto demonstra a implementação do **Padrão de Projeto Singleton** em Java, utilizando uma classe de configuração de sistema como exemplo.

## 📖 Sobre o padrão
O **Singleton** é um padrão criacional que garante que uma classe tenha **apenas uma instância** e fornece um ponto global de acesso a ela.  
É muito usado para gerenciar recursos compartilhados, como configurações, conexões de banco de dados ou loggers.

## 🛠️ Estrutura do projeto
- `ConfiguracaoSistema.java` → Classe Singleton que mantém informações de configuração.
- `Main.java` → Classe principal para testar o Singleton.

  ***DIAGRAMA DE CLASSES***

<img width="455" height="447" alt="Singleton" src="https://github.com/user-attachments/assets/fbed6e45-3cd8-43a7-acb8-19ebd104b720" />


## 📂 Exemplo de uso
```java
ConfiguracaoSistema config = ConfiguracaoSistema.getInstance();
config.setNomeAplicacao("MeuApp");
config.setVersao("1.0");
System.out.println(config.getNomeAplicacao());


🎯 Benefícios
Garante uma única instância da classe.

Centraliza o gerenciamento de recursos.

Facilita o acesso global às configurações.
