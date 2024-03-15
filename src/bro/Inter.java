package bro;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class Inter {
	public static void main(String[] args) {

		ConcurrentHashMap<String, String> c = new ConcurrentHashMap<String, String>();
		Vector v = new Vector();
		v.add(6);
		v.add("Ibbu");
		v.add(9);
		v.add(6);
		v.add("Ibbu");
		v.add(9);
		Enumeration elements = v.elements();

		while (elements.hasMoreElements()) {
			Object nextElement = elements.nextElement();
			System.out.println(nextElement);
		}

//		c.put("Ibbu", "Ibrahim1");
//		c.put("Ibbu1", "Ibrahim2");
//		c.put("Ibbu2", "Ibrahim3");
//		c.put("Ibbu3", "Irahim4");
//		c.put("Ibbu4", "ibrahim5");
//
//		Iterator<String> iterator = c.keySet().iterator();
//
//		while (iterator.hasNext()) {
//			String next = iterator.next();
////			System.out.println(next);
//////			System.out.println(c.get(next));
//			c.put("Ibbu5", "Ibrahim6");
//
//		}
//
//		List<String> l = new ArrayList<String>();
//		l.add("Ibbu1");
//		l.add("Ibbu2");
//		l.add("Ibbu3");
//		l.add("Ibbu4");
//		l.add("Ibbu5");
//
//		Iterator<String> iterator2 = l.iterator();
//
//		while (iterator2.hasNext()) {
//
//			String next = iterator2.next();
//			System.out.println(next);
//
//			l.add("Ibbu6");
//
//		}

	}

}
