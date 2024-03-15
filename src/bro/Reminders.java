package bro;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reminders {
	@Override
	public String toString() {
		return "Reminders [id=" + id + ", topic=" + topic + ", time=" + time + "]";
	}

	private int id;
	private String topic;
	private LocalDateTime time;
	private List<Reminders> rem = new ArrayList<Reminders>();

	public void addreminders(Reminders reminders) {
		boolean val = validated(reminders);
		
		if (!val) {
			throw new RuntimeException("Reminder Enter is not valid   " +reminders);
		}
		rem.add(reminders);
	}

	public Reminders() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public Reminders(int id, String topic, LocalDateTime time) {
		super();
		this.id = id;
		this.topic = topic;
		this.time = time;
	}

	public void rprint() {
		rem.forEach(re -> System.out.println(re));
		
	}

	public void remorem(int id) {
		rem.remove(--id);

	}

	public void saverem(String filename) throws FileNotFoundException {
		PrintStream wr=new PrintStream(new FileOutputStream(filename));
		for (Reminders reminders : rem) {
			wr.println(reminders);
		}
		
	}
	
	public boolean validated(Reminders rem) {
		if (rem.getId()<=0) {
			return false;
		}
		if (rem.getTopic().isBlank()) {
			return false;
		}
		
		return true;
	}

}
