package principal;

import java.util.Scanner;

import entes.Alumnos;
import entes.Escuela;
import entes.Examen;

public class Ejecutable {

	public Ejecutable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float suma = 0, promedio = 0;
		int notaBaja, notaAlta, aprobados, reprobados;
		Scanner scanner = new Scanner (System.in);
		Escuela escuelaXyz = new Escuela();
		
		
		System.out.println("Ingrese cantidad alumno de almunos");
		int cantAlum = scanner.nextInt();
		Alumnos [] a = new Alumnos [cantAlum]; 
			
		
		//creando ciclos para obtener datos por consola y almacenarlos en arreglos.
		
		int i = 0;
		while (i < cantAlum) {
			System.out.println("Ingrese el nombre del alumno " + (i+1) + ":");
			String nombre = scanner.next ();
			System.out.println("Ingrese el apellido del alumno " + (i+1) + ":");
			String apellido = scanner.next ();
			System.out.println("Ingrese la cantidad de notas del alumno " + i + ":");
			int cantNotas = scanner.nextInt();
			a[i] = new Alumnos(nombre, apellido, cantNotas);
			
			
			int  j= 0;
			while (j < cantNotas) {
				Examen [] e = new Examen [cantNotas];
				System.out.println("Ingrese numero de examen " + (j+1) + ":");
				int numeroExamen = scanner.nextInt();	
				System.out.println("Ingrese nota " + (j+1) + ":");
				float notas = scanner.nextFloat();
				e[i] = new Examen(numeroExamen, notas);
				j++;
			}
			
			i++;
		} 
		
		//Mostrar nombre alumno con calificacion mas baja o alta// y nombre alumno promocionado o reprobado.
			
		notaBaja = Escuela.iNotaBaja(a);
		System.out.println("la nota mas baja es ");
		System.out.println(a[notaBaja].datosAlumno());
		
		notaAlta = Escuela.iNotaAlta(a);
		System.out.println("la nota mas alta es ");
		System.out.println(a[notaAlta].datosAlumno());
		
		aprobados = Escuela.alumAprobados(a);
		System.out.println("alumno/s promocionado/s :");
		System.out.println(a[aprobados].datosAlumno());
		
		reprobados = Escuela.alumReprobados(a);
		System.out.println("alumno/s reprobado/s  :");
		System.out.println(a[reprobados].datosAlumno());
		
		 }
		
	}

