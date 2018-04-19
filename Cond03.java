import java.util.Scanner;

public class Cond03 {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("x:");
		int d = reader.nextInt() ;
		switch (d) {
            case 1:  System.out.print("Domingo");
                     break;
            case 2:  System.out.print("Lunes");
                     break;
            case 3:  System.out.print("Martes");
                     break;
            case 4:  System.out.print("Miercoles");
                     break;
            case 5:  System.out.print("Jueves");
                     break;
            case 6:  System.out.print("Viernes");
                     break;
            case 7:  System.out.print("Sábado");
                     break;
            default: System.out.print("Número no válido");
                     break;
        }
	}
}