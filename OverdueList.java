import java.util.ArrayList;

public class OverdueList<C extends LibraryItem> {
  ArrayList<C> items;

  OverdueList() {
    this.items = new ArrayList<>();
  }

  public void addItem(C item) {
    items.add(item);
  }

  public void removeItem(C item) {
    items.remove(item);
  }

  public void printItems() {
    for (C item : items) {
      System.out.println(item);
    }
  }
}