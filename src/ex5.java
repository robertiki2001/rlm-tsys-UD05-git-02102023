import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		
		if(numero%2 == 0) 
		{
		System.out.println("El número és divisible entre 2");
						
		}
		else 
		{
			System.out.println("El número no és divisible entre 2");
		}
	

	}

}
