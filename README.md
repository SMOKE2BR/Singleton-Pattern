# Singleton Pattern

Este projeto demonstra a implementação do **Padrão de Projeto Singleton** em Java, utilizando uma classe de configuração de sistema como exemplo.

## 📖 Sobre o padrão
O **Singleton** é um padrão criacional que garante que uma classe tenha **apenas uma instância** e fornece um ponto global de acesso a ela.  
É muito usado para gerenciar recursos compartilhados, como configurações, conexões de banco de dados ou loggers.

## 🛠️ Estrutura do projeto
- `ConfiguracaoSistema.java` → Classe Singleton que mantém informações de configuração.
- `Main.java` → Classe principal para testar o Singleton.

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
