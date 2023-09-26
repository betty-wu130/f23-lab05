package edu.cmu.cs.cs214.rec04;

import java.util.Comparator;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntLinkedList{
    int totalAdded;
    /**
     * Constructor for InheritanceSortedIntList to initialize totalAdded.
     */
    InheritanceSortedIntList () {
        totalAdded = 0;
    }
    
    /**
     * @param num the element to be inserted, while record in totalAdded if returned success.
     * @return boolean whether the element is successfully inserted.
     */
    public boolean add(int num) {
        if(super.add(num)) {
            totalAdded += 1;
            return true;
        }
        return false;
    }

    /**
     * @param list the elements to be added, the number of successful addition is recorded
     *              by total Added.
     * @return boolean whether the total list is inserted successfully.
     */
    public boolean addAll(IntegerList list) {
        return super.addAll(list);
    }

    /**
     * @return The total number of numbers being added.
     */
    public int getTotalAdded() {
        return totalAdded;
    }
}