
public class Shape {
	private String name;
	
	Shape(String aName){
		name = aName;
	}
	
	public String getName(){
		return name;
	}
	
	public float calculateArea(){
		return 0.0f;
	}
}

class Triangle extends Shape{
	private float height, base;
	
	Triangle(String aName, float h, float b){
		super(aName);
		height = h;
		base = b;
	}
	
	public float calculateArea(){
		float area = base*height/2;
		return area;
	}
}