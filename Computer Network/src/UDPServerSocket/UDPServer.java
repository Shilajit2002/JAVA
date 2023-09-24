package UDPServerSocket;

import java.io.*;
import java.net.*;

class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket serverSocket = new DatagramSocket(9876);
        byte[] receiveData = new byte[1024];
        byte[] sendData= new byte[1024];

        System.out.println("Server is Running....");

        while(true)
        {
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            serverSocket.receive(receivePacket);
            // Get the actual length of the received data
            int receiveLength = receivePacket.getLength();
            String sentence = new String(receivePacket.getData(), 0, receiveLength);

            System.out.println("Received from Client : "+sentence);

            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();

            String capitalizedSentence = sentence.toUpperCase();
            sendData = capitalizedSentence.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);

            System.out.println("Send to Client : "+capitalizedSentence);
        }
    }
}
