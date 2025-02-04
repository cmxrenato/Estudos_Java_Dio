package equals_hash_code;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Carro> listaCarros = new ArrayList<Carro>();
		
		listaCarros.add(new Carro("Ford"));
		listaCarros.add(new Carro("Fiat"));
		listaCarros.add(new Carro("Mercedes"));
		listaCarros.add(new Carro("BMW"));
		
		Object testeExiste = listaCarros.contains(new Carro("Mercedes"));
		
		System.out.println(testeExiste);
		System.out.println(new Carro("Ford").hashCode());
		
		Carro carro1 = new Carro("Ford");
		Carro carro2 = new Carro("BMW");
		
		System.out.println(carro1.equals(carro2));
		
	}

}
