package class5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class master {
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("������һ��int��������:");
        while(true){
            String a = sc.next();
        try{
            int num =Integer.parseInt(a);//����¼��Ľ��ת����int���͵�����
            System.out.println("������ת�����Ϊ:"+Integer.toBinaryString(num));
            break;
        }catch(Exception e ){
            try{
            new BigInteger(a);//BigInteger���Ա�ʾһ�������С�Ҿ�����ȫ׼ȷ��������
            System.out.println("¼��������������������һ������");
            }catch(Exception e1){
                try {
                    new BigDecimal(a);//BigDecimal���Ա�ʾһ�������С�Ҿ�����ȫ׼ȷ�ĸ�������
                    System.out.println("¼�����һ��С��,����������һ������");
                } catch (Exception e2) {
                    System.out.println("¼����ǷǷ��ַ�,����������һ������");
                }
            }
        }
        }
        sc.close();
    }
}
