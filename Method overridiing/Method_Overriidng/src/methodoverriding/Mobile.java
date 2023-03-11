package methodoverriding;

public class Mobile {
		int price,mp;
		Mobile(int price, int mp)
		{
		this.price=price;
		this.mp=mp;
		}
		public static void main(String[] args)
		{
		Mobile vivo=new Mobile(100000,8);
		Mobile apple=new Mobile(1200000,10);
		apple.compare_clarity(vivo);
		}
		void compare_clarity(Mobile mobile2){
		System.out.println(mobile2.price);
		}
		

	}

