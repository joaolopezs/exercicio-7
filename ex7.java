import java.util.Scanner;
public class ex7 {

	public static void main(String[] args) {
		
		double L;
		double area;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o lado do quadrado: ");
		
		L = sc.nextDouble();
		
        
		sc.close();
		
		area = (Math.pow(L,2));
		
		
		
		System.out.println("A area do quadrado é  : " + area);
		
		

	}

}
