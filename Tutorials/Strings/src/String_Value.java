import java.util.Arrays;

public class String_Value {
    /*
        By Using This Method We Can access alphabets.symbols,numbers index in an array
     */

    //  AlphabetSymbolNumbers Index Finder Method
    public int alphabetsSymbolsNumbersIndexFinder(char c) {
        //  Return Capital Alphabet Index
        if (c - 'A' >= 0 && c - 'A' <= 25) {
            return (c - 'A');
        }
        //  Return Small Alphabet Index
        if (c - 'a' >= 0 && c - 'a' <= 25) {
            return (c - 'a') + 26;
        }
        //  Return Space Index
        if (c == ' ') {
            return (0) + 52;
        }
        //  Return Symbols and Numbers Index
        if (c - '!' >= 0 && c - '!' <= 31) {
            return (c - '!') + 53;
        }
        //  Return Some Extra Symbol Index
        if (c - '!' - 26 >= 32 && c - '!' - 26 <= 37) {
            return (c - '!' - 26) + 53;
        }
        //  Return Some Extra Symbol Index
        if (c - '!' - 52 >= 38 && c - '!' - 52 <= 41) {
            return (c - '!' - 52) + 53;
        }
        return -1;
    }

    //  Main Method
    public static void main(String[] args) {
        String_Value SV = new String_Value();

        char[] capsArr = new char[26];
        // Uppercase alphabets
        for (int i = 0; i < 26; i++) {
            capsArr[i] = (char) ('A' + i);
        }

        char[] smallArr = new char[26];
        // Lowercase alphabets
        for (int j = 0; j < 26; j++) {
            smallArr[j] = (char) ('a' + j);
        }

        char[] spaceArr = new char[1];
        // Lowercase alphabets
        for (int m = 0; m < 1; m++) {
            spaceArr[m] = ' ';
        }

        char[] symbolArr = new char[32 + 10];
        // Symbols
        for (int k = 0; k < 32; k++) {
            symbolArr[k] = (char) ('!' + k);
        }

        //  Extra Symbol Array
        char[] extraSymbol = {
                '[', '\\', ']', '^', '_', '`', '{',
                '|', '}', '~'
        };
        // Extra Symbol
        for (int k = 0; k < 10; k++) {
            symbolArr[k + 32] = extraSymbol[k];
        }

        System.out.println("Capital Letter Array : " + Arrays.toString(capsArr));
        System.out.println("Total Capital Letter : " + capsArr.length);
        System.out.println("Small Letter Array : " + Arrays.toString(smallArr));
        System.out.println("Total Small Letter : " + smallArr.length);
        System.out.println("Space Array : " + Arrays.toString(spaceArr));
        System.out.println("Total Space : " + spaceArr.length);
        System.out.println("Symbol Numbers Array : " + Arrays.toString(symbolArr));
        System.out.println("Total Symbols & Number : " + symbolArr.length);

        //  New Array
        //  Caps Letter Size(26) + Small Letter Size(26) + Space Size(1) + Symbols,Numbers Size(42)
        char[] arr = new char[26 + 26 + 1 + 42];

        //  Storing Caps
        for (int l = 0; l < capsArr.length; l++) {
            arr[l] = capsArr[l];
        }
        //  Storing Small
        for (int l = 0; l < smallArr.length; l++) {
            arr[l + 26] = smallArr[l];
        }
        //  Storing Space
        for (int l = 0; l < spaceArr.length; l++) {
            arr[l + 52] = spaceArr[l];
        }
        //  Storing Symbols & Numbers
        for (int l = 0; l < symbolArr.length; l++) {
            arr[l + 53] = symbolArr[l];
        }

        //  Main Array Contains Capital Alphabets & Small Alphabets and Symbols & Numbers
        System.out.println("Main Array : " + Arrays.toString(arr));
        System.out.println("Total Size : " + arr.length);

        //  Finding Each Character Index
        for (char c : arr) {
            System.out.println(c + " Index => " + SV.alphabetsSymbolsNumbersIndexFinder(c));
        }
    }
}
