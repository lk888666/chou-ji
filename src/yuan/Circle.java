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
		// TODO �Զ����ɵĹ��캯�����
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
		String t = "Բ��";
		return t;
	}

	public void show() {
		System.out.println("Բ������=" + "[" + getX() + "," + getY() + "]" + "\t" + "�뾶=" + r);
		System.out.println("���= " + area() + "\t" + "�ܳ�= " + perimeter());
		System.out.println("---!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!---");
	}
}
