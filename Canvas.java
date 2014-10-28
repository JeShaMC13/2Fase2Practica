
package ListaEnlazada;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;


//public class Canvas extends JFrame {

/*import java.awt.Dimension;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;*/

//public class Canvas extends JPanel{

	public class Canvas implements ActionListener{//implementando el listener de eventos
	JLabel Nombre;
	JButton Boton1;//creando variables globales de los botones
	JButton Boton2;
	public Object Botton1;
	public Object Botton2;
	public Object Label;
	private Container contenedor;
 
	
	
	public Canvas(){//constructor de la clase

		JFrame jf = new JFrame("Train Simulator");//creacion de ventana con el titulo
		jf.setLayout(new FlowLayout());//Configurar como se dispondra el espacio del jframe
		Dimension d = new Dimension();//objeto para obtener el ancho de la pantalla

		//Instanciando botones con texto

		Nombre =new JLabel("Comenzar");
		JButton Boton1 = new JButton("Retroceder");
		JButton Boton2 = new JButton("Inicio");
		JPanel graph = new JPanel();
	
		
		//contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		//contentPane.setLayout(null);
		
		// Boton1.setMargin(new Insets(1, 5, 3, 88));
	     //Boton2.setMargin(new Insets(1, 5, 3, 4));
	     
	    // Boton1.setBackground(Color.orange);
	    //Boton2.setBackground(Color.orange);
	     
	    
	    
	    
	    // Boton1.setBounds (0,0,0,0);
	    // Boton2.setBounds (10,10,70,20);
	    //contenedor = null;
	    //contenedor.setLayout(null);  // Eliminamos el layout
	    //contenedor.add (Boton1); // Añadimos el botón
		//Boton1.setBounds (10,10,40,20); // Botón en posicion 10,10 con ancho 40 pixels y alto 20
	//agregando los botones a la ventana
	     
		jf.add(Boton1, BorderLayout.SOUTH); 
		jf.add(Boton2, BorderLayout.EAST); 
		jf.add(Nombre);
		jf.add(graph);
		
		//añadiendo el listener a los botones para manipular los eventos del click
		Boton1.addActionListener(this);
		Boton2.addActionListener(this);
	
		

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//finaliza el programa cuando se da click en la X        
		jf.setResizable(false);//para configurar si se redimensiona la ventana
		jf.setLocation((int) ((d.getWidth()/2)+290), 50);//para ubicar inicialmente donde se muestra la ventana (x, y)
		jf.setSize(800, 600);//configurando tamaño de la ventana (ancho, alto)
		jf.setVisible(true);//configurando visualización de la venta
		jf.add(graph);
 
			
		}
	

	private static void add(String string, Object b22) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		Canvas S = new Canvas();//uso de constructor para la ventana
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener
			if(e.getActionCommand().equals("Retroceder")){//podemos comparar por el contenido del boton
			JOptionPane.showMessageDialog(null, e.getActionCommand());
		}
		if(e.getActionCommand().equals("Inicio")){//podemos comparar por el contenido del boton
			JOptionPane.showMessageDialog(null, e.getActionCommand());
		}
		if(e.getSource()==Boton1){//podemos comparar por el nombre del objeto del boton
			JOptionPane.showMessageDialog(null, e.getActionCommand());
		}
		if(e.getSource()==Boton2){//podemos comparar por el nombre del objeto del boton
			JOptionPane.showMessageDialog(null, e.getActionCommand());
		}
	}
}

/*Canvas ventana=new Canvas();

//	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	private static final long serialVersionUID = 1L;

private static final String JPane = null;
	JButton Retroceder = new JButton("Retroceder");
	JButton Inicio= new JButton("Inicio");

	//CREAMOS UN PANEL PARA COLOCAR LOS BOTONES
	JPanel principal = new JPanel(new BorderLayout());

	public Canvas(){
		super();
		principal.add("South", Retroceder);
		principal.add("South", Inicio);

		getContentPane().add(principal);

		//AGREGAMOS TOOL TIPS A LOS BOTONES
	Retroceder.setToolTipText("Botón ACEPTAR...");
		Inicio.setToolTipText("Botón CANCELAR...");

		pack();
		setResizable(false); 
		Dimension pantalla, cuadro;
		pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		cuadro = this.getSize();

		//this.setLocation(((pantalla.width + cuadro.width)/6), (pantalla.height + cuadro.height)/6);
	}//FIN DEL CONSTRUCTOR DE LA CLASE

	public static void main(String g[]){
		Canvas p = new Canvas();
		p.show();
		JPanel.jframe=new JFrame("Train Simulator 1885");
		JPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel.setSize(800, 600);
		JPanel.setVisible(true);

		p.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				System.exit(0);
			}
		});
	}	*/
	//FIN DEL MAIN








