package sample;

import java.util.Timer;
import java.util.TimerTask;

public class SecondsTimer {
	
	public static int seconds = 3;

	public static void main(String[] args) {
		
		System.out.println(seconds + "秒後に実行します");
		//ミリセカンド(ms)に変換
		long ms = seconds * 1000;
		
		//Timerインスタンス作成
		Timer timer = new Timer();
		
		//TimerTaskインスタンス作成
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				//タイマーが発生すると実行される
				
			}
		};
	}

}
