
 class Shop {
	 //field // non-static // Global variable
	String brand;
	int price,discount;
	Shop(String brand,int price,int discount){
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		brand=a;
//		price=b;
//		discount=c;
		this.brand=brand;//this keyword
		this.price=price;
		this.discount=discount;
		
	}
	void buy() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(discount);
	}
	Shop(String brand,int price){
		this.brand=brand;
		this.price=price;
	}
	Shop(){
		System.out.println("No-arguments construtor");
	}
	 
	public static void main(String[] args) {
		Shop prod1=new Shop("ABC",100,10);//local variables
		Shop prod4=new Shop("RICE",10);//local variables
		Shop prod5=new Shop();
//		prod1.brand="ABC";
//		prod1.price=100;
//		prod1.discount=10;
		Shop prod2=new Shop("PQR",150,15);
//		prod2.brand="PQR";
//		prod2.price=150;
//		prod2.discount=15;
		Shop prod3=new Shop("XYZ",200,20);
//		prod3.brand="XYZ";
//		prod3.price=200;
//		prod3.discount=20;
		System.out.println(prod1.brand);
		System.out.println(prod2.price);
		System.out.println(prod3.discount);
		System.out.println(prod4.brand);
		prod1.buy();
	
		
	}

}
