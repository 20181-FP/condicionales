import java.util.Scanner;

public class Cond01 {
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
		System.out.print("x:");
		double x = Double.parseDouble( reader.nextLine() );
		if (x >= 0) {
			System.out.print("|x|:"+x);
		}else {
			System.out.print("|x|:"+x*-1);
		}
	}
}