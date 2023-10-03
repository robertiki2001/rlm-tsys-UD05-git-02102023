import java.util.Iterator;
import java.util.Scanner;
public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la contraseña: ");
		String contraseña = sc.nextLine();
		String contraseñaCorrecta = "abc";
		int maxIntentos = 4;
		
		for (int i = 0; i < 4; i++) {
            if (contraseña.equals(contraseñaCorrecta)) {
                System.out.println("Contraseña correcta. ¡Enhorabuena!");
                break; 
            } else {
                System.out.println("Contraseña incorrecta. Le quedan " + (maxIntentos - i - 1) + " intentos.");
                if (i < 3) {
                    System.out.println("Introduce la contraseña nuevamente: ");
                    contraseña = sc.nextLine();
                } else {
                    System.out.println("Has agotado todos los intentos. La contraseña es incorrecta.");
                }
            }
		}
	}
}
