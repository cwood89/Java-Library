import java.util.Random;

public class LibraryItem implements Loanable {
  private int id;
  private int totalQuantity;
  private int loanedOut;
  private String title;
  private PublishingCompany publisher;
  private boolean loanable;

  LibraryItem() {
    Random rand = new Random();
    this.id = rand.nextInt(1000);
    this.totalQuantity = 0;
    this.loanedOut = 0;
    setLoanable();
  }

  LibraryItem(int totalQuantity, int loanedOut, String title) {
    Random rand = new Random();
    this.id = rand.nextInt(1000);
    this.totalQuantity = totalQuantity;
    this.loanedOut = loanedOut;
    this.title = title;
    setLoanable();
  }

  LibraryItem(int id, int totalQuantity, int loanedOut, String title) {
    this.id = id;
    this.totalQuantity = totalQuantity;
    this.loanedOut = loanedOut;
    this.title = title;
    setLoanable();
  }

  LibraryItem(int totalQuantity, int loanedOut, String title, String publisher) {
    Random rand = new Random();
    this.id = rand.nextInt(1000);
    this.totalQuantity = totalQuantity;
    this.loanedOut = loanedOut;
    this.title = title;
    this.publisher = new PublishingCompany(publisher);
    setLoanable();
  }

  LibraryItem(int totalQuantity, int loanedOut, String title, String publisher, boolean loanable) {
    Random rand = new Random();
    this.id = rand.nextInt(1000);
    this.totalQuantity = totalQuantity;
    this.loanedOut = loanedOut;
    this.title = title;
    this.publisher = new PublishingCompany(publisher);
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

  public PublishingCompany getPublishingCompany() {
    return publisher;
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

  public void setPublishingCompany(PublishingCompany publisher) {
    this.publisher = publisher;
  }

  public int getAvailableItems() {
    return totalQuantity - loanedOut;
  }

  @Override
  public boolean isLoanable() {
    return loanable;
  }

  @Override
  public int getLoanTerm() {
    return 14;
  }

  @Override
  public void setLoanable() {
    if (getAvailableItems() == 0) {
      this.loanable = false;
    } else {
      this.loanable = true;
    }
  }

  @Override
  public void lateCharge(Charges charge) {
    switch (charge) {
      case DAILY:
        System.out.println("Charged: $1");
        break;
      case WEEKLY:
        System.out.println("Charged: $7");
        break;
      case BIWEEKLY:
        System.out.println("Charged: $14");
        break;
      case MONTHLY:
        System.out.println("Charged: $30");
        break;
      default:
        System.out.println("No Late Charges.");
        break;
    }
  }

}