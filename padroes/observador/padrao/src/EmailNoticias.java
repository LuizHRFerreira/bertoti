import java.util.ArrayList;
import java.util.List;

public class EmailNoticias implements ObservadorNoticia {
    private List<Manchete> manchetesPendentes = new ArrayList<>();

    @Override
    public void atualizar(Manchete manchete) {
        manchetesPendentes.add(manchete);
        System.out.println("E-mail: Manchete armazenada para envio - " +
                manchete.getTitulo() + ". Total pendente: " + manchetesPendentes.size());
    }
}