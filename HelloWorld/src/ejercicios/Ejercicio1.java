package ejercicios;
import java.util.Scanner;
//Ejercicio 1
//Leer 10 datos numéricos y mostrarlos en orden inverso

public class Ejercicio1 {
	public static void main(String[] args) {
	int[] arreglo = new int[10];
	Scanner s=new Scanner(System.in);
	for (int i=0; i < 10; i++){
		System.out.println("introduzca numero");
		arreglo[i]= s.nextInt();	
	}
		for (int i=9;i>0;i--){
			System.out.println(arreglo[i]);
		}
		s.close();
	}

}
