public class Staff extends User implements Role {
  private String department;

  public Staff(String id, String name, String department) {
      super(id, name);
      this.department = department;
  }

  @Override
  public void displayRoleInfo() {
      System.out.println("Role: Staff");
      System.out.println("Department: " + department);
  }

  public interface Role {
    String getRoleName();
  }
}