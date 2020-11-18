package class4;

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
		Scanner input=new Scanner(System.in);
		System.out.println("输入名字");
		String []text=new String[1024];
		int i=0;
		//输入数据
		text[i]=input.nextLine();
		for(int j=0;j<=i;j++){
			if(text[j]==null||"".equals(text[j])){
				System.out.println("结束输入");
				break;
			}else{
				System.out.println("输入下一个");
				text[i+1]=input.nextLine();
				i++;
			}
		}
		input.close();
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
		    for(int j=0;j<i;j++){
	            if (checkcountname(text[j]))
	            {
	            	bWriter2.write(text[j]+"\n");
	            }
	            else
	            {
	            	bWriter1.write(text[j]+"\n");
	            }
		    }
		    bWriter1.close();
		    bWriter2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}