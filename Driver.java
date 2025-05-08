public class Driver extends User implements Role {  // Should extend User
  private String license;

  // Constructor matching your usage
  public Driver(String id, String name, String license) {
      super(id, name);  // Calls User constructor
      this.license = license;
  }

  @Override
  public void displayRoleInfo() {
      System.out.println("Role: Driver");
      System.out.println("License: " + license);
  }
}