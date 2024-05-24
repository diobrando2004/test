package homework;

public class porcelain extends Product{
	public String LoaiNguyenLieu;
	public porcelain(int MaHang,String TenHang, String NhaSanXuat, String Gia, String NguyenLieu) {
		this.MaHang = MaHang;
		this.TenHang = TenHang;
		this.NhaSanXuat= NhaSanXuat;
		this.Gia=Gia;
		this.LoaiNguyenLieu = NguyenLieu;

	}
	public void GetDetails() {
		System.out.println(this.MaHang);
		System.out.println(this.TenHang);
		System.out.println(this.NhaSanXuat);
		System.out.println(this.Gia);
		System.out.println(this.LoaiNguyenLieu);
	}

}

