public class Book extends LibraryItem {
  private Genre genre;
  private boolean fiction;
  private Author author;

  Book(int totalQuantity, int loanedOut, Genre genre, String title, String fName, String lName) {
    super(totalQuantity, loanedOut, title);
    this.genre = genre;
    this.author = new Author(fName, lName);

    switch (genre) {
      case SCIENCE:
        this.fiction = false;
        break;
      case HISTORY:
        this.fiction = false;
        break;
      case HEALTH:
        this.fiction = false;
        break;
      case BIOGRAPHY:
        this.fiction = false;
        break;
      default:
        this.fiction = true;
        break;
    }
  }

  Book(int totalQuantity, int loanedOut, Genre genre, String title, String fName, String lName,
      String publishingCompany) {
    super(totalQuantity, loanedOut, title, publishingCompany);
    this.genre = genre;
    this.author = new Author(fName, lName);

    switch (genre) {
      case SCIENCE:
        this.fiction = false;
        break;
      case HISTORY:
        this.fiction = false;
        break;
      case HEALTH:
        this.fiction = false;
        break;
      case BIOGRAPHY:
        this.fiction = false;
        break;
      default:
        this.fiction = true;
        break;
    }
  }

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public boolean getFiction() {
    return fiction;
  }

  @Override
  public String toString() {
    return String.format("Title: %s Author: %s %s %nTotal Amount: %d Loaned Out: %d Available Now: %d ",
        super.getTitle(), author.getFirstName(), author.getLastName(), super.getTotalQuantity(), super.getLoanedOut(),
        super.getAvailableItems());
  }
}