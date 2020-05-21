public class Book extends LibraryItem {
  private Genre genre;
  private boolean fiction;
  private String author;

  Book(int totalQuantity, int loanedOut, Genre genre, String title, String author) {
    super(totalQuantity, loanedOut, title);
    this.genre = genre;
    this.author = author;
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

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public boolean getFiction() {
    return fiction;
  }
}