package ju;

import chou.Shape;

public class Rectangle extends Shape {
	private float len, wid;

	public Rectangle(String name, float x, float y, float len, float wid) {
		super(name, x, y);
		this.len = len;
		this.wid = wid;
	}

	public Rectangle() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public float getLen() {
		return len;
	}

	public void setLen(float len) {
		this.len = len;
	}

	public float getWid() {
		return wid;
	}

	public void setWid(float wid) {
		this.wid = wid;
	}

	public float area() {
		return len * wid;
	}

	public float perimeter() {
		return 2 * (len + wid);
	}

	public void show() {
		System.out.println("矩形坐标=" + "[" + getX() + "," + getY() + "]");
		System.out.println("length= " + len + "\n" + "width= " + wid);
		System.out.println("面积= " + area() + "\t" + "周长= " + perimeter());
		System.out.println("---!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!---");
	}

	public String getName() {
		String t = "矩形";
		return t;
	}
}
