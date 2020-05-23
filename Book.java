import java.util.ArrayList;

public class Book extends LibraryItem {
  private Genre genre;
  private boolean fiction;
  private Author author;

  private ArrayList<Author> authors;

  Book(int totalQuantity, int loanedOut, Genre genre, String title, String fName, String lName) {
    super(totalQuantity, loanedOut, title);
    this.genre = genre;
    this.author = new Author(fName, lName);
    this.authors = new ArrayList<>();
    authors.add(author);
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

  Book(int totalQuantity, int loanedOut, Genre genre, String title, Author author, Author author2) {
    super(totalQuantity, loanedOut, title);
    this.genre = genre;
    this.author = author;
    this.authors = new ArrayList<>();
    authors.add(author);
    authors.add(author2);
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

  public void printAuthors() {
    for (Author i : authors) {
      System.out.println(i);
    }
  }

  @Override
  public String toString() {
    return String.format("Title: %s Author: %s %s %nTotal Amount: %d Loaned Out: %d Available Now: %d ",
        super.getTitle(), author.getFirstName(), author.getLastName(), super.getTotalQuantity(), super.getLoanedOut(),
        super.getAvailableItems());
  }
}