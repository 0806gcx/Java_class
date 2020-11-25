package class5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class master {
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入一个int类型整数:");
        while(true){
            String a = sc.next();
        try{
            int num =Integer.parseInt(a);//键盘录入的结果转换成int类型的数据
            System.out.println("二进制转化结果为:"+Integer.toBinaryString(num));
            break;
        }catch(Exception e ){
            try{
            new BigInteger(a);//BigInteger可以表示一个任意大小且精度完全准确的整数。
            System.out.println("录入整数过大，请重新输入一个整数");
            }catch(Exception e1){
                try {
                    new BigDecimal(a);//BigDecimal可以表示一个任意大小且精度完全准确的浮点数。
                    System.out.println("录入的是一个小数,请重新输入一个整数");
                } catch (Exception e2) {
                    System.out.println("录入的是非法字符,请重新输入一个整数");
                }
            }
        }
        }
        sc.close();
    }
}
