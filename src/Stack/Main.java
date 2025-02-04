package Stack;
import equals_hash_code.*;
import java.util.Stack;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Carro> pilhaCarros = new Stack<>();
		
		pilhaCarros.push(new Carro("Ford"));
		pilhaCarros.push(new Carro("Fusca"));
		pilhaCarros.push(new Carro("Chevette"));
		pilhaCarros.push(new Carro("BMW"));
		
		System.out.println(pilhaCarros);
		System.out.println(pilhaCarros.pop());
		System.out.println(pilhaCarros);
		
	}

}
