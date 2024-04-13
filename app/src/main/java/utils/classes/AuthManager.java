package utils.classes;

public class AuthManager {
    // To Do
    // Private static instance
    private static AuthManager instance;

    // Private constructor to prevent instantiation
    private AuthManager() {}

    // Public static method to access the instance
    public static AuthManager getInstance() {
        if (instance == null) {
            instance = new AuthManager();
        }
        return instance;
    }

    // Method to simulate user authentication
    public boolean authenticateUser(String username, String password) {
        // Simulated authentication logic
        if (username.equals("admin") && password.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }
}