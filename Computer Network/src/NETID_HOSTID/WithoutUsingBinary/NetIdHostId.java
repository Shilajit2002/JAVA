package NETID_HOSTID.WithoutUsingBinary;

import java.util.Scanner;

public class NetIdHostId {
    //  Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP Address : ");
        String IPAddress = sc.next();

        String[] IPByte = IPAddress.split("\\.");
        int firstByte = Integer.parseInt(IPByte[0]);

        if (Integer.parseInt(IPByte[0]) <= 255 && Integer.parseInt(IPByte[1]) <= 255 &&
                Integer.parseInt(IPByte[2]) <= 255 && Integer.parseInt(IPByte[3]) <= 255) {
            if (firstByte >= 0 && firstByte <= 127) {
                System.out.println("Class A");
                System.out.println("Net Id : " + IPByte[0]);
                System.out.println("Host Id : " + IPByte[1] + "." + IPByte[2] + "." + IPByte[3]);
            } else if (firstByte >= 128 && firstByte <= 191) {
                System.out.println("Class B");
                System.out.println("Net Id : " + IPByte[0] + "." + IPByte[1]);
                System.out.println("Host Id : " + IPByte[2] + "." + IPByte[3]);
            } else if (firstByte >= 192 && firstByte <= 223) {
                System.out.println("Class C");
                System.out.println("Net Id : " + IPByte[0] + "." + IPByte[1] + "." + IPByte[2]);
                System.out.println("Host Id : " + IPByte[3]);
            } else if (firstByte >= 224 && firstByte <= 239) {
                System.out.println("Class D");
                System.out.println("No NetId & HostId");
            } else {
                System.out.println("Class E");
                System.out.println("No NetId & HostId");
            }
        } else {
            System.out.println("Invalid IP Address");
        }
    }
}