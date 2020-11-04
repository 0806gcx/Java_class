package class2_1;


import static java.lang.Math.*;

public class circle {
	private double r;
	
	public void getradio(double r) {
		this.r = r;
	}
	
	public double Perimeter() {
		if (r!=0) {
			return r*2*PI;
		}
		System.out.print("不存在输入！");
		return 0;
	}

	public double Area() {
		if (r!=0) {
			return pow(r, 2)*PI;
		}
		System.out.print("不存在输入！");
		return 0;
	}
}
