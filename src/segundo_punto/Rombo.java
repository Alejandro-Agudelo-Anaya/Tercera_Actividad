package segundo_punto;

public class Rombo {
	double Lado,DiagonalM,DiagonalI;
	Rombo(double Lado, double DiagonalM,double DiagonalI){
	this.Lado=Lado;
	this.DiagonalM=DiagonalM;
	this.DiagonalI=DiagonalI;
	}
	double calcularArea() {
	return (DiagonalM*DiagonalI)/2;
	}
	double calcularPerimetro() {
	return 4*Lado;
	}
	

}
