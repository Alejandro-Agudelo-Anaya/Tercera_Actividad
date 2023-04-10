package segundo_punto;

import javax.swing.JOptionPane;

public class TrianguloRectangulo {
	int base,altura;
	public TrianguloRectangulo(int base,int altura) {
	this.base=base;
	this.altura=altura;
	}
	double calcularArea() {
	return (base*altura/2);
	}
	double calcularPerimetro() {
	return (base+altura+calcularHipotenusa());
	}
	double calcularHipotenusa() {
	return Math.pow(base*base+altura*altura, 0.5);
	}
	void determinarTipoTriangulo() {
	if((base==altura)&&(base==calcularHipotenusa())&&(altura==calcularHipotenusa())
	)
	JOptionPane.showMessageDialog(null, "Es un triangulo equilatero");
	
	else if(((base != altura) && (base != calcularHipotenusa()) && (altura != 
	calcularHipotenusa())))
	JOptionPane.showMessageDialog(null, "Es un triangulo escaleno");
	else
	JOptionPane.showMessageDialog(null, "Es un triangulo isosceles");
	}
	}


