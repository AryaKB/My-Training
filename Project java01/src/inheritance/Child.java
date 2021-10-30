package inheritance;

public class Child extends Parent{
	public void display1()
	{
		System.out.println("Child Class ");
		
	}

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.display1();
		// TODO Auto-generated method stub

	}

}
