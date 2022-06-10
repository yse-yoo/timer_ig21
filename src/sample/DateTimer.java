package sample;

import java.util.Timer;
import java.util.TimerTask;

public class DateTimer {

	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("実行しました");
			}
		};
		
		
	}

}
