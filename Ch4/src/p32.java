public class p32 
{
	public static void main(String[] args) 
	{
		Vehicle[] vc;
		vc = new Vehicle[2];
		
		
		vc[0] = new Car10(1234,20.5);
		vc[1] = new Plane(232);
	
		for(int i = 0; i < vc.length;i++)
		{
			if(vc[i] instanceof Car10)
				System.out.println("第" +(i+1) + "個物件是Car類別");
			else
				System.out.println("第" +(i+1) + "個物件不是Car類別");
		}
	}
}