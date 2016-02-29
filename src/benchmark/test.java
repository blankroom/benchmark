package benchmark;

import java.text.ParseException;

public class test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		property.time = property.sdt.parse(property.begintime);
		while (property.time.before(property.sdt.parse(property.endtime))) {
			property.isnormalend = 0;
			Begin test = new Begin();
			while (property.isnormalend == 1)
				test = new Begin();
			//System.out.println(property.record);
			//System.out.println("end");
			//System.out.println(property.name);
		}
		System.out.println(property.record);
	}

}
