package chou;

public abstract class Shape {
	private String name;
	private float x, y;

	public Shape(String name, float x, float y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shape() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public float area() {
		return x + y;
	}

	public float perimeter() {
		return x * y;
	}

	public String getName() {
		return name;
	}

	public void show() {
		System.out.println("圆心是  [" + x + "," + y + "]");
	}
}
