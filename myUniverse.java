package sample.setManipulation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class myUniverse implements universe {
    Object [] Items;
    List<mySet> sets;

    myUniverse()
    {
        sets = new LinkedList<>();

    }

    public Object[] getItems() {
        return Items;
    }

    public int getSizeofUniverse()
    {
        return Items.length;
    }

    public void addUniverseElements(long numOfItems, Object []s)
    {
        Arrays.sort(s);
        this.Items = s;
    }
    public void addNewSet(mySet a)
    {
        sets.add(a);
    }
}
