import java.util.Scanner;

public class calss_0 {
    public static void main(String[] args) {
        System.out.println("***********Hello World***********"+ "\n"); // 打印 Hello World
        System.out.println("求ax^2+bx+c=0的根"+ "\n");//输出标题
        double a = 0;
        while(a == 0){    //若a=0则一直循环
            System.out.println("请输入a的值：");
            Scanner input1 = new Scanner(System.in);
            a = input1.nextDouble();
            // input1.close();
        }
        System.out.println("请输入b的值：");
        Scanner input2 = new Scanner(System.in);
        double b = input2.nextDouble();

        System.out.println("请输入c的值：");
        Scanner input3 = new Scanner(System.in);
        double c = input3.nextDouble();
        try
        {
            double delta = b*b-4*a*c;
        if(delta<0)
            System.out.println("方程无解");
        else if(delta==0)
            System.out.println("方程有一个解："+-b/(2*a));
        else
            System.out.println("方程有两个解：x1="+(-b+Math.sqrt(delta))/(2*a)+",x2="+(-b-Math.sqrt(delta))/(2*a));
        }finally
        {
            input2.close();
            input3.close();
        }
    }
}
