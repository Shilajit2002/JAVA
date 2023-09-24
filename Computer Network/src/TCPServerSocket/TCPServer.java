package TCPServerSocket;

import java.io.*;
import java.net.*;

class TCPServer {
    //  Main Method Throws IOException
    public static void main(String[] args) throws IOException {
        //  Initialize Variable
        String clientSentence;
        String capitalizeSentence;

        //  Create an Object of ServerSocket Class
        //  3000 is Port No.
        ServerSocket welcomeSocket = new ServerSocket(3000);

        System.out.println("Server is Running .....\n");

        // Create a Loop
        while (true) {
            //  Create an Object of Socket Class which Accept the Socket from ServerSocket
            Socket connectionSocket = welcomeSocket.accept();

            //  Create an Object of Buffered Reader
            BufferedReader inFormClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

            //  Take the input from Client Side Message
            clientSentence = inFormClient.readLine();

            System.out.println("Received from Client : " + clientSentence);

            /*
                Convert the Message to Uppercase so that can send to the Client.
                So Client will Confirm that the Message is Correct, and it has been sent by the
                Server
            * */
            capitalizeSentence = clientSentence.toUpperCase() + '\n';

            //  Create an Object of  DataOutputStream
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

            System.out.println("Send to Client : " + capitalizeSentence);

            //  Send to the Client the Server Message
            outToClient.writeBytes(capitalizeSentence);
        }
    }
}
