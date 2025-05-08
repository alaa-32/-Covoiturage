public class Teacher extends User implements Role {
  private String teacherId;
  private String faculty;  // NEW FIELD ADDED

  public Teacher(String id, String name, String teacherId, String faculty) {  // UPDATED CONSTRUCTOR
      super(id, name);
      this.teacherId = teacherId;
      this.faculty = faculty;  // NEW INITIALIZATION
  }

  @Override
  public void displayRoleInfo() {
      System.out.println("Role: Teacher");
      System.out.println("Teacher ID: " + teacherId);
      System.out.println("Faculty: " + faculty);  // NEW LINE ADDED
  }

  // NEW GETTER ADDED
  public String getFaculty() {
      return faculty;
  }
}