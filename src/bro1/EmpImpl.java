package bro1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmpImpl {

	public void serializable() {
		Employee e = new Employee(1, "Ibrahim", "IT", 65000);
		Employee e1 = new Employee(2, "Ibbu", "bpo", 45000);
		try {
			FileOutputStream f = new FileOutputStream("Ibbu.txt");
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(e);
			o.writeObject(e1);
			o.close();
			System.out.println("Serialization Done");

		} catch (Exception e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}

	}

	public void deserializable() throws ClassNotFoundException, IOException {
		try {
			FileInputStream f = new FileInputStream("Ibbu.txt");
			ObjectInputStream o = new ObjectInputStream(f);
			Employee readObject = (Employee) o.readObject();
			Employee e7 = (Employee) o.readObject();
			System.out.println(readObject);
			System.out.println(e7);

			System.out.println("Deserialization is Done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		EmpImpl em = new EmpImpl();
		em.serializable();
		em.deserializable();

	}

}
