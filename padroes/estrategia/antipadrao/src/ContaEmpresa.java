class ContaEmpresa extends Conta {

    public ContaEmpresa(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void emprestimo(double valor) {
        System.out.println("Empréstimo aprovado para Conta Empresa: " + valor);
        saldo += valor;
    }
}