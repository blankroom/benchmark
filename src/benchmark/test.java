package benchmark;

import java.text.ParseException;

public class test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		property.time = property.sdt.parse(property.begintime);
		while (property.time.before(property.sdt.parse(property.endtime))) {
			property.isnormalend = 0;
			do
				new Begin();
			while (property.isnormalend == 1);
			//System.out.println(property.record);
			//System.out.println("end");
			//System.out.println(property.name);
		}
		System.out.println(property.record);
		for (int i = 0; i < property.browseQueue.size(); i++) {
			System.out.println(property.browseQueue.get(i));
		}
	}

}
