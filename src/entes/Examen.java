package entes;

public class Examen {
	
	public int numeroExamen;
	public float notas;
	


	public Examen(int numeroExamen, float notas) {
		this.numeroExamen = numeroExamen;
		this.notas = notas;
	}


	public Examen() {
		// TODO Auto-generated constructor stub
	}


	public int getNumeroExamen() {
		return numeroExamen;
	}


	public void setNumeroExamen(int numeroExamen) {
		this.numeroExamen = numeroExamen;
	}


	public float getNotas() {
		return notas;
	}


	public void setNotas(float notas) {
		this.notas = notas;
	}

	
	
}
