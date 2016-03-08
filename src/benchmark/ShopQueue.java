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
public class ShopQueue extends ArrayList {
    protected int maxsize;

    public boolean isFull() {
        return (size() == maxsize);
    }

    public String addpro() {
        String e = getItemFromFile();
        if (isFull())
            remove(0);
        add(e);
        return e;
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
    
    public String randomget(){
    	if(isEmpty())
    		return null;
    	else{
    		Random randomIndex = new Random();
    		int index = randomIndex.nextInt(size());
    		return (String) get(index);
    	}
    	
    }

    public String randomremove() {
        if (isEmpty()) {
            return null;
        } else {
            Random randomIndex = new Random();
            int index = randomIndex.nextInt(size());
            return (String) remove(index);
        }
    }

}
