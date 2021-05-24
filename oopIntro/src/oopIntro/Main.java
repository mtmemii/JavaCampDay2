package oopIntro;

public class Main {

	public static void main(String[] args) {
	
		Product product1=new Product(1,"Lenoovo V14",15000,"16 GB Ram"); /*referans olu�turma, intance.*/

		
		Product product2=new Product(); 
		product2.id=2;
		product2.name="Lenovo V15";
		product2.unitPrice= 18000;
		product2.detail="32 GB Ram";
		
		Product product3=new Product();
		product3.id=3;
		product3.name="Hp Omen";
		product3.unitPrice= 23000;
		product3.detail="64 GB Ram";
				
		Product[] products= {product1,product2,product3};
		
		for(Product product:products) {
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
	
		Category category1=new Category();
		category1.id=1;
		category1.name="Elektronik";
		
		Category category2=new Category();
		category2.id=2;
		category2.name="Ev/Bah�e";
		
		ProductManager productManeger=new ProductManager();
		productManeger.addToCart(product1);
		
		productManeger.addToCart(product2);
		
		productManeger.addToCart(product3);
		
	}

}
