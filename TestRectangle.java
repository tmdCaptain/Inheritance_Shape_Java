package Shape;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle a = new Rectangle();
		a.nhapTT();
		System.out.println(" Thông tin của hình chữ nhật");
		a.xuatTT();
		System.out.println("Diện tích hình chữ nhật: " + a.dienTich());
		System.out.println("Chu vi hình chữ nhật: " + a.chuVi());
		
		Box b = new Box();
		b.nhapTT();
		System.out.println("Thông tin của hình hộp");
		b.xuatTT();
	}

}
