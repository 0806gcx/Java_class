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
    public  void GUI() {
    	JFrame jf = new JFrame("ѧ����Ϣ");
		jf.setBounds(100,100,400,200);
		jf.setSize(240,260);
		jf.setResizable(false);
		Container c = jf.getContentPane();
		FlowLayout fl = new FlowLayout();
		c.setLayout(fl);
		JLabel j1 = new JLabel("Ժ ϵ:");
		j1.setFont(new Font("����_GB2312", Font.BOLD, 18));
		JTextField jt1 = new JTextField(15);
		JLabel j2 = new JLabel("ר ҵ:");
		j2.setFont(new Font("����_GB2312", Font.BOLD, 18)); 
		JTextField jt2 = new JTextField(15);
		JLabel j3 = new JLabel("�� ��:");
		j3.setFont(new Font("����_GB2312", Font.BOLD, 18)); 
		JTextField jt3 = new JTextField(15);
		JLabel j4 = new JLabel("ѧ ��:");
		j4.setFont(new Font("����_GB2312", Font.BOLD, 18)); 
		JTextField jt4 = new JTextField(15);
		JLabel j5 = new JLabel("�� ��:");
		j5.setFont(new Font("����_GB2312", Font.BOLD, 18)); 
		JTextField jt5 = new JTextField(15);
		JLabel j6 = new JLabel("�� ��:");
		j6.setFont(new Font("����_GB2312", Font.BOLD, 18)); 
		JTextField jt6 = new JTextField(15);
		JButton jb = new JButton("�ύ");
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				File file1=new File("C:/Users/60215/Desktop/en.txt");
				try {
					OutputStreamWriter bWriter1=new OutputStreamWriter(new FileOutputStream(file1, true));
					bWriter1.write("Ժϵ��"+jt1.getText()+"\n");
					bWriter1.write("רҵ��"+jt2.getText()+"\n");
					bWriter1.write("�༶��"+jt3.getText()+"\n");
					bWriter1.write("ѧ�ţ�"+jt4.getText()+"\n");
					bWriter1.write("������"+jt5.getText()+"\n");
					bWriter1.write("���䣺"+jt6.getText()+"\n");
					bWriter1.close();
					System.out.println( "��ȡ�ɹ�");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		c.add(j1);c.add(jt1);c.add(j2);c.add(jt2);
		c.add(j3);c.add(jt3);c.add(j4);c.add(jt4);
		c.add(j5);c.add(jt5);c.add(j6);c.add(jt6);
		c.add(jb);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		student_gui gui = new student_gui();
        gui.GUI();
    }
}