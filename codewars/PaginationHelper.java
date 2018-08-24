import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;

//  complete this object/class

public class PaginationHelper<I> {

    int totalCount;
    int itemsPerPage;

  /**
   * The constructor takes in an array of items and a integer indicating how many
   * items fit within a single page
   */
  public PaginationHelper(List<I> collection, int itemsPerPage) {
    this.totalCount = collection.size();
    this.itemsPerPage = itemsPerPage;
  }
  
  /**
   * returns the number of items within the entire collection
   */
  public int itemCount() {
    return this.totalCount;
  }
  
  /**
   * returns the number of pages
   */
  public int pageCount() {
      return (int)this.totalCount/this.itemsPerPage + ((this.totalCount%this.itemsPerPage == 0)?0:1);  
  }
  
  /**
   * returns the number of items on the current page. page_index is zero based.
   * this method should return -1 for pageIndex values that are out of range
   */
  public int pageItemCount(int pageIndex) {
    int a = pageCount();
    if(pageIndex >= a || pageIndex < 0 ) return -1;
    if(pageIndex == a - 1) return (this.totalCount%this.itemsPerPage == 0)?
          this.itemsPerPage:
          this.totalCount%this.itemsPerPage;
    return this.itemsPerPage;
  }
  
  /**
   * determines what page an item is on. Zero based indexes
   * this method should return -1 for itemIndex values that are out of range
   */
  public int pageIndex(int itemIndex) {
    if(itemIndex >= this.totalCount || itemIndex < 0) return -1;
    return itemIndex/this.itemsPerPage;  
  }

  public static void main(String []args){
    PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
    System.out.println(helper.pageCount()); //should == 2
    System.out.println(helper.itemCount()); //should == 6
    System.out.println(helper.pageItemCount(0)); //should == 4
    System.out.println(helper.pageItemCount(1)); // last page - should == 2
    System.out.println(helper.pageItemCount(2)); // should == -1 since the page is invalid

    // pageIndex takes an item index and returns the page that it belongs on
    System.out.println(helper.pageIndex(5)); //should == 1 (zero based index)
    System.out.println(helper.pageIndex(0)); //should == 0
    System.out.println(helper.pageIndex(20)); //should == -1
    System.out.println(helper.pageIndex(-10)); //should == -1
  }
}