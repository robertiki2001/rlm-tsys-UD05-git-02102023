import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// TODO Auto-generated method stub
		System.out.println("Introduce el valor de X");
		int x = sc.nextInt();
		
		System.out.println("Introduce el valor de Y");
		int y = sc.nextInt();
		
		if (y > x)
		{ 
			System.out.println("Y es mayor que X");
		}
			
		else if (y == x)
		{ 
			System.out.println("Y es igual que X");
		}
		else
		{ 
			System.out.println("Y es menor que X");
		}
		
	}
		
	
}

