
public class String1 {
	public static void main(String[] args) {
		
		String []s=new String[3];
		s[0]="punam";
		s[1]="bhagwan";
		
		
		int []a= {1,2,3,4};
		
		for(int i=0;i<s.length;i++) {
			if(s[i]==null) {
				System.out.println(i);
			}
		}
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(i);
			
		}
		/*
		 * for(String a:s) { System.out.println(a); }
		 */
		
	}

}
