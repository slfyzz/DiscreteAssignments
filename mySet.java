package sample.setManipulation;

import java.util.Arrays;
import java.util.List;

public class mySet implements set{

    private myUniverse setUniverse;
    private boolean[] items;
    private Object[] inputObjects;
    private List<Object>addedValues;
    mySet(myUniverse universe)
    {
        this.setUniverse = universe;
        items = new boolean[universe.getSizeofUniverse()];
        Arrays.fill(items, false);
    }
    public void addAllElements(Object []str)
    {
        Arrays.sort(str);
        inputObjects = str;
        Object[] universeList = setUniverse.getItems();
        int ptr1,ptr2;
        ptr1 = ptr2 = 0;
        while (ptr1 < str.length && ptr2 < universeList.length)
        {
            if (universeList[ptr2].equals(str[ptr1]))
            {
                ptr1++;
                items[ptr2] = true;
                ptr2++;
            }
            else
                ptr2++;
        }
    }
    public void add(int ind)
    {
        items[ind] = true;
    }
    public boolean[] getItems() {
        return items;
    }

    public myUniverse getSetUniverse() {
        return setUniverse;
    }
}
