class ContaAposentado extends Conta {

    public ContaAposentado(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void emprestimo(double valor) {
        System.out.println("Empréstimo aprovado para Conta aposentado: " + valor);
        saldo += valor;
    }
}