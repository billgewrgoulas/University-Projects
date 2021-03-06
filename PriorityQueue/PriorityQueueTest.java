//Vasileios Gewrgoulas
//AM 2954 



class PriorityQueueTest {
	
	public static void main(String[] args){
		PriorityQueue pq1 = new PriorityQueue();
		pq1.insert(12);
		pq1.insert(2);
		pq1.insert(10);
		pq1.insert(18);
		pq1.insert(12);
		pq1.insert(32);
		pq1.insert(11);
		pq1.insert(9);
		pq1.insert(32);
		pq1.insert(15);
		
		System.out.println(pq1);
		
		PriorityQueue pq2 = new PriorityQueue();
		pq2.insert(12);
		pq2.insert(9);
		pq2.insert(18);
		pq2.insert(15);
		pq2.insert(11);
		pq2.insert(32);
		pq2.insert(12);
		pq2.insert(2);
		pq2.insert(10);
		pq2.insert(32);
		
		System.out.println(pq2);
		
		if (pq1.equals(pq2)){
			System.out.println("The two queues are the same!");
		}else{
			System.out.println("The two queues are NOT the same!");
		}
		
		 
		pq1.insert(5);
		System.out.println(pq1);
		System.out.println(pq1.extractMax());
		System.out.println(pq1);
		System.out.println(pq1.getMax());
		pq1.merge(pq2);
		System.out.println(pq1);
		
		
		pq2.insert(2); pq2.insert(5); pq2.insert(10); pq2.insert(2);pq2.insert(10);pq2.insert(12);
		System.out.println(pq2);
		if (pq1.equals(pq2)){
			System.out.println("The two queues are the same!");
		}else{
			System.out.println("The two queues are NOT the same!");
		}
		for(int i = 0; i<21; ++i){
			pq1.extractMax();
			System.out.println(pq1);
		}
		
	}

}
