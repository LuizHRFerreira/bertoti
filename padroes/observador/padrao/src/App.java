public class App {
    public static void main(String[] args) {
        AgenciaNoticias agencia = new AgenciaNoticias();

        ObservadorNoticia site = new SiteNoticias();
        ObservadorNoticia app = new AppMobile();
        ObservadorNoticia email = new EmailNoticias();

        agencia.adicionarObservador(site);
        agencia.adicionarObservador(app);
        agencia.adicionarObservador(email);

        Manchete manchete = new Manchete(
                "Terremoto atinge costa leste",
                "Um terremoto de magnitude 5.8 foi registrado hoje.",
                "27/08/2025"
        );
        agencia.publicarManchete(manchete);

        agencia.removerObservador(site);
        Manchete novaManchete = new Manchete(
                "Novo recorde na bolsa",
                "Índice alcança maior alta em 10 anos.",
                "27/08/2025"
        );
        agencia.publicarManchete(novaManchete);
    }
}