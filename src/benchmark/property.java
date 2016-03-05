package benchmark;

import java.text.SimpleDateFormat;
import java.util.Date;

public class property {
	public static int isnormalend;
	public static int number = 0;
	public static String id;
	public static String name;

	//public static String behaviour = new String();

	public static BrowseQueue browseQueue = new BrowseQueue();

	public static Date time = new Date();
	public static SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
	public static String begintime = "2016-01-01";
	public static String endtime = "2016-01-02";

	public static String record = "";

	public static void addrecord(String behavetype) {
		id = "Customer#0001";
		name = "Customer#0001";
		double time_random = Math.random();
		time_random += 2;
		if (behavetype.equals("Begin")) {
			property.record += (++property.number) + "|" + property.id + "|" + property.name + "|" + behavetype + "|" + property.time + "\n";
			property.time = new Date((long) (property.time.getTime() + 1000 * 60 * 60 * time_random));
		}
		if (behavetype.equals("Search") || behavetype.equals("Browse")) {
			property.record += (++property.number) + "|" + property.id + "|" + property.name + "|" + behavetype + "|" + property.time + "\n";
			property.time = new Date((long) (property.time.getTime() + 1000 * 60 * time_random));
		}
		if (behavetype.equals("AddCollect") || behavetype.equals("DeleteCollect") || behavetype.equals("AddCart") || behavetype.equals("DeleteCart")) {
			property.record += (++property.number) + "|" + property.id + "|" + property.name + "|" + behavetype + "|" + property.time + "\n";
			property.time = new Date((long) (property.time.getTime() + 1000 * 60 * time_random));
		}
		if (behavetype.equals("Buy")) {
			property.record += (++property.number) + "|" + property.id + "|" + property.name + "|" + behavetype + "|" + property.time + "\n";
		}
	}
}
