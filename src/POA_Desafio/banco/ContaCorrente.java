package banco;

public class ContaCorrente extends Conta {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor; // A verificação será feita pelo Aspect
        System.out.println("Saque realizado: R$ " + valor);
    }
}
