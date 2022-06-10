package school;

import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame{

	//コンストラクタ
	public Window() {
		super();
		loadImages();
		createWindow();
	}

	//画像を表示するラベル
	public JLabel label;
	//画像の枚数
	public int imageCount = 6;
	//画像の配列
	public ImageIcon[] images = new ImageIcon[imageCount];
	//現在の画像配列のインデックス
	public int index = 0;
	//画像ファイル名の番号前の文字
	final String IMAGE_PREFIX = "school-";
	//画像ファイルの拡張子
	final String IMAGE_EXT = ".jpg";


	//画像の初期化メソッド
	public void loadImages() {
		for (int i = 0; i < images.length; i++) {
			//画像パス
			String path = "./images/" + IMAGE_PREFIX + (i + 1) + IMAGE_EXT;
			images[i] = new ImageIcon(path);
		}
	}

	//フレーム作成
	public void createWindow() {
		setBounds(0, 0, 1000, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel();
		add(label);
		setVisible(true);
	}

	//ラベルに画像を更新する（アニメーション）
	public void animate() {
		label.setIcon(images[index]);
		//次の画像のインデックス
		index++;
		//もし最後の画像だったら0
		if (index >= images.length) index = 0;
	}

	//タイマーを発動
	public void startTimer() {
		Timer timer = new Timer();
		timer.schedule(new AnimationTask(this), 0, 500);
	}
}

