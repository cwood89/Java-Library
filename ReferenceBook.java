public class ReferenceBook extends Book {
  private int versionNum;

  ReferenceBook(int totalQuantity, int loanedOut, Genre genre, String title, String fName, String lName,
      int versionNum) {
    super(totalQuantity, loanedOut, genre, title, fName, lName);
    this.versionNum = versionNum;
  }

  public int getVersionNum() {
    return versionNum;
  }

  public void setVersionNum(int versionNum) {
    this.versionNum = versionNum;
  }

}