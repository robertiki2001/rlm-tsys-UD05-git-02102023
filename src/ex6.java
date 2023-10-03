import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el precio del producto: ");
		double numero = sc.nextDouble();
		double IVA = 0.21;
		double total = numero * IVA;
		
		System.out.println("El producto tiene un precio de "+(total+ numero));
						
	}
}



