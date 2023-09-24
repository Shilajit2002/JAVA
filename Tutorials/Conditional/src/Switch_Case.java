public class Switch_Case {
    public static void main(String[] args) {
        String name = "ABCD";

        switch (name) {
            case "ABDE":
                System.out.println("Not Match");
                break;
            case "DECD":
                System.out.println("Not Match");
                break;
            case "ABCD":
                System.out.println("Match");
                break;
            default:
                System.out.println("Not in Pattern");
                break;
        }

        // Enhanced Switch Case
        String var = "Shubham";
        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");
    }
}
