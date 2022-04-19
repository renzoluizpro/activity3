package webserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.io.*;

public class DateServer {
	
	private final static int PORT = 6969;
	public static void main(String[] args) {
		try {
			ServerSocket sock = new ServerSocket(PORT);
			while (true) {
				Socket client = sock.accept();
				PrintWriter pout = new
				PrintWriter(client.getOutputStream(), true);
				pout.println(new java.util.Date().toString());
				client.close();
			}
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
	}
}
