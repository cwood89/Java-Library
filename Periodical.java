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
}