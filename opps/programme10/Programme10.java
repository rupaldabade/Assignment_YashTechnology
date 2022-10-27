package  oops.programme10;


public class Programme10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Product original = new Product("101", "Salt", 100, "KG");

			Product copy = original.clone();
			copy.setPname("Sugar");
			copy.setPrice(50);

			if (copy instanceof Product) {
				System.out.println("copy = " + copy.getPname() + " - " + copy.getPrice());
			} else {
				System.out.println("original = " + original.getPname() + " - " + original.getPrice());
			}

			// System.out.println("original= " + original);
			// System.out.println("copy= " + copy);
		}

		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}