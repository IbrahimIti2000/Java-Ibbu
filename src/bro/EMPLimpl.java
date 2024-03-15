package bro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EMPLimpl {

	public static void main(String[] args) {
		List<EMPL> emp = new ArrayList<EMPL>();
		emp.add(new EMPL(2, "Ibrahim", 35000));
		emp.add(new EMPL(1, "Ibrahim", 45000));
		emp.add(new EMPL(3, "Yaseen", 55000));
		emp.add(new EMPL(5, "Jaheer", 35000));
		emp.add(new EMPL(4, "Husai", 38000));
		Comparator<EMPL> com = new Comparator<EMPL>() {

			@Override
			public int compare(EMPL o1, EMPL o2) {
				if (o1.getEid() > o2.getEid())
					return 1;
				else {
					return -1;
				}

			}
		};
		Collections.sort(emp,com);
		for (EMPL empl : emp) {
			System.out.println(empl.getEid() + "  " + empl.getName() + "  " + empl.getEsalary());
		}
	}

}
