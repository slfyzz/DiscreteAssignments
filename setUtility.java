package sample.setManipulation;

public  interface setUtility {

    /**
    *the output should be the union of the two sets
     */
    set union(set a, set b);

    /**
    *the output should be the intersection of the
     */
    set intersection(set a, set b);

    /**
     * the output should be the complement of the given set
     */
    set complment(set a, universe u);
}
