import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🚗 Carpooling System Registration 🚗");

        // Role selection (Driver/Passenger)
        String roleChoice;
        while (true) {
            System.out.println("\nSelect your role:");
            System.out.println("D - Driver");
            System.out.println("P - Passenger");
            System.out.print("Enter choice (D/P): ");
            roleChoice = scanner.nextLine().toUpperCase();

            if (roleChoice.matches("[DP]")) break;
            System.out.println("Invalid choice! Please enter D or P.");
        }

        // Passenger type selection
        String userType = "";
        if (roleChoice.equals("P")) {
            while (true) {
                System.out.println("\nSelect your passenger type:");
                System.out.println("S - Student");
                System.out.println("F - Staff");
                System.out.println("T - Teacher");
                System.out.print("Enter choice (S/F/T): ");
                userType = scanner.nextLine().toUpperCase();

                if (userType.matches("[SFT]")) break;
                System.out.println("Invalid choice! Please enter S, F, or T.");
            }
        }

        // Name Input
        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();

        User user = null;
        Role role = null;

        if (roleChoice.equals("D")) {
            // Driver registration (unchanged)
            System.out.print("Enter driver license number: ");
            String license = scanner.nextLine();
            user = new Driver("D-" + System.currentTimeMillis(), name, license);
            role = new DriverRole(license);
        } else {
            // Passenger registration with faculty information
            switch (userType) {
                case "S" -> {
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter faculty: ");  // NEW: Faculty input
                    String faculty = scanner.nextLine();
                    user = new Student("S-" + System.currentTimeMillis(), name, studentId, faculty);  // Updated constructor
                    role = new Passenger("Student", studentId, user);  // Pass user object
                }
                case "T" -> {
                    System.out.print("Enter teacher ID: ");
                    String teacherId = scanner.nextLine();
                    System.out.print("Enter faculty: ");  // NEW: Faculty input
                    String faculty = scanner.nextLine();
                    user = new Teacher("T-" + System.currentTimeMillis(), name, teacherId, faculty);  // Updated constructor
                    role = new Passenger("Teacher", teacherId, user);  // Pass user object
                }
                case "F" -> {
                    // Staff remains unchanged (no faculty)
                    System.out.print("Enter staff ID: ");
                    String staffId = scanner.nextLine();
                    user = new Staff("ST-" + System.currentTimeMillis(), name, staffId);
                    role = new Passenger("Staff", staffId, user);
                }
            }
        }

        // Final Confirmation
        UserWithRole userWithRole = new UserWithRole(user, role);
        System.out.println("\n✅ Registration Successful!");
        userWithRole.displayInfo();

        scanner.close();
    }
}