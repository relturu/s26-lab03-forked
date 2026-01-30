package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList{
    // Write your implementation below with API documentation
    private SortedIntList sortedList;
    private int totalAdded;

    public DelegationSortedIntList(){
        this.sortedList = new SortedIntList();
        this.totalAdded = 0;
    }
    public final boolean add(int num){
        if (sortedList.add(num)){
            this.totalAdded++;
            return true;
        }
        return false;
    }
    public final boolean addAll(IntegerList list){
        if (sortedList.addAll(list)){
            this.totalAdded += list.size();
            return true;
        }
        return false;
    }
    public final int get(int index){
        return sortedList.get(index);
    }
    public final boolean remove(int num){
        if (sortedList.remove(num)){
            return true;
        }
        return false;
    }
    public final boolean removeAll(IntegerList list){
        if (sortedList.removeAll(list)){
            return true;
        }
        return false;
    }

    public int getTotalAdded(){
        return this.totalAdded;
    }

    public int size(){
        return sortedList.size();
    }
    

}
