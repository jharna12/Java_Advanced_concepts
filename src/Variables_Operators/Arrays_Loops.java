package Variables_Operators;

public class Arrays_Loops {
	public static void main(String[] args) {
		
		int[] num =new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int room=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]<10)
			{
				room=num[i];
				System.out.println("Welcome to Room no"+ " "+ room+"!");
			}
			if(num[i]==10||num[i]>=10)
			{
				
				System.out.println("Sorry! Rooms are not available");
				break;
			}
		}
		
		
	}

}
