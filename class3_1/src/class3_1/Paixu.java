package class3_1;

import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class Paixu {
	
	public static int[] num1 = new int[100];
	//降幂排序
	public static void QuickSort(String down,int[] a,int left,int right)
    {
        if(left>=right)
            return;
		int key = a[left];
		int i = left;
		int j = right;
		//j向左移，直到遇到比key大的值
		while(i<j)
		{
			while(a[j]<=key && i<j)
				j--;
			//i向右移，直到遇到比key小的值
			while(a[i]>=key && i<j)
				i++;
			if(i<j)//互换
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
			}
		}
        a[left] = a[i];
        a[i] = key;
		QuickSort("降幂",a,left,i-1);
		QuickSort("降幂",a,i+1,right);
    } 
	//升幂排序
	public static void QuickSort(int[] num, int left, int right) {
		//如果left等于right，即数组只有一个元素，直接返回
		if(left>=right) {
			return;
		}
		//设置最左边的元素为基准值
		int key=num[left];
		//数组中比key小的放在左边，比key大的放在右边，key值下标为i
		int i=left;
		int j=right;
		while(i<j){
			//j向左移，直到遇到比key小的值
			while(num[j]>=key && i<j){
				j--;
			}
			//i向右移，直到遇到比key大的值
			while(num[i]<=key && i<j){
				i++;
			}
			//i和j指向的元素交换
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

		fileWriter1.write("----------排序前----------"+"\r\n");
		for (int i = 0; i < 100; i++) {
			int ran1 = ran.nextInt(1000)-500;
			num1[i] = ran1;
			fileWriter1.write(i+1+":   "+ran1+""+"\r\n");
		}
		fileWriter1.flush();
		fileWriter1.close();
		FileWriter fileWriter2 = new FileWriter("C:/Users/60215/Desktop/num2.txt");
		fileWriter2.write("----------排序后（升幂）----------"+"\r\n");
		
		QuickSort(num1,0,num1.length-1);
		

		for (int i = 0; i < num1.length; i++) {
			fileWriter2.write(i+1+":   "+num1[i]+""+"\r\n");
		}
		
		QuickSort("降幂",num1,0,num1.length-1);

		fileWriter2.write("----------排序后（降幂）----------"+"\r\n");
		for (int i = 0; i < num1.length; i++) {
			fileWriter2.write(i+1+":   "+num1[i]+""+"\r\n");
		}
		
		fileWriter2.flush();
		fileWriter2.close();
		System.out.println("finsh the project");
	}
}
