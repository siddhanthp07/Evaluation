import java.util.*;

public class SearchCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Boolean found=false;
		System.out.print("Enter no of course:");
		int size = scn.nextInt();
		String[] course = new String[size];
		System.out.print("Enter course names:");
		for(int i=0;i<size;i++)
			course[i] = scn.next();
		System.out.print("Enter course to be searched:");
		String cname = scn.next();
//		System.out.println(cname);
		
		for(int i=0;i<size;i++) {
			if(course[i].equals(cname)) {
				System.out.println(cname+" course is available");
				found = true;
				break;
			}
		}
		if(!found)
			System.out.println(cname+" "+"course not available");
		
		
		scn.close();
	}

}
