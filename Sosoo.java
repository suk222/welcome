package backjoon0419;
import java.util.Scanner;
public class Sosoo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(); //m<=n
		int n = sc.nextInt();
		int count=0; 
		int res=0;
		int min=n, sum=0;//�ּڰ�, ��
		for(int i=m; i<=n; i++) {
			count=0;
			for(int j=1; j<=i; j++) {
				if(i % j == 0){
					count++;
				}
			}
			if(count == 2)
			sum += i;//�Ҽ��� ��
			if(i<min && count == 2)
				min=i;
		}
		if(sum != 0) {
		System.out.println(sum);
		System.out.println(min);
		}
		else
			System.out.println("-1");
	}

}
