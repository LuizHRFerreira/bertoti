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

        System.out.println("Site: <h1>" + t + "</h1><p>" + c + "</p><small>" + d + "</small>");
        System.out.println("App: Notificação push - " + t + " (" + d + ")");
        System.out.println("E-mail: Manchete armazenada - " + t + ", total pendente: " + email.getTotal());

        site.atualizarNoSite(t, c, d);
        app.enviarPush(t, d);
        email.adicionarNaLista(t, c, d);
    }

    public static void main(String[] args) {
        AgenciaNoticias agencia = new AgenciaNoticias();
        agencia.publicarNoticia("Terremoto atinge costa leste",
                "Um terremoto de magnitude 5.8 foi registrado hoje.",
                "27/08/2025");
        agencia.publicarNoticia("Novo recorde na bolsa",
                "Índice alcança maior alta em 10 anos.",
                "27/08/2025");
    }
}