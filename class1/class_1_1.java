import java.util.*;
import java.lang.Math;
public class class_1_1
{
   public static void main (String[] args)
   {
      int a,b,c;
      double s,area;
      Scanner rd = new Scanner(System.in);
      System.out.print("请输入三角形的第一个边长（回车继续）：");
      a=rd.nextInt();
      System.out.print("请输入三角形的第二个边长（回车继续）：");
      b=rd.nextInt();
      System.out.print("请输入三角形的第三个边长（回车继续）：");
      c=rd.nextInt();
      if(a+b>c&&b+c>a&&a+c>b)
      {
      System.out.println("可以构成三角形哦！");
      //半周长
      s=(a+b+c)/2;
      //面积
      area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.print("三角形的面积为："+area);
      }
      else
      System.out.print("不可以构成三角形哦！");
   }

}