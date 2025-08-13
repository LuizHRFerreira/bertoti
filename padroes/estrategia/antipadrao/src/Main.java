//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta contaLuiz = new Conta("luiz",50000, new Permitido());
        Conta contaCarlos = new Conta("Carlos",50, new Proibido());

        contaLuiz.verificarEmprestiomo();
        contaCarlos.verificarEmprestiomo();
    }
}