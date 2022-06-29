package com.javateam.score.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import com.javateam.score.util.ScoreService;
import com.javateam.score.util.ScoreServiceImpl;

public class ServerProgram2 {
	
	public static void main(String[] args) {

		int port = 8888;
		Socket clientSocket = null;
		BufferedReader br = null;
		String data;
		List<String> list = new ArrayList<>();
		
		ScoreService svc = new ScoreServiceImpl();
		
		System.out.println("서버 프로그램 시작");
		
		end : while (true) {
		
			try (ServerSocket sc = new ServerSocket(port)) {
	
				clientSocket = sc.accept();
				
				System.out.println("클라이언트가 접속하였습니다.");
				
				br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				
				while ((data = br.readLine()) != null) {
					
					System.out.println("클라이언트에서 받은 데이터 : " + data);
					
					list = new ArrayList<>();
					list.add(data);
					
					System.out.println("전송된 리스트 : ");
					list.forEach(x->System.out.println(x));
					
					System.out.println("\n-------------------------\n");
					
					// 전송받은 데이터를 파일에 저장 (추가 모드로 변경)
					if (Files.exists(Paths.get("serverStore.txt")) == true) {
						
						System.out.println("추가");
						svc.storeScoresFileByServer(list, "serverStore.txt", "UTF-8", StandardOpenOption.APPEND);
						
					} else {
						
						System.out.println("신규 생성");
						svc.storeScoresFileByServer(list, "serverStore.txt", "UTF-8", StandardOpenOption.CREATE);
					} //
					
				} //
				
			} catch (IOException e) {
				System.out.println("서버 연결에 문제가 있습니다.");
				e.printStackTrace();
				break end; // 무한 루프 방지
			} //  
		
		} // while
		
	} //

}
