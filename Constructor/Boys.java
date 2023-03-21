public class Boys {
	String name;//fields//global variable
	int amount;
	Boys(){
		System.out.println("Welcome to our Hostal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boys boy=new Boys();
		boy.name="Raja";
		boy.amount=1000;//object specific value
		//boy.gotoShop();
		Boys.provide_chocolate();
		//System.out.println(this.name);

	}
	 static void provide_chocolate() {
		//System.out.println(this.name);
		 //Cannot use this in the static context
		System.out.println("Distributed chocalte");
	}
	void gotoShop(){
		int amount=50;
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(this.amount);
		System.out.println(amount);
	}

}
