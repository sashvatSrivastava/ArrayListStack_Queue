import java.util.*;

public class Queues {

	public static void main(String[] args) 
	{
		System.out.println("enter the length of the Queue");
		Scanner inp = new Scanner(System.in);
		int val = inp.nextInt();
		ArrayList<Integer> QueueNum = new ArrayList<Integer>(val);
		while(true) 
		{
			System.out.println("press (1) for enqueue\npress (2) for dequeue\npress (3) to view");
			int QueueAct = inp.nextInt();
					
			switch(QueueAct)
			{
			case 1:
				for(int i = 0; i < val; i++)
				{
					System.out.println("Enter value" + (i+1));
					int QueueVal = inp.nextInt();
					QueueNum.add(QueueVal);
					System.out.println("enqueued");
				}
				break;
			case 2:
					System.out.println("dequeued");
					QueueNum.remove(0);
				break;
			case 3:
				System.out.println(QueueNum);
				break;
			}
			inp.close();
		}
		
	}

}
