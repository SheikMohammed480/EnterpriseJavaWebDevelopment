package project1;
import java.util.*;
public class CollectionsExample {

	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<>();//List is flexible in size & redundancy
		alist.add(6);
		alist.add(10);
		alist.add(3);
		alist.add(2);
		System.out.println(alist);
		System.out.println("conatins:"+alist.contains(100));
		for(int i=4;i<10;i++)
		{
			alist.add(i);
		}
		System.out.println(alist);
		//we can store all type of data in one array
		ArrayList alist1=new ArrayList();
		alist1.add("sheik");
		alist1.add("345");
		alist1.add('c');
		System.out.println(alist1);
		//in ArrayList class,they used array so we can access element using index
		System.out.println("index:"+alist.get(3));//2
		//replace or update
		System.out.println("update:"+alist.set(0,1));//update:6 after performed
		System.out.println(alist);//[1,10,3,2,4,5,6,7,8,9]
		System.out.println(alist.remove(3));//2 is removed
	//	alist1.clear();
	//	System.out.println(alist1);// all elements are in alist1 will be cleared
		
		for(int i:alist)//likewise array
		{
			System.out.println(i);
		}//or
	/*	Iterator<Integer> i=alist.iterator();
		System.out.println("while loop");
		while(i.hasNext())
		{
			System.out.println(i.next());
		} */
		//or
		
		Iterator i=alist1.iterator();
		System.out.println("using iterator");
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		
//LinkedList also same as ArrayList
		LinkedList<Integer> llist=new LinkedList<>();
		llist.add(3);
		llist.add(4);
		llist.add(5);
		System.out.println("linkedList : ");
		System.out.println("index:"+llist.get(2));
		System.out.println(llist);
		
//Queue-FIFO
		Queue<Integer> q=new LinkedList<>();
		q.add(2);
		q.add(3);
		q.add(5);
		q.add(4);
		System.out.println("queue:"+q);
		System.out.println("head of queue is:"+q.peek());//2 is first value
		System.out.println(q.poll());//returns 1st value or returns null if empty
		System.out.println("size of queue:"+q.size());
		System.out.println("removed element:"+q.remove());//head is removed easily i.e.,2
		System.out.println(q);
	//sorted automatically while storing
		PriorityQueue<Integer> q1=new PriorityQueue<>();
		q1.add(3);
		q1.add(10);
		q1.add(5);
		System.out.println("sorted using priorityQueue:"+q1);
//sets
//	Unique values so remove redundancy
//	hashset-hashing eg.key%n n=5  key will be 7,5,8,3 so hashing index is 7%5=2,5%5=0,..
//store values in index 	7 is in 2 index,5 is in 0th index
	//we can't predict index while storing string 
		
	HashSet<String> h=new HashSet<String>();//must give dataType otherwise set gives error
	h.add("sheik");
	h.add("sharmi");
	h.add("fathi");
	h.add("sheik");
	h.add("sharmi");
	System.out.println("HashSet:"+h);//user order not maintained
	
	LinkedHashSet<String> h1=new LinkedHashSet<>();
	h1.add("sheik");
	h1.add("sharmi");
	h1.add("fathi");
	h1.add("sheik");
	h1.add("sharmi");
	System.out.println("LinkedHashSet:"+h1);//user order maintained 
	
	TreeSet<String> h2=new TreeSet<>();
	h2.add("sheik");
	h2.add("sharmi");
	h2.add("fathi");
	h2.add("sheik");
	h2.add("sharmi");
	System.out.println("Treeset alphabetically sorted:"+h2);//alphabetical order
	
	
	
	}
}
