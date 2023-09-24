public class NullPointer {
    public static void main(String[] args) {
        String str = null;

        try {
            if (str.equals("Hello")) {
                System.out.println("They are Equal");
            } else {
                System.out.println("They are Not Equal");
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Program End");
        }
    }
}
