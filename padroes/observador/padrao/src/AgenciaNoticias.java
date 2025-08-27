import java.util.ArrayList;
import java.util.List;

public class AgenciaNoticias {
    private final List<ObservadorNoticia> observadores = new ArrayList<>();
    private Manchete ultimaManchete;

    public void adicionarObservador(ObservadorNoticia observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorNoticia observador) {
        observadores.remove(observador);
    }

    public void publicarManchete(Manchete manchete) {
        this.ultimaManchete = manchete;
        notificar();
    }

    private void notificar() {
        for (ObservadorNoticia observador : observadores) {
            try {
                observador.atualizar(ultimaManchete);
            } catch (Exception e) {
                System.err.println("Erro ao notificar observador: " + e.getMessage());
            }
        }
    }
}