class Conta {

    protected String titular;
    protected double saldo;
    private Emprestimo regraEmprestimo;

    public Conta(String titular, double saldoInicial, Emprestimo regraEmprestimo) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.regraEmprestimo = regraEmprestimo;
    }

    public void verificarEmprestiomo(){
        if
        (regraEmprestimo.emprestar()) {
            System.out.println("Empréstimo aprovado");
        }else{
            System.out.println("Empréstimo não aprovado");
        }
    }
}