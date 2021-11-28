package main;

public class MCD {

	// Cálculo del MCD usando el algoritmo de Euclides y recursión
	public static Integer mcd(Integer nro1, Integer nro2) {
		if (nro2.equals(0)) { // por propiedad, (a:0)=a
			return nro2;
		} else {
			return Math.abs(euclides(nro1, nro2));
		}
	}

	private static Integer euclides(Integer dividendo, Integer divisor) {
		if (dividendo % divisor == 0) {
			return divisor;
		}
		Integer cociente = dividendo / divisor;
		Integer resto = dividendo - divisor * cociente;
		return euclides(divisor, resto);
	}
}
