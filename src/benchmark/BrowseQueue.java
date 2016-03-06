package benchmark;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by 虚室空白 on 2016/3/5.
 * A Data Structure for remember the items customer looked at
 */
public class BrowseQueue extends ShopQueue {
    public BrowseQueue(){
    	maxsize = 10;
    }

    public static void main(String[] args) {
        BrowseQueue bq = new BrowseQueue();
        bq.addpro();
        String[] s = new String[bq.size()];
        bq.toArray(s);

        // s = (String[]) bq.toArray();
        for (int i = 0; i < bq.size(); i++) {
            System.out.println(s[i] + "   " + bq.size());
        }
        System.out.println(bq.randomget());
    }
}
