public class Library {
  public static void main(String[] args) {
    GeneralBook shining = new GeneralBook(20, 15, Genre.HORROR, "The Shining", "Stephen King");

    Magazine popMech = new Magazine(12, 8, "Popular Mechanics", 122, Frequency.MONTHLY);

    ReferenceBook jfd = new ReferenceBook(7, 7, Genre.SCIENCE, "Java for Dummies", "George Gardner");
    System.out.println(jfd.getAvailableItems());

    CardHolder chris = new CardHolder("Chris");
    chris.checkOutItem(shining);
    chris.checkOutItem(jfd);
    chris.checkOutItem(popMech);
    chris.printLoanedItems();
    chris.printReservedItems();
  }
}