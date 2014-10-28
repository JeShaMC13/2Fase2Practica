package ListaEnlazada;
public class Nodos {

private Nodos siguiente;
private int Numero;
private String tipo;

;
public Nodos(int Numero, String tipo){
	this.setNumero( Numero);
	this.setTipo(tipo);
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public Nodos getSiguiente() {
	return siguiente;
}

public void setSiguiente(Nodos siguiente) {
	this.siguiente = siguiente;
}

public int getNumero() {
	return Numero;
}

public void setNumero(int numero) {
	Numero = numero;
}

}

