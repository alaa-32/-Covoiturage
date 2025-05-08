public class Passenger implements Role {
  private String passengerType;
  private String identifier;
  private User user;

  public Passenger(String passengerType, String identifier, User user) {
      this.passengerType = passengerType;
      this.identifier = identifier;
      this.user = user;
  }

  @Override
  public void displayRoleInfo() {
      System.out.println("Role: Passenger (" + passengerType + ")");
      System.out.println(passengerType + " ID: " + identifier);
      
      // Display faculty for students/teachers
      if (user instanceof Teacher) {
          System.out.println("Faculty: " + ((Teacher)user).getFaculty());
      } 
      else if (user instanceof Student) {
          System.out.println("Faculty: " + ((Student)user).getFaculty());
      }
  }
}