package sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class DateTimer {

	public static void main(String[] args) throws ParseException {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("実行しました");
			}
		};
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		timer.schedule(task, sdf.parse("2022/06/10 11:59:55"));
	}

}
