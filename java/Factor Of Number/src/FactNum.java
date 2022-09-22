import java.util.*;
public class FactNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		if(x<0)
			x = -x;
		System.out.println(x);	
		int i;
		for(i=1;i<=x;i++) {
			if(x%i == 0 )
			System.out.print(i+" ");			
		}
		scn.close();
	}

}
