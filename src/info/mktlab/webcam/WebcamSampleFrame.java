package info.mktlab.webcam;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Webcamのサンプル画面です。
 *
 * @author Makoto Igarashi
 *
 */
class WebcamSampleFrame extends JFrame {
	private static final long serialVersionUID = -4740460913087179717L;

	/**
	 * 画面を初期化します。
	 */
	WebcamSampleFrame() {
		setTitle(getClass().getSimpleName());
		JButton button = new JButton("撮影");
		add(button);
		setBounds(0, 0, 200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * メイン関数です。
	 *
	 * @param args
	 *            起動引数の配列
	 */
	public static void main(String[] args) {
		WebcamSampleFrame frame = new WebcamSampleFrame();
		frame.setVisible(true);
	}
}
