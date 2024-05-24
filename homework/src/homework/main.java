package homework;

public class main {

	public static void main(String[] args) {
		Electronic product1 = new Electronic(145, "Electronic Fan", "random brand", "1235$", "6 months", 66, 66);
		food product2 = new food(213, "bread", "random baker","1$","1/1/2024","1/1/2754");
		porcelain product3 = new porcelain(234, "tea pot", "idk", "15$", "clay");
		product1.GetDetails();
		product2.GetDetails();
		product3.GetDetails();
	}

}
