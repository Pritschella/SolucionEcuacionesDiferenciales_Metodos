import javax.swing.*;
import java.awt.*;

class VentanaInicio extends JFrame{ //Clase donde se implementará la interfaz

						//Componentes que se van a utilizar
	JTextField cajaDerivada, cajaXCero, cajaYCero, cajaN, cajaXi, cajaResultado;  //Cajas de texto que se utilizarán
	JButton solucion; //Botón solución
	
	
	public VentanaInicio() { //Método que da incio a la ventana de la interfaz 
		
				//Configuración de la pantalla principal
		getContentPane().setLayout(null);
		setSize(500, 500);  //Medida de la interfaz
		setTitle("ECUACIONES DIFERENCIALES");  //Título de la interfaz
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
				//Configuración de componentes
		
		//Explicacón las variables que se van a utilizar
		
		JLabel texto = new JLabel("Ingresa: ");  //Texto Ingresa
		texto.setBounds(80, 10, 80, 20);  //Tamaño y posicion del texto Ingresa
		add(texto);		//colocación del componente en la interfaz
		
		JLabel dxdy = new JLabel("dx/dy: Funciones de x y de y"); //Texto dx/dy
		dxdy.setBounds(20, 40, 160, 20);
		add(dxdy);
		
		JLabel x0 = new JLabel("X0: Punto inicial"); //Texto x0
		x0.setBounds(20, 60, 150, 20);
		add(x0);
		
		JLabel y0 = new JLabel("y0: Condición inicial"); //Texto y0
		y0.setBounds(20, 80, 150, 20);
		add(y0);
		
		JLabel xi = new JLabel("Xi: Punto final"); //Texto Xi
		xi.setBounds(20, 100, 150, 20);
		add(xi);
		
		JLabel n = new JLabel("n: Número de intervalos");  //Texto n
		n.setBounds(20, 120, 150, 20);
		add(n);
		
		//*********************************************************************
		
		//Componentes que se van a utilizar
		
		JLabel derivada = new JLabel("dx/dy = "); //Texto dx/dy
		derivada.setBounds(20, 150, 50, 20); //tamaño y posición del texto derivada
		add(derivada); //Agregación del componente a la interfaz
		
		cajaDerivada = new JTextField(); //Caja donde se ingresará la derivada
		cajaDerivada.setBounds(65, 150, 150, 20);
		add(cajaDerivada);
		
		JLabel xYy = new JLabel("(X, Y)"); //Texto que está debajo de la caja
		xYy.setBounds(120, 165, 150, 20);
		add(xYy);
		
		JLabel yX0 = new JLabel("Y ("); //Texo de punto inicial
		yX0.setBounds(20, 185, 20, 20);
		add(yX0);
		
		cajaXCero = new JTextField(); //Caja donde se ingresa X0
		cajaXCero.setBounds(35, 185, 60, 20 );
		add(cajaXCero);
		
		JLabel parentesis = new JLabel(")  = "); //Terminacion del texto de punto inicial
		parentesis.setBounds(95, 185, 20, 20);
		add(parentesis);
		
		JLabel xCero = new JLabel("(X0)"); //Texto que está debajo de la caja de X0
		xCero.setBounds(53, 200, 35, 20);
		add(xCero);
		
		cajaYCero =new JTextField();  //Caja de Y0
		cajaYCero.setBounds(120, 185, 95, 20);
		add(cajaYCero);
		
		JLabel yCero = new JLabel("(Y0)"); //Texto que está debajo de Y0
		yCero.setBounds(160, 200, 35, 20);
		add(yCero);
		
		JLabel yXi = new JLabel("Y ("); //Texto
		yXi.setBounds(20, 220, 20, 20);
		add(yXi);	
		
		cajaXi = new JTextField(); //Caja donde se ingresa Xi
		cajaXi.setBounds(35, 220, 60, 20 );
		add(cajaXi);
		
		JLabel parentesis2 = new JLabel(")  = "); //Terminacion del texto de condicion inicial
		parentesis2.setBounds(95, 220, 20, 20);
		add(parentesis2);
		
		JLabel Xi = new JLabel("(Xi)"); //Texto que está debajo de la caja de X0
		Xi.setBounds(55, 235, 35, 20);
		add(Xi);
		
		
		cajaResultado = new JTextField();
		cajaResultado.setBounds(120, 220, 100, 20);
		add(cajaResultado);
		
		JLabel resultado = new JLabel("resultado");
		resultado.setBounds(150, 235, 100, 20);
		add(resultado);
		
		JLabel n2 = new JLabel("n = ");
		n2.setBounds(300, 185, 30, 20);
		add(n2);
		
		cajaN = new JTextField();
		cajaN.setBounds(320, 185, 100, 20);
		add(cajaN);
		
		JLabel intervalo = new JLabel("intervalo");
		intervalo.setBounds(350, 200, 100, 20);
		add(intervalo);
		
		
		solucion = new JButton("Resolver");
		solucion.setBounds(180, 300, 100, 30);
		add(solucion);
		
		
	}//VentanaInicio
	
	
	
	
	
}//ClassVentanaInicio


public class Prueba {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new VentanaInicio();
			}
		});
		

	}//main

}//clase
