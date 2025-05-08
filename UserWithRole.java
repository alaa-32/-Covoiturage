

// UserWithRole.java
public class UserWithRole {
  private User user;
  private Role role;

  public UserWithRole(User user, Role role) {
      this.user = user;
      this.role = role;
  }

  public void displayInfo() {
      System.out.println("\nUser Information:");
      System.out.println("ID: " + user.getId());
      System.out.println("Name: " + user.getName());
      role.displayRoleInfo();

  }
 
}
