package ejercicio;

public class Calculadora { // Paso 4
	public int sumar(int operador1, int operador2) {
		return operador1 + operador2;
	}
	public double sumar(double operador1, double operador2) {
		return operador1 + operador2;
	}
	public boolean esNegativo(Integer operador) {
		// TODO Auto-generated method stub
		if(operador < 0) {
			return true;
		}
		return false;
	}
}
