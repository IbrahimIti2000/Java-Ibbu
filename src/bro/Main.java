package bro;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Reminders r=new Reminders();
		Reminders rs1 = new Reminders(101,"Play Cricket",LocalDateTime.of(2024, 02, 25, 10, 15));
		Reminders rs2 = new Reminders(102,"Office",LocalDateTime.of(2024, 02, 25, 1, 15));
		Reminders rs3 = new Reminders(103,"Running",LocalDateTime.of(2024, 02, 25, 4, 15));
		Reminders rs4 = new Reminders(104,"Tv Watching",LocalDateTime.of(2024, 02, 25, 7, 30));
		r.addreminders(rs1);
		r.addreminders(rs2);
		r.addreminders(rs3);
		r.addreminders(rs4);
//		r.remorem(3);
		r.rprint();
		r.saverem("Tuesday Reminder");
		
	}


}
