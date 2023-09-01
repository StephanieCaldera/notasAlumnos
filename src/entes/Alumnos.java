
package entes;


public class Alumnos {

	
	public String nombre;
	public String apellido;
	public float notas;
	

	public Alumnos(String nombre, String apellido, float notas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.notas = notas;
			}
			

	public Alumnos() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public float getNotas() {
		return notas;
	}

	public void setNotas(float notas) {
		this.notas = notas;
	
	}


	
	public String datosAlumno () {
		return "Alumnos [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	

	
	

	

	
	
	
}