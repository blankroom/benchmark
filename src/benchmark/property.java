package benchmark;

import java.text.SimpleDateFormat;
import java.util.Date;

public class property {
	public static int isnormalend;
	public static int number = 0;
	public static String id = new String("Customer#0001");
	public static String name = new String("Customer#0001");

	public static String behaviour = new String();

	public static Date time = new Date();
	public static SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
	public static String begintime = "2016-01-01";
	public static String endtime = "2016-01-02";

	public static String record = "";

	public static void addrecord(String behavetype) {
		if (behavetype.equals("Begin")) {
			property.record += (++property.number) + "|" + property.id + "|" + property.name + "|" + behavetype + "|" + property.time + "\n";
			property.time = new Date(property.time.getTime() + 1000 * 60 * 60 * 2);
		}
		if (behavetype.equals("Search") || behavetype.equals("Browse")) {
			property.record += (++property.number) + "|" + property.id + "|" + property.name + "|" + behavetype + "|" + property.time + "\n";
			property.time = new Date(property.time.getTime() + 1000 * 60 * 2);
		}
		if (behavetype.equals("Collect and Cart")) {
			property.record += (++property.number) + "|" + property.id + "|" + property.name + "|" + behavetype + "|" + property.time + "\n";
			property.time = new Date(property.time.getTime() + 1000 * 60 * 2);
		}
		if (behavetype.equals("Buy")) {
			property.record += (++property.number) + "|" + property.id + "|" + property.name + "|" + behavetype + "|" + property.time + "\n";
		}
	}
}
