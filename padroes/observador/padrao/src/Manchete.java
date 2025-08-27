public class Manchete {
    private final String titulo;
    private final String conteudo;
    private final String dataPublicacao;

    public Manchete(String titulo, String conteudo, String dataPublicacao) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataPublicacao = dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }
}