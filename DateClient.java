package webserver;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.io.*;

public class DateClient {
	private final static int PORT = 6969;
	private final static String HOST = "localhost";
	
	public static void main(String[] args) {
		try {
			Socket sock = new Socket(HOST, PORT);
			InputStream in = sock.getInputStream();
			BufferedReader bin = new
					BufferedReader(new InputStreamReader(in));
			String line;
			while ((line = bin.readLine()) !=null) {
				System.out.println("PORT: "+PORT);
				System.out.println("HOST: "+HOST);
				System.out.println("Server Successfully Connected!");
				System.out.println("Hello User Today is : "+line);
			}
			sock.close();	
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
	}
}
