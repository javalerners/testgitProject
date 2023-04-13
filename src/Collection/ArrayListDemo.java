package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> studName=new ArrayList<>();
		
		studName.add("vidhi");
		studName.add("bhusare");
		studName.add("rohini");
		studName.add("sandeep");
		studName.add("sai");
		
		Iterator<String> itr=studName.iterator(); //work in forward direction
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
