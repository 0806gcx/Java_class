package class2_2;

public class people {
	public double weight;
	public double height;
	
	public void getheight(double height) {
		this.height = height;
	}
	public void getweight(double weight) {
		this.weight = weight;
	}
	
	public double BMI() {
		double BMIdata = weight/height/height;
		if (BMIdata < 18.5) {
			System.out.println("���ع���");
		}
		else if (BMIdata < 25) {
			System.out.println("��������");
		}
		else if (BMIdata < 28) {
			System.out.println("���ع���");
		}
		else if (BMIdata < 32) {
			System.out.println("���ط���");
		}
		else  {
			System.out.println("���طǳ�����");
		}
		return BMIdata;
	}
}
