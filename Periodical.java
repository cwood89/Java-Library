public class Periodical extends LibraryItem {
  private int issueNum;
  private Frequency frequency;

  Periodical(int totalQuantity, int loanedOut, String title, int issueNum, Frequency frequency) {
    super(totalQuantity, loanedOut, title);
    this.issueNum = issueNum;
    this.frequency = frequency;
  }

  public int getIssueNum() {
    return issueNum;
  }

  public void setIssueNum(int issueNum) {
    this.issueNum = issueNum;
  }

  public Frequency getFrequency() {
    return frequency;
  }

  public void setFrequency(Frequency frequency) {
    this.frequency = frequency;
  }

  @Override
  public String toString() {
    return String.format("Title: %s Total Amount: %d Loaned Out: %d Available Now: %d ", super.getTitle(),
        super.getTotalQuantity(), super.getLoanedOut(), super.getAvailableItems());
  }
}