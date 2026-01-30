package edu.cmu.cs.cs214.rec04;


/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    private int totalAdded;

    // Write your implementation below with API documentation
    @Override
    public boolean add(int num){
        if (super.add(num)){
            totalAdded++;
            return true;
        };
        return false; 
    }

    @Override
    public boolean addAll(IntegerList list) {
        if (super.addAll(list)){
            // totalAdded += list.size();
            return true;
        };
        return false;
    }

    public int getTotalAdded(){
        return totalAdded;
    }

}
