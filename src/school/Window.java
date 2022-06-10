package school;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame{

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
		
	}

}

