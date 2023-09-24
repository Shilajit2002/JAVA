public class Practice {
    public static void main(String[] args) {
        // Question 1
        System.out.println("--------Question 1--------");
        String a="WELCOME";
        System.out.println("Lower Case : "+a.toLowerCase());

        // Question 2
        System.out.println("--------Question 2--------");
        String b="Thank You So Much";
        System.out.println(b.replace(' ','_'));

        // Question 3
        System.out.println("--------Question 3--------");
        String letter="Dear <|name|> , Thanks a lot";
        System.out.println(letter.replace("<|name|>","Jit"));

        // Question 4
        System.out.println("--------Question 4--------");
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Question 5
        System.out.println("--------Question 5--------");
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}
