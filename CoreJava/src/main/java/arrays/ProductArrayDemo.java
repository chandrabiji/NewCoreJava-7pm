package arrays;

import java.util.Scanner;

class Product{
	
	public int pid;
	public String pname;
	public int qty;
	public double price;
	
	public Product(int pid, String pname, int qty, double price) {
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}
	
	
}
public class ProductArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Array Size ?");
		int size = sc.nextInt();
		Product[] products = new Product[size];
		System.out.println("Enter Product Array Element ?");
		for(int i=0;i<size;++i){
			System.out.println("Enter Product Id?");
			int pid = sc.nextInt();
			System.out.println("Enter Product Name ?");
			String pname = sc.next();
			System.out.println("Enter Product Qty?");
			int qty = sc.nextInt();
			System.out.println("Enter Product Price ?");
			double price = sc.nextDouble();
			Product product = new Product(pid,pname,qty,price);
			products[i]=product;
			
		}
		System.out.println("Product List");
		System.out.println("-------------");
		System.out.println("PID"+"\t"+"PNAME"+"\t"+"QTY"+"\t"+"PRICE");
		System.out.println("------------------------------------------");
		for(Product p:products){
			System.out.println(p.pid+"\t"+p.pname+"\t"+p.qty+"\t"+p.price);
		}

	}

}
