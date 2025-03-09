package projetoBanco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Cliente cliente1 = new Cliente("Renato");
		Cliente cliente2 = new Cliente("Maria");
		Cliente cliente3 = new Cliente("José");
		
		System.out.println(" ");
		cliente1.depositar(45.6);
		cliente1.depositar(100d);
		cliente1.sacar(20d);
		
		
		System.out.println("Nome do Cliente: "+cliente1.getCliente());
		System.out.println("Número da conta: "+cliente1.getContaCorrente());
		System.out.println("Saldo da conta: "+cliente1.getSaldoCC());
		
		
		
		
		
		System.out.println(" ");
		cliente2.depositar(55.9);
		
		System.out.println("Nome do Cliente: "+cliente2.getCliente());
		System.out.println("Número da conta: "+cliente2.getContaCorrente());
		System.out.println("Saldo da conta: "+cliente2.getSaldoCC());
		System.out.println(" ");
		
		cliente3.depositar(545.9);
		cliente3.transferir(cliente2, 250d);
		cliente3.transferir(cliente1, 45.9);
		
		System.out.println("Nome do Cliente: "+cliente3.getCliente());
		System.out.println("Número da conta: "+cliente3.getContaCorrente());
		System.out.println("Saldo da conta: "+cliente3.getSaldoCC());
		System.out.println(" ");
		System.out.println("Nome do Cliente: "+cliente1.getCliente());
		System.out.println("Número da conta: "+cliente1.getContaCorrente());
		System.out.println("Saldo da conta: "+cliente1.getSaldoCC());
		System.out.println(" ");
		System.out.println("Nome do Cliente: "+cliente2.getCliente());
		System.out.println("Número da conta: "+cliente2.getContaCorrente());
		System.out.println("Saldo da conta: "+cliente2.getSaldoCC());
		
		
		
	}

}
