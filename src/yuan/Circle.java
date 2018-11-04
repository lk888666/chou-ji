package yuan;

import chou.Shape;

public class Circle extends Shape {
	private float r;

	public Circle(String name, float x, float y, float r) {
		super(name, x, y);
		this.r = r;
	}

	public Circle() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public float area() {
		return (float) (3.14 * r * r);
	}

	public float perimeter() {
		return (float) (2 * 3.14 * r);
	}

	public String getName() {
		String t = "圆形";
		return t;
	}

	public void show() {
		System.out.println("圆心坐标=" + "[" + getX() + "," + getY() + "]" + "\t" + "半径=" + r);
		System.out.println("面积= " + area() + "\t" + "周长= " + perimeter());
		System.out.println("---!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!---");
	}
}
