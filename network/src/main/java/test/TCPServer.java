package test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		try {
			// 1. Server Socket 생성
			ServerSocket serverSocket = new ServerSocket();

			// 2. binding
			// Socket에 InetSocketAddress(IPAddress + port)를 바인딩
			// IPAddress: 0.0.0.0 : 특정 호스트 IP에 바인딩 하지 않는다.
			// InetSocketAddress("IP", port, option)
			serverSocket.bind(new InetSocketAddress("0.0.0.0", 5000), 10);

			// 3.accept
			Socket socket = serverSocket.accept(); // blocking, 왔다갔다 하면서 socket에 데이터가 담김 blocking을 풀기 위해서 client가 필요. 
												   // 연결요청을 기다리는 상태
		} catch (IOException e) {
			System.out.println("[server] error: " + e);
		}
	}

}