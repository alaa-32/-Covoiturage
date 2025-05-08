// Remove these incorrect imports
// import javax.management.relation.Role;

// Use your own Role interface
public class DriverRole implements Role {  // "implements" not "extends"
    private String license;

    public DriverRole(String license) {
        this.license = license;
    }

    @Override
    public void displayRoleInfo() {
        System.out.println("Role: Driver");
        System.out.println("License: " + license);
    }

    // Getters
    public String getLicense() {
        return license;
    }
}