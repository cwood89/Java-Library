import java.util.ArrayList;

public class CardHolder {
  private ArrayList loanedItems;
  private String name;

  CardHolder(String Name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}