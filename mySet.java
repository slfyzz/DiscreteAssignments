package sample.setManipulation;

import java.util.Arrays;
import java.util.List;

public class mySet implements set{

    private myUniverse setUniverse;
    private boolean[] items;
    private String[] inputObjects;
    public mySet(myUniverse universe)
    {
        this.setUniverse = universe;
        items = new boolean[universe.getSizeofUniverse()];
        Arrays.fill(items, false);
    }
    public void addAllElements(String []str)
    {
        Arrays.sort(str);
        int cmt = 0;
        for (int i = 0; i < str.length - 1; i++)
        {
            if (str[i].equals(str[i + 1]))
            {
                str[i] = "-!-0";
                cmt++;
            }
        }
        this.inputObjects = new String[str.length - cmt];
        int ptr = 0;
        for (int i = 0;i < str.length; i++)
        {
            if (!str[i].equals("-!-0"))
            {
                inputObjects[ptr] = str[i];
                ptr++;
            }
        }
        Object[] universeList = setUniverse.getItems();
        int ptr1,ptr2;
        ptr1 = ptr2 = 0;
        while (ptr1 < inputObjects.length && ptr2 < universeList.length)
        {
            if (universeList[ptr2].equals(inputObjects[ptr1]))
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
