package geral.projetoEscola;

public class MainEscola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Escola escolaPrimeira = new Escola("escolaPrimeira", "0499483293-93");
		Aluno aluno1 = new Aluno("Renato",4565, 33);
		Aluno aluno2 = new Aluno("Maria", 1235, 16);
		Aluno aluno3 = new Aluno("Joao", 6932, 32);
		Aluno aluno4 = new Aluno("Jose", 8795, 45);
		Aluno aluno5 = new Aluno("Joaquim", 2345, 26);
		Aluno aluno6 = new Aluno("Pedro", 2875, 18);
		
		escolaPrimeira.matricularAluno(aluno1);
		escolaPrimeira.matricularAluno(aluno2);
		escolaPrimeira.matricularAluno(aluno3);
		escolaPrimeira.matricularAluno(aluno4);
		escolaPrimeira.matricularAluno(aluno5);
		//escolaPrimeira.matricularAluno(aluno6);
		
		//System.out.println(escolaPrimeira.getDiscentes());
		
		escolaPrimeira.criarDepartamento("Pedagógico");
		escolaPrimeira.criarDepartamento("Financeiro");
		escolaPrimeira.criarDepartamento("Administrativo");
		//escolaPrimeira.criarDepartamento("cultural");
		
		
		
		//System.out.println(escolaPrimeira.getNr_departamentos());
		//System.out.println(escolaPrimeira.getDepartamentos());
		escolaPrimeira.setEndereco("Rua primeira", 02);
		System.out.println(escolaPrimeira.getEndereco());

	}

}
