public class Library {
  public static void main(String[] args) {
    GeneralBook shining = new GeneralBook(20, 15, Genre.HORROR, "The Shining", "Stephen King");
    System.out.println(shining.getAvailableItems());
    System.out.println(shining.getAuthor());
    System.out.println(shining.getTitle());
    System.out.println(shining.getFiction());
    System.out.println();

    Magazine popMech = new Magazine(12, 8, "Popular Mechanics", 122, Frequency.MONTHLY);
    System.out.println(popMech.getIssueNum());
    System.out.println(popMech.getAvailableItems());
    System.out.println(popMech.getFrequency());
    System.out.println();

  }
}