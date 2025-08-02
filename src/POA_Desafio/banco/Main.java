package banco;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(1000);

        cc.depositar(500);
        cc.sacar(200); // OK
        cc.sacar(2000); // Disparará o Aspect (saldo insuficiente)
    }
}
