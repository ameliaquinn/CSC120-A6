import java.util.ArrayList;

/* This is a stub for the House class */

/**
 * Represents a house with a certain number of residents that either does or doesn't have a dining room
 */
public class House extends Building {

  /**
   * The list of residents in the house
   */
  private ArrayList<String> residents;
  /**
   * Whether or not there is a dining room in the house
   */
  private boolean hasDiningRoom;

  /**
   * The constructor for a new house
   * @param hasDiningRoom whether the house has a dining room 
   */
  public House(boolean hasDiningRoom) {
    super("name","address",1);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Accessor for hasDiningRoom
   * @return whether the house has a dining room
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /**
   * Accessor for the number of residents
   * @return the number of residents
   */
  public int nResidents() {
    return this.residents.size();
  }

  /**
   * Adds a new person to the list of residents
   * @param Name of the person moving in
   */
  public void moveIn(String Name) {
    residents.add(Name);
  }

  /**
   * Removes a person from the list of residents
   * @param Name of the person moving out
   * @return the name of the person who moved out
   */
  public String moveOut(String Name) {
    residents.remove(Name);
    return Name;
  }

  /**
   *  Checks whether a person is a resident of the house
   * @param Person we are checking
   * @return whether the person is a resident
   */
  public Boolean isResident(String Person) {
    if (residents.contains(Person)) {
      return true;
    } else {
      return false;
    }
  }
  

  public static void main(String[] args) {
    House myHouse = new House(true);
    myHouse.moveIn("Amelia");
    System.out.println(myHouse.isResident("Amelia"));
    System.out.println(myHouse.nResidents());
    myHouse.moveOut("Amelia");
    System.out.println(myHouse.nResidents());
  }

}