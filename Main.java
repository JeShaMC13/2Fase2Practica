package ListaEnlazada;

public class Main {


private Nodos Locomotora;

//Creo la locomotora "Lista"
public Main(){
	Locomotora=null;
}

//Nodo1 sera el primer vagon1 de carbon , vagon2 sera el segundo vagon de pasajeros.
public void Agregar(int Cantidad, String tipo){
	Nodos vagon1=new Nodos(Cantidad, tipo);
	
	if(getCabeza()==null){
		setCabeza(vagon1);
	}else{
		Nodos nuevo=Locomotora;
		while(nuevo.getSiguiente()!=null){
			nuevo=nuevo.getSiguiente();
			
		}
		nuevo.setSiguiente(vagon1);
		vagon1.setSiguiente(new Nodos(0, "4"));
	}
	}

//Este eliminara los vagones, segun el vagon que quiera eliminar
	public void Eliminar(){
		Nodos tmp = Locomotora ;
		Nodos nuevo= tmp;
		
		tmp.setSiguiente(nuevo.getSiguiente().getSiguiente());
	
	}
	
//
	public void EliminarInicial(){
		Nodos Principal= Locomotora;
		while(Principal.getSiguiente()==null);
		
	}
	
	public void EliminarFinal(){
		Nodos ultimo=null;
		if(getCabeza()==null){
			setCabeza(ultimo);
		System.out.println("Ultimo vagon");
		}
	}
	
//Este imprimira el vagon (vagones siguiente de carbon y de pasajeros) si encuentra 
//que la "cabeza" es diferente a null
	
	public void Imprimir(){
		Nodos imprimir;
		for(imprimir=getCabeza(); imprimir!=null; imprimir=imprimir.getSiguiente()){
			System.out.println("Cantidad "+ imprimir.getNumero()+ " tipo "+imprimir.getTipo());
		}
	}
	
	
	public int Tamano(){
	Nodos imprimir;
	int tamano=0;
	for(imprimir=getCabeza(); imprimir!= null; imprimir=imprimir.getSiguiente()){
		tamano++;
		
	} 
	return tamano;
}
private Nodos getCabeza(){
	return Locomotora;
}
private void setCabeza(Nodos Locomotora){
	this.Locomotora =Locomotora;
}
}

