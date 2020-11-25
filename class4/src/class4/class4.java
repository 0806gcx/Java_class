package class4.src.class4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.util.regex.*;

public class class4 {
	public static boolean checkcountname(String countname)
    {
         Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
            Matcher m = p.matcher(countname);
            if (m.find()) {
                return true;
            }
            return false;
    }
	
	public static void main(String[] args) {
		
		//创建文档，保存数据
		try {
	        File file1=new File("C:/Users/60215/Desktop/en.txt");
	        File file2=new File("C:/Users/60215/Desktop/cn.txt");
		    if(!file1.exists()){
				file1.createNewFile();
		    }
		    if(!file2.exists()){
				file2.createNewFile();
		    }
		    BufferedWriter bWriter1=new BufferedWriter(new FileWriter(file1.getAbsoluteFile()));
		    BufferedWriter bWriter2=new BufferedWriter(new FileWriter(file2.getAbsoluteFile()));
		    Scanner input=new Scanner(System.in);
			System.out.println("输入名字");
			String text=new String();
			int i=0;
			//输入数据
			do{
				text=input.nextLine();
				 if (checkcountname(text)){
		            	bWriter2.write(text+"\n");
		            }
		         else{
		            	bWriter1.write(text+"\n");
		            }
			}while(text.length()!=0);
			System.out.println("输入结束");
			input.close();
		    bWriter1.close();
		    bWriter2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}