package ejercicios;

import java.util.Scanner;


public class Ejercicio2 {


	public static void main(String[] args) {
		int[] a= new int[20];	
		int n;
		int j=0;
		int m;
		Scanner s=new Scanner(System.in);
		System.out.println("mete el numerito inicial");
		n=s.nextInt();
		System.out.println("ahora los 20 numeros");
		for(int i=0; i<20;i++){
			
		m=s.nextInt();
		if(m>n){
			a[j]=m;
			j++;
		}
	}
		for(n=0;n<j;n++){
			System.out.println(a[n]);
		}
s.close();
	}

}
