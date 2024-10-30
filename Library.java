import java.util.Hashtable;

/**
 * A library with a collection of books and whether they are available
 */
public class Library extends Building {
  /**
   * A hashtable of strings -> title and boolean -> whether they are available
   */
  private Hashtable<String,Boolean> collection;
    
  /**
   * Constructor for the Library class
   */
  public Library() {
      super("name","address",1);
      this.collection = new Hashtable<String,Boolean>();
      System.out.println("You have built a library: 📖");
    }
  
    /**
     * Adds a new book to the collection
     * @param title of the book we are adding
     */
    public void addTitle(String title) {
      collection.put(title,true);
    }

    /**
     * Removes a book from the collection
     * @param title of the book we are removing
     * @return the title of the removed book
     */
    public String removeTitle(String title) {
      collection.remove(title,true);
      return title;
    }
    
    /**
     * "Checks out" a book by changing its availability value to false
     * @param title of the book we are checking out
     */
    public void checkOut(String title) {
      collection.put(title,false);
    }

    /**
     * "Returns" a book by changing its availability value to true
     * @param title of the book we are returning
     */
    public void returnBook(String title) {
      collection.put(title, true);
    }

    /**
     * Checks whether a title is in the hashtable of books
     * @param title we are checking
     * @return true or false
     */
    public boolean containsTitle(String title) {
      return collection.containsKey(title);
    }

    /**
     * Checks whether a title in the collection is currently available
     * @param title of the book we are checking
     * @return true or false
     */
    public boolean isAvailable(String title) {
      return collection.get(title);
    }

    /**
     * Prints the entire collection of books and their availability
     */
    public void printCollection() {
      collection.forEach((key,value) -> {
        System.out.println(key + ":" + value);
      });
    }
    public static void main(String[] args) {
      Library myLibrary = new Library();
      myLibrary.addTitle("Book");
      System.out.println(myLibrary.containsTitle("Book"));
      myLibrary.checkOut("Book");
      System.out.println(myLibrary.isAvailable("Book"));
      myLibrary.returnBook("Book");
      myLibrary.printCollection();
      myLibrary.removeTitle("Book");
      System.out.println(myLibrary.containsTitle("Book"));

    }
  
  }