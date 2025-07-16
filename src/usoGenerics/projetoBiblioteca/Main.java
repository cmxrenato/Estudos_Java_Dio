package usoGenerics.projetoBiblioteca;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Livro> estante = new HashMap<>();
		
		Livro livro1 = new Livro("Ecce Homo", "Nietzsche", 1875);
		Livro livro2 = new Livro("Olá mundo", "Anônimo", 2019);
		Livro livro3 = new Livro("O que é a vida", "O filósofo", 400);
		
		estante.put(1, livro1);
		estante.put(2, livro2);
		estante.put(3, livro3);
		
		for (Map.Entry<Integer, Livro> livro: estante.entrySet()) {
		    Integer chave = livro.getKey();
		    Livro valor = livro.getValue();
		    System.out.println("Código: "+chave + " - " + valor);
		}
		
		daDecada(estante);
	}
	
	
	public static void daDecada(Map<Integer, Livro> estante) {
        boolean achou = false;
        for (Map.Entry<Integer, Livro> livro : estante.entrySet()) {
            Livro valor = livro.getValue();
            // Aqui assumo que Livro tem método getAno()
            if (valor.getAno() >=2020) {
                System.out.println(valor);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Nenhum livro encontrado");
        }
    }
}

