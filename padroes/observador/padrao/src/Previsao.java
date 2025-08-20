public class Previsao implements Observador {
    @Override
    public void atualizar(double temperatura, double umidade, double pressao) {
        System.out.println("Previsão atualizada com temperatura: " + temperatura +
                           ", umidade: " + umidade +
                           ", pressão: " + pressao);
    }
}
