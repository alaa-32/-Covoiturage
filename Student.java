public class Student extends User implements Role {
  private String studentId;
  private String faculty;  // NEW FIELD ADDED

  public Student(String id, String name, String studentId, String faculty) {  // UPDATED CONSTRUCTOR
      super(id, name);
      this.studentId = studentId;
      this.faculty = faculty;  // NEW INITIALIZATION
  }

  @Override
  public void displayRoleInfo() {
      System.out.println("Role: Student");
      System.out.println("Student ID: " + studentId);
      System.out.println("Faculty: " + faculty);  // NEW LINE ADDED
  }

  // NEW GETTER ADDED
  public String getFaculty() {
      return faculty;
  }

  public interface Role {
      String getRoleName();
  }
}