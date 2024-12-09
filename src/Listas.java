import java.util.ArrayList;
import java.util.Scanner;
//nombres y apellidos 1
//nombres y apellidos 2
public class Listas {
	
	private ArrayList<Integer> lista;
	private ArrayList<String> lista2;
	
	public void ejercicio1() {
		int i, elementos;
		lista = new ArrayList<Integer>();
		
		lista.add(10);
		lista.add(23);
		
		if (lista.isEmpty()) {
			System.out.println("Lista vacia");
		}
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite num. elementos:");
		elementos = entrada.nextInt();
		
		for (i = 0 ; i < elementos ; i++) {
			lista.add(i * i);
		}
		
		System.out.println("Lista Completa");
		imprimirLista();
		if (lista.contains(4)) {
			System.out.println("Lista contiene elemento 4");
		}
		//lista.remove(0);
		//lista.remove(0);
		//System.out.println("Lista borrada en los 2 primeros elementos");
		//imprimirLista();
	}
	
	public void imprimirLista() {
		System.out.println("tamanio de la lista:"+lista.size());
		int i;
		for (i = 0 ; i< lista.size() ; i++) {
			System.out.println("Elemento:"+lista.get(i));
		}
	}
	
	public void ejercicio2() {
		lista2 = new ArrayList<String>();
		lista2.add("Dato 1");
		lista2.add("Datos 2");
		lista2.add("Programación");
		for (int i = 0 ; i<lista2.size() ; i++) {
			System.out.println("Dato:"+lista2.get(i)+" longitud "+lista2.get(i).length());
		}
	}

}
