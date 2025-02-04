package filas.refatoracaoGenerics;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				Fila<String> fila = new Fila<String>();
				/*
				fila.enqueue(new No("A"));
				fila.enqueue(new No("B"));
				fila.enqueue(new No("C"));
				fila.enqueue(new No("D"));
			
				
				//System.out.println(fila.first());
				//System.out.println(fila.dequeue());
				System.out.println(fila);
				fila.enqueue(new No("E"));
				System.out.println(fila);
				//System.out.println(fila.first());
				
				//fila.dequeue();
				
				fila.enqueue(new No("F"));
				//System.out.println(fila.dequeue());
				System.out.println(fila);*/
				
				fila.enqueue("Um");
				fila.enqueue("Dois");
				fila.enqueue("três");
				fila.enqueue("Quatro");
				fila.enqueue("Cinco");
				
				
				//System.out.println(fila.first());
				fila.dequeue();
				//System.out.println(fila);
				System.out.println(fila);
				
	}

}
