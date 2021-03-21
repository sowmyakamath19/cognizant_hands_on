import java.util.ArrayList;
import java.util.List;
public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>();
		a.add("bat");
		a.add("cat");
		a.add("hat");
		Object []arr=a.toArray();
		for(Object array:arr) {
			System.out.println(""+array);
			
			
		}
	}

}
