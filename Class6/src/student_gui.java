import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class student_gui
{
	private JLabel j1 = new JLabel("院 系:");
	private JLabel j2 = new JLabel("专 业:");
	private JLabel j3 = new JLabel("班 级:");
	private JLabel j4 = new JLabel("学 号:");
	private JLabel j5 = new JLabel("姓 名:");
	private JLabel j6 = new JLabel("年 龄:");
	private JTextField jt1 = new JTextField(15);
	private JTextField jt2 = new JTextField(15);
	private JTextField jt3 = new JTextField(15);
	private JTextField jt4 = new JTextField(15);
	private JTextField jt5 = new JTextField(15);
	private JTextField jt6 = new JTextField(15);
	 
    public  void GUI() {
    	JFrame jf = new JFrame("学生信息");
		jf.setBounds(100,100,400,200);
		jf.setSize(240,260);
		jf.setResizable(false);
		Container c = jf.getContentPane();
		FlowLayout fl = new FlowLayout();
		c.setLayout(fl);
		j1.setFont(new Font("楷体_GB2312", Font.BOLD, 18));
		j2.setFont(new Font("楷体_GB2312", Font.BOLD, 18)); 
		j3.setFont(new Font("楷体_GB2312", Font.BOLD, 18)); 
		j4.setFont(new Font("楷体_GB2312", Font.BOLD, 18)); 
		j5.setFont(new Font("楷体_GB2312", Font.BOLD, 18)); 
		j6.setFont(new Font("楷体_GB2312", Font.BOLD, 18)); 
		JButton jb = new JButton("提交");
		jb.addActionListener(new ButtonListener());
		c.add(j1);c.add(jt1);c.add(j2);c.add(jt2);
		c.add(j3);c.add(jt3);c.add(j4);c.add(jt4);
		c.add(j5);c.add(jt5);c.add(j6);c.add(jt6);
		c.add(jb);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    class ButtonListener implements ActionListener
    {
		public void actionPerformed(ActionEvent e) {
			try {
				File file1=new File("C:/Users/60215/Desktop/en.txt");
				OutputStreamWriter bWriter1=new OutputStreamWriter(new FileOutputStream(file1, true));
				bWriter1.write("院系："+jt1.getText()+"\n");
				bWriter1.write("专业："+jt2.getText()+"\n");
				bWriter1.write("班级："+jt3.getText()+"\n");
				bWriter1.write("学号："+jt4.getText()+"\n");
				bWriter1.write("姓名："+jt5.getText()+"\n");
				bWriter1.write("年龄："+jt6.getText()+"\n");
				bWriter1.close();
				System.out.println( "录入成功");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
	{
		student_gui gui = new student_gui();
        gui.GUI();
    }
}