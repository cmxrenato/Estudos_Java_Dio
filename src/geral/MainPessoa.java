package geral;

public class MainPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Teste A");
	    //p1.setNome("Renato");
	    System.out.println("Cód: "+p1.getCodigoIdentificador());
	    System.out.println("Pessoa 1: "+p1.getNome());
	}

}
