public class SonarQubeQualityGateExample {

    // A simple method that adds two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Hardcoded password (Critical Vulnerability)
    public void hardcodedPassword() {
        String password = "admin123";
        System.out.println("Password: " + password);
    }

    // Unused variable example
    public void unusedVariableExample() {
        int unusedVar = 100;
    }

    // Duplicate code
    public void duplicateCode1() {
        System.out.println("Duplicate code example");
    }

    public void duplicateCode2() {
        System.out.println("Duplicate code example");
    }

    // Exception handling with empty catch block
    public void emptyCatchBlockExample() {
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            // Empty catch block
        }
    }

    // Complex method with high cyclomatic complexity
    public String complexMethod(int value) {
        if (value == 1) return "One";
        else if (value == 2) return "Two";
        else if (value == 3) return "Three";
        else if (value == 4) return "Four";
        else if (value == 5) return "Five";
        else if (value == 6) return "Six";
        else if (value == 7) return "Seven";
        else return "Other";
    }

    // Logging sensitive information
    public void logSensitiveInfo() {
        String token = "secret-token-12345";
        System.out.println("Logging token: " + token);
    }

    // Commented-out code
    public void commentedOutCode() {
        // int x = 10;
        // System.out.println("Commented out code example");
    }

    // Main method
    public static void main(String
