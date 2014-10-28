package ListaEnlazada;
import java.awt.*;
import javax.swing.JPanel;

public class Graficos {
	
	@SuppressWarnings("serial")
	public class Panel extends JPanel {
		// dibuja rectángulos y objetos String en distintos colores
		public void paintComponent( Graphics g )
		{
		//super.paintComponent( g ); 
		// llama el método paintComponent de la superclase

		this.setBackground( Color.WHITE );

		
		g.setColor( Color.BLACK );
		g.fillRect( 15, 75, 100, 50 );
		
		g.setColor( Color.cyan );
		g.fillRect( 150, 75, 100, 50 );
		
		g.setColor( Color.YELLOW );
		g.fillRect( 250, 75, 100, 50 );
		
		g.setColor( Color.DARK_GRAY );
		g.fillRect( 400, 75, 100, 50 );
		
		g.setColor( Color.green );
		g.fillRect( 500, 75, 100, 50 );
		
		g.setColor(Color.RED);
		g.drawLine(0,0,800,500);
		
		g.setColor(Color.RED);
		g.drawLine(0,500,800,0);
		
		}
		public void update(Graphics g){
			update(g);
		}
	}
}
