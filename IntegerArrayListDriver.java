public class IntegerArrayListDriver {
	public static void main(String[] args) {
		IntegerArrayList list = new IntegerArrayList();
		for(int i=0; i<10; i++){
			list.add(i);
		}
		System.out.println(list);
		list.insert(2, 10);
		System.out.println(list);

// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 2]
	}
}