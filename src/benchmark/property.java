package benchmark;

import java.text.SimpleDateFormat;
import java.util.Date;

public class property {
	public static int isnormalend;
	public static int number = 0;
	public static String customerid;
	public static String customername;
	public static String itemid;
	public static String itemname;

	//public static String behaviour = new String();

	public static BrowseQueue browseQueue = new BrowseQueue();
	public static CollectQueue collectQueue = new CollectQueue();
	public static CartQueue cartQueue = new CartQueue();

	public static Date time = new Date();
	public static Date buytime = new Date();
	public static SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
	public static String begintime = "2016-01-01";
	public static String endtime = "2016-01-08";

	public static String record = "";

	public static void addrecord(String behavetype, String item) {
		customerid = "Customer#0001";
		customername = "Customer#0001";
		itemid = item;
		itemname = item;
		double time_random;

		if (behavetype != null) {//添加记录
			property.record += (++number) + "|" + customerid + "|" + customername + "|" + itemid + "|" + itemname + "|" + behavetype + "|" + time + "\n";
		}

		//根据不同的behaviourtype增加时间
		if (behavetype.equals("Begin")) {
			//property.record += (++number) + "|" + customerid + "|" + customername + "|" + itemid + "|" + itemname + "|" + behavetype + "|" + time + "\n";
			time_random = Math.random() + 2;
			property.time = new Date((long) (property.time.getTime() + 1000 * 60 * 60 * time_random));
		}
		if (behavetype.equals("Search") || behavetype.equals("Browse")) {
			//property.record += (++number) + "|" + customerid + "|" + customername + "|" + behavetype + "|" + property.time + "\n";
			time_random = Math.random() + 2;
			property.time = new Date((long) (property.time.getTime() + 1000 * 60 * time_random));
		}
		if (behavetype.equals("AddCollect") || behavetype.equals("DeleteCollect") || behavetype.equals("AddCart") || behavetype.equals("DeleteCart")) {
			//property.record += (++property.number) + "|" + property.customerid + "|" + property.customername + "|" + behavetype + "|" + property.time + "\n";
			time_random = Math.random() + 2;
			property.time = new Date((long) (property.time.getTime() + 1000 * 60 * time_random));
		}
		/*if (behavetype.equals("Buy")) {
			//property.record += (++property.number) + "|" + property.customerid + "|" + property.customername + "|" + behavetype + "|" + property.time + "\n";
			//time_random = Math.random()+3;
			//property.time = new Date((long) (property.time.getTime() + 1000 * 60 * 60 * 24 * time_random));
		}*/
		if (behavetype.equals("Comment")) {
			//property.record += (++property.number) + "|" + property.customerid + "|" + property.customername + "|" + behavetype + "|" + property.buytime + "\n";
			time_random = Math.random() + 2;
			property.buytime = new Date((long) (property.time.getTime() + 1000 * 60 * 60 * 24 * time_random));
		}
	}
}
