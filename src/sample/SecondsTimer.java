package sample;

import java.util.Timer;

public class SecondsTimer {
	
	public static int seconds = 3;

	public static void main(String[] args) {
		
		System.out.println(seconds + "秒後に実行します");
		//ミリセカンド(ms)に変換
		long ms = seconds * 1000;
		
		Timer timer = new Timer();
		
	}

}
