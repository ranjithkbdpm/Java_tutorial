package coll_class;
import java.util.*;

public class MyCollectionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(5);
		al.add(5);
		al.add(30);
		
		al.add(5,25);
		
		Iterator<Integer> i=al.iterator();
		
		while(i.hasNext())
		{
			System.out.println("The arraylist element is "+i.next());
		}
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("second");
		ll.add("third");
		ll.add("Ramesh");
		ll.add("Rajesh");
		
		ll.addFirst("first");
		
		Iterator<String> k=ll.descendingIterator();
		
		while(k.hasNext())
		{
			System.out.println("The next element in linked list is "+k.next());
		}
		
		System.out.println("The value in 0 position is "+ll.get(0));
		
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		
		hs.add(10);
		
		for(Integer a:hs)
		{
			
			System.out.println("The set values are "+a);
			
		}
		
		
		LinkedHashSet<Float> lhs=new LinkedHashSet<Float>();
		
		lhs.add(10.2F);
		lhs.add(10.3F);
		lhs.add(10.5F);
		lhs.add(11.2F);
		lhs.add(12.0F);
		
		for(Float f:lhs)
		{
			System.out.println("The Linked hash set value is "+f);
		}
		
		TreeSet<Integer> ts=new TreeSet<Integer>(new MyComparator());
		
		ts.add(20);
		ts.add(10);
		ts.add(5);
		ts.add(15);
		ts.add(17);
		
		for(Integer i1:ts)
		{
			System.out.println("The tree set value is "+i1);
		}
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		pq.offer(20);
		pq.offer(30);
		pq.offer(10);
		pq.offer(5);
		
		
		System.out.println("The peeked value is "+pq.peek());
		
		System.out.println("The poll value is "+pq.poll());
		
		System.out.println("The peeked value is "+pq.peek());
		
		
		
		
		
		

	}

}
