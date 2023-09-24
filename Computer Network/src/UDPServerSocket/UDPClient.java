package UDPServerSocket;

import java.io.*;
import java.net.*;

class UDPClient {
    public static void main(String[] args) throws IOException {
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName("LOCALHOST");

        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];

        System.out.print("Enter Message : ");
        String sentence = inFromUser.readLine();

        sendData = sentence.getBytes();

        System.out.println("Send to Server : "+sentence);

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);

        clientSocket.send(sendPacket);

        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);

        // Get the actual length of the received data
        int receiveLength = receivePacket.getLength();

        String modifiedSentence = new String(receivePacket.getData(), 0, receiveLength);
        System.out.println("Received from Server : " + modifiedSentence);

        clientSocket.close();
    }
}
