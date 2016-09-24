public class IntegerArrayList {
	private int size;
	private int capacity;
	private int[] array;
	private final int GROW_LENGTH = 10;

	public IntegerArrayList(){
		size = GROW_LENGTH;
		capacity = 0;
		array = new int[size];
	}

	// Adds element e to the end of this ArrayList
	public void add(int e){
		growIfFull();
		array[capacity] = e;
		capacity++;
	}

	// Inserts element e at index i of ArrayList, shifts following elements right
	public void insert(int e, int i){
		if(i==capacity){
			add(i);
		}
		else if(validateIndex(i)){
			growIfFull();
			capacity++;
			for(int a=capacity-2; a>=i; a--){
				array[a+1] = array[a];
				// debugging System.out.println(this);
			}
			array[i] = e;
			// debugging System.out.println(this);

		}
	}

	// Replaces element at index i of ArrayList with new element e
	public void replace(int i, int e){
		if(validateIndex(i)){
			array[i] = e;
		}
	}

	// Removes element at index i of ArrayList, shifts following elements left
	public void remove(int i){
		if(validateIndex(i)){
			capacity--;
			for(int a=i; a<capacity; a++){
				array[a] = array[a+1];
			}
		}
	}

	// Prints out contents of ArrayList
	public void print(){
		System.out.println(toString());
	}

	public String toString(){
		if(capacity==0){
			return "[]";
		}
		else {
			String returnString = "[";

			for(int i=0; i<capacity-1; i++){
				returnString = returnString + array[i] + ", ";
			}
			returnString = returnString + array[capacity-1] + "]" /*+" (capacity " + capacity + " , size " + size + ")"*/;
			return returnString;
		}
	}

	// If capacity equals size of ArrayList, increment size by GROW_LENGTH
	private void growIfFull(){
		if(capacity==size){
			int[] newArray = new int[size+GROW_LENGTH];
			for(int i=0; i<size; i++){
				newArray[i] = array[i];
			}
			array = newArray;
			size+=GROW_LENGTH;
		}
	}

	// Array indexes run from 0 to capacity-1. This method makes sure that if a specified index is outside of this range, no change is made.
	private boolean validateIndex(int i){
		if(i>=capacity || i<0){
			System.out.println("No element with index " + i + " exists in this array.  No change has been made.");
			return false;
		}
		return true;
	}
}