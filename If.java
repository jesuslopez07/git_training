import java.util.Scanner;
public class If{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	if(n < 120)
		System.out.println("massa petit!");
	else
		System.out.println("massa gran!");
	}
}
