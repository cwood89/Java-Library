public class GeneralBook extends Book {
  GeneralBook(int totalQuantity, int loanedOut, Genre genre, String title, String fName, String lName) {
    super(totalQuantity, loanedOut, genre, title, fName, lName);
  }

  GeneralBook(int totalQuantity, int loanedOut, Genre genre, String title, String fName, String lName,
      String publisher) {
    super(totalQuantity, loanedOut, genre, title, fName, lName, publisher);
  }
}