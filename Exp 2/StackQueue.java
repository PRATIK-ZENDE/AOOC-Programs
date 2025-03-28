import java.util.*;
class StackQueue
{
	public static void main(String args[])
	{
		Stack<Integer> stack=new Stack<>();
		Queue<Integer> queue=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Choose an operation:");
			System.out.println("1.Push into the stack");
			System.out.println("2.Pop from the stack");
			System.out.println("3.Enqueue to the queue");
			System.out.println("4.Dequeue from the queue");
			System.out.println("5.Display the Stack and Queuee");
			System.out.println("6.Exit\n");
			
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("Enter the number to push:");
				int svalue=sc.nextInt();
				stack.push(svalue);
				System.out.println(svalue+"->pushed into the Stack\n");
				break;
				
				case 2:
				if(!stack.isEmpty())
				{
					System.out.println("Poped from the Stack->"+stack.pop()+"\n");
				}
				else
				{
					System.out.println("Stack is Empty\n");
				}
				break;
				
				case 3:
				System.out.println("Enter the number to enqueue:");
				int qvalue=sc.nextInt();
				queue.add(qvalue);
				System.out.println(qvalue+"->enqueued to the Queue\n");
				break;
				
				case 4:
				if(!queue.isEmpty())
				{
					System.out.println("Dequeued from the Queue->"+queue.poll()+"\n");
				}
				else
				{
					System.out.println("Queue is Empty\n");
				}
				break;
				
				case 5:
					System.out.println("Stack Contents->"+stack);
					System.out.println("Queue Contents->"+queue+"\n");
				break;
				
				case 6:
				System.out.println("Exiting...");
				sc.close();
				return;
				
				default:
				System.out.println("Wrong Choice...\n");
			}
						
		}
	}
}