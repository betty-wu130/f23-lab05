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

public class DelegationSortedIntList implements IntegerList {
    private SortedIntLinkedList l;
    private int totalAdded;
    
    /**
     * Constructor, create the private var SortedIntLinkedList to store data.
     * Initialize totalAdded as 0.
     */
    DelegationSortedIntList() {
        l = new SortedIntLinkedList();
        totalAdded = 0;
    }

    public boolean add(int num) {
        if (l.add(num)) {
            totalAdded += 1;
            return true;
        }
        return false;
    }

    public boolean addAll(IntegerList list) {
        int old_size = l.size();
        boolean ret = l.addAll(list);
        totalAdded += (l.size() - old_size);
        return ret;
    }

    public int get(int index) {
        return l.get(index);
    }

    public boolean remove(int num) {
        return l.remove(num);
    }

    public boolean removeAll(IntegerList list) {
        return l.removeAll(list);
    }

    public int size() {
        return l.size();
    }

    /**
     * @return The total number of numbers being added.
     */
    public int getTotalAdded() {
        return totalAdded;
    }

}