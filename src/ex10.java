import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una cantidad de ventas: ");
		int ventas = sc.nextInt();
		int precioVentaTotal = 0;
		
        for (int i = 1; i <= ventas; i++) {
            System.out.println("Indica el precio del producto " + i + ":");
            int precioVenta = sc.nextInt();
            precioVentaTotal += precioVenta; // Sumamos cada precio de cada producto al total
        }
        System.out.println("El precio total de los productos es de " + precioVentaTotal + "€");

	}

}
