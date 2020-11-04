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
			System.out.println("体重过轻");
		}
		else if (BMIdata < 25) {
			System.out.println("体重正常");
		}
		else if (BMIdata < 28) {
			System.out.println("体重过重");
		}
		else if (BMIdata < 32) {
			System.out.println("体重肥胖");
		}
		else  {
			System.out.println("体重非常肥胖");
		}
		return BMIdata;
	}
}
