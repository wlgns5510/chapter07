package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.219.101" , 10001));

		System.out.println("<서버시작>");
		System.out.println("==========================================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		
		////반복 시작 ////////////////////////////////////////////////////////
		
		while(true) {
		
			Socket socket = serverSocket.accept();
			
			//쓰레드-출장보내기(출장가서 스트림보강하고 대화해라)
			Thread thread = new ServerThread(socket);  //???????
			thread.start();
			
		}
		
		 ////반복 종료 ////////////////////////////////////////////////////////
		
		
	   
		/*
		System.out.println("==========================================================");
		System.out.println("<서버종료>");
		
		br.close();
		socket.close();
		serverSocket.close();
		*/
	}

}