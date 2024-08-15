package ar.edu.unju.fi.diagnostico;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad;
		System.out.println("Ingrese longitud de cadena ");
		int n= scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese cadena");
		cad = scanner.next();
		
		if(n!=cad.length()) {
			System.out.println("ERROR");
		}
		else {
			int cant=0;//contador
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<=n;j++) {
					int x= cad.substring(i, j).length();//almacena long de subcadena
					cant=cant+substringCount(cad.substring(i, j),x);
					if(substringCount(cad.substring(i, j),x)==1) {
						System.out.println("subcadena : "+ cad.substring(i, j));
					}		
				}
			}
			System.out.println("total : "+ cant);
		
		}
	
	}

	public static int substringCount(String cad,int n) {
		int j=n-1;
		boolean band=true;
		for(int i=0;i<cad.length() && band;i++) {
			if(cad.charAt(i)!= cad.charAt(j) && i!=j) {
				band=false;
				return 0;
			}
			j--;
		}
		return 1;
	}
	
}
