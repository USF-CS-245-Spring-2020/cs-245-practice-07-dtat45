
public class ArrayQueue<T> implements Queue<T> {

	T[] arr=(T[]) new Object[10];
	int front=0;
	int back=-1;
	int item_count=0;
	
	// Adds the given element into the next open index
	public void enqueue(T item) {

		++item_count;
		if(item_count==arr.length)
			doubleArray();
		arr[++back%arr.length]=item;
	}
	
	// Removes the element at the 'back' of the array
	public T dequeue() throws Exception {
		// TODO Auto-generated method stub
		if(item_count==0)
			throw new Exception("Array is empty");
		--item_count;
		return arr[front++%arr.length];
	}

	// Returns 'true' if the array is empty;
	// returns 'false' if the array has elements
	public boolean empty() {

		if(item_count>0)
			return false;
		return true;
	}
	
	// Doubles the size of the array
	public void doubleArray() {
		
		@SuppressWarnings("unchecked")
		T[] temp=(T[]) new Object[item_count*2];
		
		// Copies elements from the initial array to a larger array
		for(int i=0;i<item_count;i++) 
			temp[i]=arr[i];
		arr=temp;
	}
}
