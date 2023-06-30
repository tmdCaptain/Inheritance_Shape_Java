package Shape;

import java.util.Scanner;

public class Rectangle {
	
	static Scanner sc = new Scanner(System.in);
	private double width;
	private double length;
	public Rectangle() {
		
	}
//	Vì ở đây sử dụng private thì class thực thi sẽ không dùng được
//	nên phải thêm method get set
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double dienTich() {
		return this.width * this.length;
	}
	
	public double chuVi() {
		return (this.width + this.length) *2;
	}
	
	public void nhapTT() {
		System.out.println("Nhập chiều dài:");
		this.length = sc.nextDouble();
		System.out.println("Nhập chiều rộng:");
		this.width = sc.nextDouble();
	}
	
	public void xuatTT() {
		
//		Không nên xuất dữ liệu riêng diện tích và 
//		chu vi của lớp cha vì nó sẽ ảnh hưởng đến lớp con
		System.out.println("Chiều dài của hình chữ nhật "+ this.length);
		System.out.println("Chiều rộng của hình chữ nhật " + this.width);
	}
	
}

class Box extends Rectangle {
	
	private double height;
	
//	Constructor rỗng
	public Box() {
		
	}
	public Box(double width, double length, double height) {
//		Chính vì kế thừa từ 2 thuộc tính chung, vì thế super(witdh,length)
		super(width, length);
		this.height = height;
	}
	
	public double dienTich() {
		return 2*(this.getWidth()*this.getLength() + this.getWidth()*this.height
				+ this.getLength()*this.height);
	}
	
	public double theTich() {
		return this.getWidth() * this.getWidth() * this.height;
	}
	
	public void nhapTT() {
		super.nhapTT();
		System.out.println("Nhập chiều cao:");
		this.height = sc.nextDouble();
	}
	
	public void xuatTT() {
		super.xuatTT();
//		Tại vì hình hộp kế thừa 2 thuộc tính của Rectangle nên sẽ xuất tt chiều dài và rộng
//		từ lớp cha
		System.out.println("Diện tích của hình hộp : " + this.dienTich());
		System.out.println("Thể tích của hình hộp : " + this.theTich());
	}
}
