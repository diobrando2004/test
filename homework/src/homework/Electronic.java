package homework;

public class Electronic extends Product {
	public String ThoiGianBaoHanh;
	public int DienAp;
	public int CongSuat;
	public Electronic(int MaHang,String TenHang, String NhaSanXuat, String Gia, String ThoiGianBaoHanh, int DienAp, int CongSuat) {
		this.MaHang = MaHang;
		this.TenHang = TenHang;
		this.NhaSanXuat= NhaSanXuat;
		this.Gia=Gia;
		this.ThoiGianBaoHanh=ThoiGianBaoHanh;
		this.DienAp = DienAp;
		this.CongSuat =CongSuat;
	}
	public void GetDetails() {
		System.out.println(this.MaHang);
		System.out.println(this.TenHang);
		System.out.println(this.NhaSanXuat);
		System.out.println(this.Gia);
		System.out.println(this.ThoiGianBaoHanh);
		System.out.println(this.DienAp);
		System.out.println(this.CongSuat);
	}
}
