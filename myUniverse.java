package sample.setManipulation;

public class myUniverse implements universe {

    list universe = new list();
    list sets = new list();

    @Override
    public void addNewSet(Object a) {
        sets.add(a);
    }

    @Override
    public void addUniverseElement(Object str) {
        if (!universe.contains(str))
            universe.add(str);
    }

    public list getSets() {
        return sets;
    }

    public list getUniverse() {
        return universe;
    }
}
