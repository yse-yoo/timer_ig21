package school;

import java.util.TimerTask;

public class AnimationTask extends TimerTask {
	
	public Window window;
	

	public AnimationTask(Window window) {
		super();
		//Windowインスタンスの受け取り
		this.window = window;
	}


	@Override
	public void run() {
		//タイマーが実行されるたびにアニメーション
		window.animate();
	}

}
