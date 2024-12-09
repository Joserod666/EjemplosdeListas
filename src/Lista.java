public class Lista {

	private Nodo cabeza;

	public Lista() {
		cabeza = null;
	}

	public boolean listaVacia() {
		if (cabeza == null)
			return true;
		else
			return false;
	}

	public Nodo irAlFinal() {
		if (!listaVacia()) {
			Nodo nodo = cabeza;
			while (nodo.sig != null)
				nodo = nodo.sig;
			return nodo;
		} else {
			return null;
		}
	}

	public Nodo buscarNodo(Object val) {
		Nodo p = cabeza;
		Nodo nodo = null;
		boolean encontro = false;
		while (p != null && !encontro) {
			if (p.val == val) {
				encontro = true;
				nodo = p;
			}
			p = p.sig;
		}
		return nodo;
	}
	
	public void insertarNodoEntreNodos(Object a, Object b, Object elemento) {
		Nodo p = buscarNodo(a);
		Nodo q = buscarNodo(b);
		Nodo nuevo = new Nodo(elemento);
		if (p != null && q!= null & p.sig == q.ant) {
			System.out.println("Insertando nodo "+elemento+ " entre :"+p.val +" y "+q.val);
			p.sig = nuevo;
			nuevo.ant = p;
			nuevo.sig = q;
			q.ant = nuevo;
		} else
			System.out.println("No se puede insertar entre nodos");
	}

	public void insertarNodoFinal(Object elemento) {
		Nodo nodo = new Nodo(elemento);
		Nodo ultimo;
		System.out.println("Insertando nodo al final:"+elemento);
		if (!listaVacia()) {
			ultimo = irAlFinal();
			ultimo.sig = nodo;
			nodo.ant = ultimo;
		} else {
			cabeza = nodo;
		}
	}
	
	public void eliminarNodo(Object elemento) {
		Nodo q = buscarNodo(elemento);
		if (q != null) {
			System.out.println("Eliminando Nodo:"+elemento);
			Nodo p = q.ant;
			Nodo r = q.sig;
			p.sig = r;
			q.ant = p;
		}
	}

	public void imprimirLista() {
		Nodo nodo = cabeza;
		while (nodo != null) {
			System.out.print("[ " + nodo.val+" ]->");
			nodo = nodo.sig;
		}
		System.out.println();
	}

}
