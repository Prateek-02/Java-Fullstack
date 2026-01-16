package Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		Iterator it = a.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
