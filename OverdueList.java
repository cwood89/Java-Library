import java.util.ArrayList;

public class OverdueList<T extends LibraryItem> {
  ArrayList<T> items;

  OverdueList() {
    this.items = new ArrayList<>();
  }

  public void addItem(T item) {
    items.add(item);
  }

  public void removeItem(T item) {
    items.remove(item);
  }
}