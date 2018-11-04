package juti;

import ju.Rectangle;

public class Cude extends Rectangle {
	private float h;

	public Cude(String name, float x, float y, float len, float wid, float h) {
		super(name, x, y, len, wid);
		this.h = h;
	}

	public Cude() {
		super();
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	public float area() {
		float t;
		t = (getLen() * h + getLen() * getWid() + getWid() * h) * 2;
		return t;
	}

	public float perimeter() {
		float t;
		t = (getLen() + getWid() + h) * 4;
		return t;
	}

	public String getName() {
		String t = "������";
		return t;
	}

	public void show() {
		System.out.println("��������=" + "[" + getX() + "," + getY() + "]");
		System.out.println("length= " + getLen() + "\n" + "width= " + getWid() + "\n" + "height= " + h);
		System.out.println("���= " + area() + "\t" + "�ܳ�= " + perimeter());
		System.out.println("---!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!---");
	}
}
