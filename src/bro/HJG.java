package bro;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class HJG {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {

		HJG h = (HJG) Class.forName("bro.HJG").newInstance();
		HJG newInstance = HJG.class.newInstance();
		newInstance.helo();
		h.helo();

		Constructor<HJG> constructor = HJG.class.getConstructor();
		HJG newInstance2 = constructor.newInstance();

		newInstance2.helo();

		Constructor<HJG> constructor2 = HJG.class.getConstructor();
		HJG newInstance3 = constructor2.newInstance();

	}

	public void helo() {
		System.out.println("Hello I am ");
	}

}
