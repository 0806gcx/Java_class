package class3_1;

import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class Paixu {
	
	public static int[] num1 = new int[100];
	//��������
	public static void QuickSort(String down,int[] a,int left,int right)
    {
        if(left>=right)
            return;
		int key = a[left];
		int i = left;
		int j = right;
		//j�����ƣ�ֱ��������key���ֵ
		while(i<j)
		{
			while(a[j]<=key && i<j)
				j--;
			//i�����ƣ�ֱ��������keyС��ֵ
			while(a[i]>=key && i<j)
				i++;
			if(i<j)//����
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
			}
		}
        a[left] = a[i];
        a[i] = key;
		QuickSort("����",a,left,i-1);
		QuickSort("����",a,i+1,right);
    } 
	//��������
	public static void QuickSort(int[] num, int left, int right) {
		//���left����right��������ֻ��һ��Ԫ�أ�ֱ�ӷ���
		if(left>=right) {
			return;
		}
		//��������ߵ�Ԫ��Ϊ��׼ֵ
		int key=num[left];
		//�����б�keyС�ķ�����ߣ���key��ķ����ұߣ�keyֵ�±�Ϊi
		int i=left;
		int j=right;
		while(i<j){
			//j�����ƣ�ֱ��������keyС��ֵ
			while(num[j]>=key && i<j){
				j--;
			}
			//i�����ƣ�ֱ��������key���ֵ
			while(num[i]<=key && i<j){
				i++;
			}
			//i��jָ���Ԫ�ؽ���
			if(i<j){
				int temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
		num[left]=num[i];
		num[i]=key;
		QuickSort(num,left,i-1);
		QuickSort(num,i+1,right);
	}
	
	public static void main(String[] args)
			throws IOException, NullPointerException{
		Random ran = new Random();
		FileWriter fileWriter1 = new FileWriter("C:/Users/60215/Desktop/num.txt");

		fileWriter1.write("----------����ǰ----------"+"\r\n");
		for (int i = 0; i < 100; i++) {
			int ran1 = ran.nextInt(1000)-500;
			num1[i] = ran1;
			fileWriter1.write(i+1+":   "+ran1+""+"\r\n");
		}
		fileWriter1.flush();
		fileWriter1.close();
		FileWriter fileWriter2 = new FileWriter("C:/Users/60215/Desktop/num2.txt");
		fileWriter2.write("----------��������ݣ�----------"+"\r\n");
		
		QuickSort(num1,0,num1.length-1);
		

		for (int i = 0; i < num1.length; i++) {
			fileWriter2.write(i+1+":   "+num1[i]+""+"\r\n");
		}
		
		QuickSort("����",num1,0,num1.length-1);

		fileWriter2.write("----------����󣨽��ݣ�----------"+"\r\n");
		for (int i = 0; i < num1.length; i++) {
			fileWriter2.write(i+1+":   "+num1[i]+""+"\r\n");
		}
		
		fileWriter2.flush();
		fileWriter2.close();
		System.out.println("finsh the project");
	}
}
