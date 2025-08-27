public class AppMobile implements ObservadorNoticia {
    @Override
    public void atualizar(Manchete manchete) {
        System.out.println("App: Notificação push enviada - " +
                manchete.getTitulo() + " (" + manchete.getDataPublicacao() + ")");
    }
}