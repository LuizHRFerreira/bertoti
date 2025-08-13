//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaEmpresa contaEmpresa = new ContaEmpresa("Microsoft", 10000);
        contaEmpresa.emprestimo(20);

        ContaAposentado contaAposentado = new ContaAposentado("Aposentado", 50);
        contaAposentado.emprestimo(30);

        ContaComum contaComum = new ContaComum("Jiuliano Bertoti",0.5);
        contaComum.emprestimo(5000000);

        ContaEstudante contaEstudante = new ContaEstudante("Luiz", 100000);
        contaEstudante.emprestimo(500);
    }
}