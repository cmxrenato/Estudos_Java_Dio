package aspectos;

import banco.Conta;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class VerificadorSaldoAspect {

    @Before("execution(* banco.Conta+.sacar(..)) && args(valor)")
    public void verificarSaldo(JoinPoint joinPoint, double valor) {
        Conta conta = (Conta) joinPoint.getTarget();
        if (conta.getSaldo() < valor) {
            System.err.println("Saldo insuficiente para saque de R$ " + valor);
            throw new RuntimeException("Saldo insuficiente!");
        }
    }
}
