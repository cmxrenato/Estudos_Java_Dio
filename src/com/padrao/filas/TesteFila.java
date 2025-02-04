package com.padrao.filas;

public class TesteFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fila fila = new Fila();
		
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
		System.out.println(fila);
	}

}
