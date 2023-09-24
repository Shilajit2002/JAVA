package IPAddressClassIndetify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClassIdentify {
    //  Separate the First Byte from IP Address
    public int firstIPByte(String IP) {
        int temp = 0;
        for (int i = 0; i < IP.length(); i++) {
            if (IP.charAt(i) == '.') break;

            int j = Integer.parseInt(String.valueOf(IP.charAt(i)));
            temp = (temp * 10) + j;
        }
        return temp;
    }

    //  Decimal To Binary Conversion
    public ArrayList<Integer> decimalToBinary(int first_byte) {
        ArrayList<Integer> A = new ArrayList<>(8);
        for (int i = 0; i < 8; i++) {
            A.add(0);
        }
        int n = first_byte, pos = 0;
        while (n > 0) {
            A.set(pos, (n % 2));
            n = n / 2;
            pos++;
        }
        Collections.reverse(A);
        return A;
    }

    //  Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP Address : ");
        String IPAddress = sc.next();

        ClassIdentify CI = new ClassIdentify();

        int first_byte = CI.firstIPByte(IPAddress);

        if (first_byte <= 255) {
            ArrayList<Integer> A = CI.decimalToBinary(first_byte);

            if (A.get(0) == 0) {
                System.out.println("Class A");
            } else if (A.get(1) == 0) {
                System.out.println("Class B");
            } else if (A.get(2) == 0) {
                System.out.println("Class C");
            } else if (A.get(3) == 0) {
                System.out.println("Class D");
            } else {
                System.out.println("Class E");
            }
        } else {
            System.out.println("Invalid IP Address");
        }
    }
}
