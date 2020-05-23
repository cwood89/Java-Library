public class Library {
  public static void main(String[] args) {
    GeneralBook shining = new GeneralBook(20, 15, Genre.HORROR, "The Shining", "Stephen", "King", "Double Day");

    Book hp = new Book(10, 7, Genre.ADVENTURE, "Harry Potter", new Author("JK", "Rowling"),
        new Author("Chris", "Wood"));

    Magazine popMech = new Magazine(12, 8, "Popular Mechanics", 122, Frequency.MONTHLY);

    ReferenceBook jfd = new ReferenceBook(7, 7, Genre.SCIENCE, "Java for Dummies", "George", "Gardner", 2);

    CardHolder chris = new CardHolder("Chris");
    chris.checkOutItem(shining);
    chris.checkOutItem(jfd);
    chris.checkOutItem(popMech);
    chris.printLoanedItems();
    System.out.println("Reserved Items");
    chris.printReservedItems();
    System.out.println("Overdue Items");
    chris.addOverdueBook(shining);
    chris.printOverdueBooks();
    hp.printAuthors();
  }
}