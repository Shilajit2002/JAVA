package DateTime;

import java.io.*;
import java.net.*;

class DateClient extends Thread {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread();
        while (true) {
            t.sleep(1000);
            Socket soc = new Socket("127.0.0.1", 8000);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
            soc.close();
        }
    }
}
