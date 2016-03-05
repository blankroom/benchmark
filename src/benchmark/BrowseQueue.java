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
public class BrowseQueue extends ArrayList {
    private final int maxsize = 10;

    public boolean isFull() {
        return (size() == maxsize);
    }

    public boolean addpro() {
        String e = getItemFromFile();
        if (!isFull())
            return add(e);
        else {
            remove(0);
            return add(e);
        }
    }

    public String getItemFromFile() {
        Random randomLine = new Random();
        try {
            File file = new File("C:/Users/虚室空白/IdeaProjects/benchmark/src/item.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "r");
            raf.seek(randomLine.nextInt(1000) * 11);
            return raf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
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
        System.out.println(bq.get(0));
    }
}
