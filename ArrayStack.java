
public class ArrayStack<T> implements Stack<T> {

	T[] arr=(T[]) new Object[10];
	int top=0;
	int item_count=0;
	
	// Appends the given element
	public void push(T item) {
		
		item_count++;
		if(item_count==arr.length)
			doubleArray();
		arr[top++]=item;
	}
	
	// Removes the element at the end of the array
	// and returns the value
	public T pop() throws Exception {

		if(item_count==0)
			throw new Exception("Array is empty");
		--item_count;
		return arr[--top];
	}
	
	// Returns the value of the last element in the array
	public T peek() throws Exception {
		
		return arr[top];
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
