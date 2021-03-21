
public class DisplayCharLine {

	public static void main(String[] args) {
		
		String str=" My name is Sowmya\n I have completed my BE.";
		int c=0,w=0,l=1;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='\n') {
				l++;
			}
			else if (str.charAt(i) ==' ') {
				w++;
			}
			else if (str.charAt(i)!=' ') {
				c++;
			}
		}
		 System.out.println("\nNumber of lines : "+l);
         System.out.println("\nNumber of words : "+w);
         System.out.println("\nNumber of characters : "+c);
	}

}