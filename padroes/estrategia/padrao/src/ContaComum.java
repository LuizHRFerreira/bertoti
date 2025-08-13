class ContaComum extends Conta {

    public ContaComum(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void emprestimo(double valor) {
        throw new UnsupportedOperationException("Emprestimo não permitido para conta comum.");
    }
}