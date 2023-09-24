package TCPServerSocket;

import java.io.*;
import java.net.*;

class TCPClient {
    //  Main Method Throws IOException
    public static void main(String[] args) throws IOException {
        //  Initialize Variable
        String sentence;
        String modifiedSentence;

        //  Send Message From Client
        System.out.print("Enter a Message : ");

        //  Create an Object of Buffered Reader
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        //  Take Input from Client
        sentence = inFromUser.readLine();

        //  Create an Object of Socket Class
        //  127.0.0.1=LocalHost
        //  3000 is Port No.
        Socket clientSocket = new Socket("127.0.0.1", 3000);

        //  Create an Object of DataOutputStream
        //  Take the Output Stream from Client Socket
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

        System.out.println("Send to Server : " + sentence);

        //  Send to Server the Client Message
        outToServer.writeBytes(sentence + '\n');

        //  Create an Object of Buffered Reader
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        //  Its take input from the Server Side Message
        modifiedSentence = inFromServer.readLine();

        System.out.println("Received form Server : " + modifiedSentence);

        //  Close the ClientSocket
        clientSocket.close();
    }
}
