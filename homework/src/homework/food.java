package homework;

public class food extends Product{
	public String NgaySanXuat;
	public String NgayHetHan;
	public food(int MaHang,String TenHang, String NhaSanXuat, String Gia, String NgaySanXuat, String NgayHethan) {
		this.MaHang = MaHang;
		this.TenHang = TenHang;
		this.NhaSanXuat= NhaSanXuat;
		this.Gia=Gia;
		this.NgaySanXuat = NgaySanXuat;
		this.NgayHetHan = NgayHethan;
	}
	public void GetDetails() {
		System.out.println(this.MaHang);
		System.out.println(this.TenHang);
		System.out.println(this.NhaSanXuat);
		System.out.println(this.Gia);
		System.out.println(this.NgayHetHan);
		System.out.println(this.NgaySanXuat);
	}
}
