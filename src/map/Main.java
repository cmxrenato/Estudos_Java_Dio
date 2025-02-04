package map;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("Nome", "João");
		aluno.put("Idade", "18");
		aluno.put("Media", "8.5");
		aluno.put("Turma", "3a");
		
		Map<String, String> aluno2 = new HashMap<>();
		
		aluno2.put("Nome", "Maria");
		aluno2.put("Idade", "18");
		aluno2.put("Media", "4.5");
		aluno2.put("Turma", "1a");
		
		System.out.println(aluno);
		System.out.println(aluno.keySet());
		System.out.println(aluno.values());
		
		List<Map<String, String>> listaAlunos = new ArrayList<>();
		
		listaAlunos.add(aluno);
		listaAlunos.add(aluno2);
		
		System.out.println(listaAlunos);
		
		

	}

}
