import java.util.Random;

public class LibraryItem {
  private int id;
  private int totalQuantity;
  private int loanedOut;
  private String title;

  LibraryItem() {
    Random rand = new Random();
    this.id = rand.nextInt(1000);
    this.totalQuantity = 0;
    this.loanedOut = 0;
  }

  LibraryItem(int totalQuantity, int loanedOut, String title) {
    Random rand = new Random();
    this.id = rand.nextInt(1000);
    this.totalQuantity = totalQuantity;
    this.loanedOut = loanedOut;
    this.title = title;
  }

  LibraryItem(int id, int totalQuantity, int loanedOut, String title) {
    this.id = id;
    this.totalQuantity = totalQuantity;
    this.loanedOut = loanedOut;
    this.title = title;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public int getTotalQuantity() {
    return totalQuantity;
  }

  public int getLoanedOut() {
    return loanedOut;
  }

  // Setters
  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  public void setLoanedOut(int loanedOut) {
    this.loanedOut = loanedOut;
  }

  public int getAvailableItems() {
    return totalQuantity - loanedOut;
  }

  @Override

  public String toString() {
    return String.format("Title: %s Total Amount: %d Loaned Out: %d Available Now: %d ", title, totalQuantity,
        loanedOut, getAvailableItems());
  }

}