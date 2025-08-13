//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta contaLuiz = new Conta("luiz",50000);
        Conta contaCarlos = new Conta("Carlos",50);

        contaLuiz.setEmprestimo(new Permitido());
        contaCarlos.setEmprestimo(new Proibido());

        System.out.println(contaLuiz.verificarEmprestiomo());
        System.out.println(contaCarlos.verificarEmprestiomo());
    }
}