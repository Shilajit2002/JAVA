package DateTime;

import java.util.*;
import java.io.*;
import java.net.*;

class DateServer {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(8000);
        while (true) {
            System.out.println("Waiting for Connection.....");
            Socket soc = s.accept();
            DataOutputStream out = new DataOutputStream((soc.getOutputStream()));
            out.writeBytes(("Server Date : " + (new Date()).toString() + "\n"));
            out.close();
            soc.close();
        }
    }
}
