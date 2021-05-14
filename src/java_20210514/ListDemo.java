package java_20210514;

import java.util.ArrayList;
class Product{
	private int number;
	private String name;
	private double price;
	Product() { // 앞에 붙은 public 제거 밖에서 안 보이는데 이거 할 필요 없음
		super();
		// TODO Auto-generated constructor stub
	}
	Product(int number, String name, double price) { // 앞에 붙은 public 제거 밖에서 안 보이는데 이거 할 필요 없음
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	
	
	
}

public class ListDemo {
	
	public static Product selectByNumber() {
		//Product pro = new Product(1,"신발", 100000);
		// return pro;
		// return pro에서 pro가 안 먹히면 return new Product(1,"신발", 100000); 이 방법도 있다.
		return new Product(1,"신발", 100000);
	}
	
	// 자바에서는 int, String, double 이렇게 한꺼번에 세개 받을 수 없음
	// 이런 코드의 형태는 너무나 많이 써 public ~ return까지
	// static을 안 붙이면 호출을 못하잖아
	public static ArrayList select() {
		ArrayList list = new ArrayList();
		list.add(new Product(2, "라면", 1000));
		list.add(new Product(3, "계란", 5000));
		list.add(new Product(4, "우유", 6000));
		list.add(new Product(5, "요플레", 1500));
		
		return list;
	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// ArrayList : 순서가 있고, 객체의 중복을 허용한다.
		
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("111");
		
		for(int i = 0; i < list.size(); i++) {
			String temp = (String)list.get(i);
			System.out.println(temp);
		}
		
		Product pro = selectByNumber();
		System.out.printf("%d %s %f %n", pro.getNumber(), pro.getName(), pro.getPrice());
		
		ArrayList list2 = select();
		for(int i = 0; i < list2.size(); i++){
			Product p = (Product)list2.get(i);
			System.out.printf("%d, %s, %f, %n", p.getNumber(), p.getName(), p.getPrice());
			}
		}
}
