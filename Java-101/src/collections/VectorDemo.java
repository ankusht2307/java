package collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String args[]) {
		
			Vector v = new Vector();
			v.add(1);
			v.add(6);
			
			// vector increases the size of an aaray by 100% if reached the limit
			// makes array dynamic
			// vectors are synchronised(threadsafe)
			System.out.println(v.capacity());
		}

}
