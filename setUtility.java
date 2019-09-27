package sample.setManipulation;

public  interface setUtility {

    static mySet union(mySet a, mySet b) {
        return null;
    }



    /**
    *the output should be the intersection of the
     */
    mySet intersection(mySet a, mySet b);

    /**
     * the output should be the complement of the given set
     */
    mySet complment(mySet a, myUniverse u);

}
