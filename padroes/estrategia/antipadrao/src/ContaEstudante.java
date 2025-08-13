class ContaEstudante extends Conta {

    public ContaEstudante(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void emprestimo(double valor) {
        throw new UnsupportedOperationException("Empréstimo não permitido para conta estudante.");
    }
}