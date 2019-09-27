package sample.setManipulation;

public class mySetUtility {

    public static mySet union(mySet a, mySet b) {
        mySet unionSet = new mySet();
        for(int i = 0; i < a.getSet().getSize(); i++){
            unionSet.add(a.getSet().get(i));
        }

        for (int i = 0; i < b.getSet().getSize(); i++){
            unionSet.add(b.getSet().get(i));
        }

        return unionSet;
    }

    public static mySet intersection (mySet a, mySet b){
        mySet intersectionSet =new mySet();
        for (int i = 0; i < b.getSet().getSize(); i++){
            if(a.getSet().contains(b.getSet().get(i) ) ){
                intersectionSet.add(b.getSet().get(i));
            }
        }
        return intersectionSet;
    }

    public static mySet complement (mySet a, myUniverse universe){
        mySet complementSet =new mySet();

        for(int i = 0; i < universe.getUniverse().getSize(); i++){
            if(!a.getSet().contains(universe.getUniverse().get(i))){
                complementSet.add(universe.getUniverse().get(i));
            }
        }
        return complementSet;
    }

}
