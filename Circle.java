public class Circle{
	
	private int radius;

	public void setRadius(int radius){
		this.radius=radius;
	}
	
	public void getRadius(){
		return radius;
	}
	public int calculateArea(){
		return 3.14*radius*radius;
	}
	public int calculatePerimiter(){
		return 2*3.14*radius;
	}
	
	}
