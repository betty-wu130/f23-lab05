/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

import { AbstractIntList } from "./AbstractIntList";
import { IntegerList } from "./IntegerList";
import { SortedIntLinkedList } from "./hidden/SortedIntListLibrary";

class DelegationSortedIntList implements AbstractIntList{
  private l: SortedIntLinkedList
  private totalAdded: number
  constructor() {
    this.l = new SortedIntLinkedList
    this.totalAdded = 0
  }

  add(num: number): boolean {
      if (this.l.add(num)) {
        this.totalAdded += 1
        return true
      }
      return false
  }

  public addAll(list: IntegerList): boolean {
      var old_size = this.l.size()
      var ret = this.l.addAll(list)
      this.totalAdded += (this.l.size() - old_size)
      return ret
  }

  get(index: number): number {
      return this.l.get(index)
  }

  remove(num: number): boolean {
      return this.l.remove(num)
  }

  removeAll(list: IntegerList): boolean {
      return this.l.removeAll(list)
  }

  size(): number {
      return this.l.size()
  }

  getTotalAdded() {
    return this.totalAdded
  }
}

export { DelegationSortedIntList }
