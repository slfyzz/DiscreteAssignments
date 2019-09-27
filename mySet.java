package sample.setManipulation;

public class mySet implements set{
    private list set = new list();

    @Override
    public void add(Object str) {
        if (!set.contains(str))
            set.add(str);
    }

    public list getSet() {
        return set;
    }
}
