package ejercicio03;

public class Operaciones {

	public boolean comprobarSigno(int num) {
		boolean resul;
		if (num > 0) {
			resul = true;

		} else {
			resul =  false;
		}
		return resul;
	}

	public void mostrarSigno(boolean resul){
		if (resul==true) {
			System.out.println("El número dado es positivo");
		}else{
		System.out.println("El número dado es negativo");
		}
	}

	public boolean comprobarPar(int num) {
		int dos = 2;
		boolean resul;
		if (num % dos == 0) {
			resul=true;
		} else {
			resul=false;
		}
		return resul;
	}

	public void mostrarPar(boolean resul) {
		if (resul) {
			System.out.println("El número dado es par");
	
		}else{System.out.println("El número dado es impar");
		
		}
		
	}
}
