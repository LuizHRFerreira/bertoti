public class SiteNoticias implements ObservadorNoticia {
    @Override
    public void atualizar(Manchete manchete) {
        System.out.println("Site: Nova manchete publicada - " +
                "<h1>" + manchete.getTitulo() + "</h1>" +
                "<p>" + manchete.getConteudo() + "</p>" +
                "<small>" + manchete.getDataPublicacao() + "</small>");
    }
}