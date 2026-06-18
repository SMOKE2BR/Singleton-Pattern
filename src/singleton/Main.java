package singleton;

public class Main {
    public static void main(String[] args) {
        ConfiguracaoSistema config = ConfiguracaoSistema.getInstance();

        config.setNomeAplicacao("Sistema de Pagamentos");
        config.setVersao("1.0");
        config.setAmbienteExecucao("Produção");

        System.out.println("Aplicação: " + config.getNomeAplicacao());
        System.out.println("Versão: " + config.getVersao());
        System.out.println("Ambiente: " + config.getAmbienteExecucao());

        ConfiguracaoSistema outraConfig = ConfiguracaoSistema.getInstance();
        System.out.println("É a mesma instância? " + (config == outraConfig));
    }
}
