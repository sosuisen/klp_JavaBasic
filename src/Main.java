import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	private JButton showButton;
	private MemberList memberList = new MemberList();

	public Main() {
		JFrame f = new JFrame();

		showButton = new JButton("リスト表示");
		showButton.setBounds(90, 100, 180, 40);
		showButton.addActionListener(e -> {
			memberList.show();
		});
		f.add(showButton);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}
}
