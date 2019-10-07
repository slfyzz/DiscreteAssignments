import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the elements of universe set");
        Scanner in = new Scanner(System.in);
        String uniSt = in.nextLine();
        String[] universeItems = uniSt.split(" ");
        myUniverse universe =new myUniverse();
        universe.addUniverseElements(universeItems.length, universeItems);

        System.out.println("Enter the number of sets you will entered");
        int numOfSets = in.nextInt();
        in.nextLine();

        mySet[] sets = new mySet [numOfSets];

        for(int i=0 ; i<numOfSets ; i++){
            System.out.println("Enter the set number "+ (i+1) );
            String temp = in.nextLine();
            String[] tempItems = temp.split(" ");
            mySet set = new mySet(universe);
            set.addAllElements(tempItems);
            sets[i] = set ;
        }


        while (true){
            System.out.println("Enter the operation you want " +
                    "\n1 for union" +
                    "\n2 for intersection" +
                    "\n3 for complement");

            int operation = in.nextInt();
            in.nextLine();
            if(operation==1){
                System.out.println("Enter your first set number" );
                int first = in.nextInt();
                in.nextLine();
                System.out.println("Enter your second set number" );
                int second = in.nextInt();
                in.nextLine();

                mySet temp = mySetUtility.union(sets[first-1],sets[second-1]);
                boolean[] exist = temp.getItems();
                for(int i=0;i<exist.length;i++){
                    if(exist[i]) System.out.print(temp.getSetUniverse().getItems()[i] +" ");
                }
                System.out.println("\n");
            }
            if(operation==2){

                System.out.println("Enter your first set number" );
                int first = in.nextInt();
                in.nextLine();
                System.out.println("Enter your second set number" );
                int second = in.nextInt();
                in.nextLine();

                mySet temp = mySetUtility.intersection(sets[first-1],sets[second-1]);
                boolean[] exist = temp.getItems();
                for(int i=0;i<exist.length;i++){
                    if(exist[i]) System.out.print(temp.getSetUniverse().getItems()[i] +" ");
                }
                System.out.println("\n");
            }
            if(operation==3){

                System.out.println("Enter set number" );
                int first = in.nextInt();
                in.nextLine();
                mySet temp = mySetUtility.complement(sets[first-1],universe);
                boolean[] exist = temp.getItems();
                for(int i=0;i<exist.length;i++){
                    if(exist[i]) System.out.print(temp.getSetUniverse().getItems()[i] +" ");
                }
                System.out.println("\n");
            }
        }
    }
}
