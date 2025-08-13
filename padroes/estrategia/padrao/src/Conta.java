class Conta {

    protected String titular;
    protected double saldo;
    private Emprestimo regraEmprestimo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void setEmprestimo(Emprestimo emprestimo){
        this.regraEmprestimo = emprestimo;
    }

    public String verificarEmprestiomo(){
        return regraEmprestimo.emprestar();
    }
}