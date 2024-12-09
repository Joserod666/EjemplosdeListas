
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista = new Lista();
		
		lista.insertarNodoFinal(2);
		lista.insertarNodoFinal(5);
		lista.insertarNodoFinal(4);
		lista.insertarNodoFinal(7);
		lista.insertarNodoEntreNodos(2, 7, 88);
		lista.imprimirLista();
		lista.eliminarNodo(7);
		lista.imprimirLista();
		lista.eliminarNodo(5);
		lista.imprimirLista();
	}

}
