package IPAddress;
import java.net.InetAddress;

public class IPAddressFind {
    public static void main(String[] args) {
        try {
            // Get IP address of system
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("The IP address of your system is : " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
