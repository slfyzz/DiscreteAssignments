

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class myUniverse implements universe {
    private String [] Items;
    private List<mySet> sets;

    public myUniverse()
    {
        sets = new LinkedList<>();

    }

    public String[] getItems() {
        return Items;
    }

    public int getSizeofUniverse()
    {
        return Items.length;
    }

    public void addUniverseElements(long numOfItems, String []s)
    {
        Arrays.sort(s);
        int cmt = 0;
        for (int i = 0; i < s.length - 1; i++)
        {
            if (s[i].equals(s[i + 1]))
            {
                s[i] = "-!-0";
                cmt++;
            }
        }
        this.Items = new String[s.length - cmt];
        int ptr = 0;
        for (int i = 0;i < s.length; i++)
        {
            if (!s[i].equals("-!-0"))
            {
                Items[ptr] = s[i];
                ptr++;
            }
        }
    }
    public void addNewSet(mySet a)
    {
        sets.add(a);
    }
}
