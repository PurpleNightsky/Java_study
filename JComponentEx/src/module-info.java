public class JComponentEx extends JFrame{
	JComponentEx(){
		super("JComponent의 공통 메소드 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b1 = new JButton("Magenta/Yellow Buton");
		JButton b2 = new JButton("Disabled Button");
		JButton b3 = new JButton("getX(), getY()");
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.MAGENTA);
		b2.setFont(new Font("Arial", Font.ITALIC, 20));
		b2.setEnabled(false);
		b3.addActionListener(new ActionListener() {
			public void action Performed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				setTitle(b.getX()+","+b.getY());
			}
		});
		c.add(b1); c.add(b2); c.add(b3);
		setSize(260,200); setVisible(true);
	}
	public static void main(String[] args) {
		new JComponentEx();
	}
}