import java.util.*;
public class Stacks {

	public static void main(String[] args)
	{
		System.out.println("enter the length of the stack");
		Scanner inp = new Scanner(System.in);
		int val = inp.nextInt();
		ArrayList<Integer> StackNum = new ArrayList<Integer>(val);
		while(true) 
		{
			System.out.println("press (1) for push\npress (2) for pop\npress (3) to view");
			int StackAct = inp.nextInt();
					
			switch(StackAct)
			{
			case 1:
				for(int i = 0; i < val; i++)
				{
					System.out.println("Enter value" + (i+1));
					int StackVal = inp.nextInt();
					StackNum.add(StackVal);
					System.out.println("pushed");
				}
				break;
			case 2:
					System.out.println("popped");
					StackNum.remove(StackNum.size() - 1);
				break;
			case 3:
				System.out.println(StackNum);
				break;
			}
			
		}
		
	}

}
