class LogicalError {
    //  Prime Number
    public void Prime() {
        System.out.println(2);
        for (int i = 3; i <= 10; i++) {
            //  But it is logically wrong because its also print 9
            //  It's print the odd number
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}

class SyntaxError {
    //  Semicolon Missing
    public void SemiColon() {
        /*
        int a = 4       //  Syntax Error because ';' missing
        //  Correct Syntax int a = 4;
        System.out.println(a);
         */
    }
}

class SemanticError {
    //  Semantically wrong
    public void Semantic() {
        /*
        int x = 12.3;   //  Semantic Error because x should be double
        //  Correct Syntax double x = 12.3
         */
    }
}

class LinkingError {
    //  Unsatisfied Linked Error
    public void Linked() {
        UnsatisfiedLinkError U = new UnsatisfiedLinkError();
        U.printStackTrace();
    }
}

class RuntimeError {
    //  Runtime Error / Exception
    public void Runtime() {
        System.out.println("It is in another file");
    }
}

public class Errors {
    public static void main(String[] args) {
        LogicalError L = new LogicalError();
        L.Prime();
        SyntaxError S = new SyntaxError();
        S.SemiColon();
        SemanticError SE = new SemanticError();
        SE.Semantic();
        LinkingError LE = new LinkingError();
        LE.Linked();
        RuntimeError R = new RuntimeError();
        R.Runtime();
    }
}
