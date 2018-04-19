import java.util.Scanner;

public class Cond02 {
	public static void main(String[] args) {
		/*
		Resultado:
		    x>0
		Entrada:
			x
		Proceso:
			 x, x >= 0
       		-x, x < 0
		*/
		Scanner reader = new Scanner(System.in);
		System.out.print("nota1, nota2 y nota3:");
		double n1 = Double.parseDouble( reader.nextLine() );
		double n2 = Double.parseDouble( reader.nextLine() );
		double n3 = Double.parseDouble( reader.nextLine() );
		double p= (n1+n2+n3)/3;
		if (p >= 13) {
			System.out.print("\"Aprobado\"");
		}else {
			System.out.print("\"Desaprobado\"");
		}
	}
}