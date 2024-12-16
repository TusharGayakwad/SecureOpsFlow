public class SonarQubeQualityGateExample {

    // A simple method that adds two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // A method with some logic that is hard to test
    public String getStatus(String status) {
        if (status.equals("active")) {
            return "Status is active";
        } else if (status.equals("inactive")) {
            return "Status is inactive";
        } else {
            return "Unknown status";
        }
    }

    // A method that does something but can't be easily tested
    public void logError(String message) {
        // Simulating logging an error to a file (untestable in unit tests)
        System.out.println("Error: " + message);
    }

    // A method with exception handling which is not fully covered in unit tests
    public String processData(String data) {
        try {
            if (data == null) {
                throw new IllegalArgumentException("Data cannot be null");
            }
            return data.toUpperCase();
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        }
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        SonarQubeQualityGateExample example = new SonarQubeQualityGateExample();

        // This line will be covered by unit tests
        System.out.println(example.add(5, 3));

        // This method is difficult to test due to untestable logging logic
        example.logError("Test error message");

        // This method will fail coverage due to exception handling
        System.out.println(example.processData(null));
    }
}

public void hardcodedPassword() {
    String password = "1234"; // Hardcoded password
    System.out.println("Password is: " + password);
}
