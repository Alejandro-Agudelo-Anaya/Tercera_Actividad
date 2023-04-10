package segundo_punto;

public class Trapecio {
	double BaseM,BaseI,altura;
	Trapecio(double BaseM, double BaseI,double altura){
	this.BaseM=BaseM;
	this.BaseI=BaseI;
	this.altura=altura;
	}
	double calcularArea() {
	return ((BaseM+BaseI)*altura)/2;
	}
	double calcularPerimetro() {
	double lado=(BaseM-BaseI)/2;
	double Raiz=(altura*altura)+(lado*lado);
	double Hipotenusa= Math.sqrt(Raiz);
	return  BaseM+BaseI+(2*Hipotenusa);
	}
	

}
