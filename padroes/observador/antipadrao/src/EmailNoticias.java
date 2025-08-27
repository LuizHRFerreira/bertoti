public class EmailNoticias {
    public static int totalManchetes = 0;
    private String[] manchetes = new String[100];

    public void adicionarNaLista(String titulo, String conteudo, String data) {
        manchetes[totalManchetes] = titulo + " | " + conteudo + " | " + data;
        totalManchetes++;
        System.out.println("E-mail (duplicado): Manchete armazenada - " + titulo + ", total: " + totalManchetes);
    }

    public int getTotal() {
        return totalManchetes;
    }
}