package entes;

public class Escuela {

	public String alumnos;
	public int notas;

	// constructores
	public Escuela(String alumnos, int notas) {
		this.alumnos = alumnos;
		this.notas = notas;
	}

	public Escuela() {
		// TODO Auto-generated constructor stub
	}

	public String getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(String alumnos) {
		this.alumnos = alumnos;
	}

	public int getNotas() {
		return notas;
	}

	public void setNotas(int notas) {
		this.notas = notas;
	}

	// metodos y funciones
	public static int iNotaBaja(Alumnos calificaciones[]) {
		float a;
		int indice = 0;
		int i;
		a = calificaciones[0].getNotas();
		for (i = 1; i < calificaciones.length; i++) {
			if (calificaciones[i].getNotas() <= a) {
				a = calificaciones[i].getNotas();
				indice = i;
			}
		}

		return indice;

	}

	public static int iNotaAlta(Alumnos calificaciones[]) {
		float a;
		int indice = 0;
		int i;
		a = calificaciones[0].getNotas();
		for (i = 1; i < calificaciones.length; i++) {
			if (calificaciones[i].getNotas() > a) {
				a = calificaciones[i].getNotas();
				indice = i;
			}
		}

		return indice;
	}

	public static int alumAprobados(Alumnos calificaciones[]) {
		float a;
		int indice = 0;
		int i;
		a = calificaciones[0].getNotas();
		for (i = 1; i < calificaciones.length; i++) {
			if (calificaciones[i].getNotas() >= 7f) {
				a = calificaciones[i].getNotas();
				indice = i;
			}
		}

		return indice;
	}

	public static int alumReprobados(Alumnos calificaciones[]) {
		float a;
		int indice = 0;
		int i;
		a = calificaciones[0].getNotas();
		for (i = 1; i < calificaciones.length; i++) {
			if (calificaciones[i].getNotas() <= 7f) {
				a = calificaciones[i].getNotas();
				indice = i;
			}
		}

		return indice;
	}

}
