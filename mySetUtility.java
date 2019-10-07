package sample.setManipulation;

public class mySetUtility {
    public static mySet union(mySet a, mySet b) {
        mySet unionSet = new mySet(a.getSetUniverse());
        for(int i = 0; i < a.getSetUniverse().getSizeofUniverse(); i++){
            if (a.getItems()[i] || b.getItems()[i])
            {
                unionSet.add(i);
            }
        }
        return unionSet;
    }

    public static mySet intersection (mySet a, mySet b){
        mySet intersectionSet =new mySet(a.getSetUniverse());
        for(int i = 0; i < a.getSetUniverse().getSizeofUniverse(); i++){
            if (a.getItems()[i] && b.getItems()[i])
            {
                intersectionSet.add(i);
            }
        }
        return intersectionSet;
    }

    public static mySet complement (mySet a, myUniverse universe){
        mySet complementSet =new mySet(a.getSetUniverse());

        for(int i = 0; i < a.getSetUniverse().getSizeofUniverse(); i++){
            if (!a.getItems()[i])
            {
                complementSet.add(i);
            }
        }
        return complementSet;
    }
}
