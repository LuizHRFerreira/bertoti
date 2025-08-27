class Jogador implements MembroTime {
    private String nome;
    private String posicao;

    public Jogador(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    @Override
    public void mostrar() {
        System.out.println(posicao + ": " + nome);
    }
}
