package NetworkAddress;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NetworkAddressIdentify {
    //  Separate the Four Bytes from IP Address
    public ArrayList<Integer> getByte(String IP) {
        ArrayList<Integer> A1 = new ArrayList<>();

        int temp = 0;

        for (int i = 0; i < IP.length(); i++) {
            if (IP.charAt(i) == '.') {
                A1.add(temp);
                temp = 0;
                continue;
            }
            int j = Integer.parseInt(String.valueOf(IP.charAt(i)));
            temp = (temp * 10) + j;
        }
        A1.add(temp);

        return A1;
    }

    //  IP Address Binary Conversion
    public ArrayList<ArrayList<Integer>> getBinaryAddress(ArrayList<Integer> IP) {
        ArrayList<ArrayList<Integer>> A2 = new ArrayList<>(4);

        ArrayList<Integer> A4 = IP;

        for (int i = 0; i < A4.size(); i++) {
            int n = A4.get(i), pos = 0;

            ArrayList<Integer> A3 = new ArrayList<>(8);
            for (int j = 0; j < 8; j++) {
                A3.add(0);
            }

            while (n > 0) {
                A3.set(pos, n % 2);
                n = n / 2;
                pos++;
            }

            Collections.reverse(A3);
            A2.add(A3);
        }
        return A2;
    }

    //  Identify the Class of a IP Address
    public String classIdentifier(ArrayList<Integer> BAddress) {
        ArrayList<Integer> A5 = BAddress;

        if (A5.get(0) == 0) {
            System.out.println("Class A");
            return "255.0.0.0";
        } else if (A5.get(1) == 0) {
            System.out.println("Class B");
            return "255.255.0.0";
        } else if (A5.get(2) == 0) {
            System.out.println("Class C");
            return "255.255.255.0";
        } else if (A5.get(3) == 0) {
            System.out.println("Class D");
            return null;
        } else {
            System.out.println("Class E");
            return null;
        }
    }

    //  Network Binary Address
    public ArrayList<ArrayList<Integer>> getNetworkBinary(ArrayList<ArrayList<Integer>> IP,
                                                          ArrayList<ArrayList<Integer>> DM) {
        ArrayList<ArrayList<Integer>> A6 = new ArrayList<>(4);

        for (int i = 0; i < IP.size(); i++) {
            ArrayList<Integer> A7 = new ArrayList<>();
            for (int j = 0; j < IP.get(i).size(); j++) {
                A7.add(IP.get(i).get(j) * DM.get(i).get(j));
            }
            A6.add(A7);
        }
        return A6;
    }

    //  Netwrok Address
    public ArrayList<Integer> getNetworkAddress(ArrayList<ArrayList<Integer>> NAP) {
        ArrayList<Integer> A8 = new ArrayList<>();

        for (int i = 0; i < NAP.size(); i++) {
            int temp = 0;
            for (int j = 0, ex = 7; j < NAP.get(i).size(); j++, ex--) {
                temp += NAP.get(i).get(j) * Math.pow(2, ex);
            }
            A8.add(temp);
        }
        return A8;
    }

    //  Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP Address : ");
        String IPAddress = sc.next();

        NetworkAddressIdentify NA = new NetworkAddressIdentify();

        ArrayList<Integer> IP_Byte = NA.getByte(IPAddress);

        if (IP_Byte.get(0) <= 255 && IP_Byte.get(1) <= 255 && IP_Byte.get(2) <= 255 && IP_Byte.get(3) <= 255) {
            System.out.print("IP Address : ");
            for (int i = 0; i < IP_Byte.size(); i++) {
                System.out.print(IP_Byte.get(i));
                if (i != IP_Byte.size() - 1)
                    System.out.print(".");
            }
            System.out.println();

            ArrayList<ArrayList<Integer>> Binary_Address = NA.getBinaryAddress(IP_Byte);

            String DefaultMask = NA.classIdentifier(Binary_Address.get(0));

            if (DefaultMask != null) {
                System.out.println("Default Mask : " + DefaultMask);

                System.out.print("IP Address (In Binary) : \t\t");
                for (int i = 0; i < Binary_Address.size(); i++) {
                    for (int j = 0; j < Binary_Address.get(i).size(); j++) {
                        System.out.print(Binary_Address.get(i).get(j));
                    }
                    System.out.print(" ");
                }

                ArrayList<Integer> Mask_Byte = NA.getByte(DefaultMask);
                ArrayList<ArrayList<Integer>> Binary_Mask = NA.getBinaryAddress(Mask_Byte);

                System.out.print("\nDefault Mask (In Binary) : \t\t");
                for (int i = 0; i < Binary_Mask.size(); i++) {
                    for (int j = 0; j < Binary_Mask.get(i).size(); j++) {
                        System.out.print(Binary_Mask.get(i).get(j));
                    }
                    System.out.print(" ");
                }

                System.out.println("\n----------------------------------------------------------------------");

                ArrayList<ArrayList<Integer>> Network_Binary = NA.getNetworkBinary(Binary_Address, Binary_Mask);

                System.out.print("Network Address (In Binary) : \t");
                for (int i = 0; i < Network_Binary.size(); i++) {
                    for (int j = 0; j < Network_Binary.get(i).size(); j++) {
                        System.out.print(Network_Binary.get(i).get(j));
                    }
                    System.out.print(" ");
                }

                ArrayList<Integer> Network_Address = NA.getNetworkAddress(Network_Binary);
                System.out.print("\nNetwork Address : ");
                for (int i = 0; i < Network_Address.size(); i++) {
                    System.out.print(Network_Address.get(i));
                    if (i != Network_Address.size() - 1)
                        System.out.print(".");
                }
            } else {
                System.out.println("No!! Default Mask Found!!");
            }

        } else {
            System.out.println("Invalid IP Address");
        }
    }
}
