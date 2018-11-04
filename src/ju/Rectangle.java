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
		// TODO �Զ����ɵĹ��캯�����
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
		System.out.println("��������=" + "[" + getX() + "," + getY() + "]");
		System.out.println("length= " + len + "\n" + "width= " + wid);
		System.out.println("���= " + area() + "\t" + "�ܳ�= " + perimeter());
		System.out.println("---!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!---");
	}

	public String getName() {
		String t = "����";
		return t;
	}
}
