import java.util.ArrayList;

public class CardHolder {
  private ArrayList<LibraryItem> loanedItems;
  private ArrayList<LibraryItem> reservedItems;
  private String name;

  CardHolder(String Name) {
    this.name = name;
    this.loanedItems = new ArrayList<>();
    this.reservedItems = new ArrayList<>();
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void checkOutItem(LibraryItem item) {
    if (item.getAvailableItems() == 0) {
      reservedItems.add(item);
      System.out.println("Sorry this item isn't available at the moment, we added it to your reserve list.");
    } else if (item.getAvailableItems() > 0) {
      item.setLoanedOut(item.getLoanedOut() + 1);
      loanedItems.add(item);
      System.out.println("Enjoy your item!");
    }
  }

  public void printLoanedItems() {
    for (LibraryItem item : loanedItems) {
      System.out.println(item);
    }
  }

  public void printReservedItems() {
    for (LibraryItem item : reservedItems) {
      System.out.println(item);
    }
  }
}