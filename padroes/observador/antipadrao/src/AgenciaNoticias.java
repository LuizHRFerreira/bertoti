public class AgenciaNoticias {
    String titulo = "";
    String conteudo = "";
    String data = "";

    SiteNoticias site = new SiteNoticias();
    AppMobile app = new AppMobile();
    EmailNoticias email = new EmailNoticias();

    public void publicarNoticia(String t, String c, String d) {
        this.titulo = t;
        this.conteudo = c;
        this.data = d;

        site.atualizarNoSite(t, c, d);
        app.enviarPush(t, d);
        email.adicionarNaLista(t, c, d);
    }

    public static void main(String[] args) {
        AgenciaNoticias agencia = new AgenciaNoticias();
        agencia.publicarNoticia("Terremoto atinge costa leste",
                "Um terremoto de magnitude 5.8 foi registrado hoje.",
                "27/08/2025"
        );
    }
}