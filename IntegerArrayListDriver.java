public class IntegerArrayListDriver {
	public static void main(String[] args) {
		IntegerArrayList list = new IntegerArrayList();
		for(int i=0; i<10; i++){
			list.add(i);
		}
		System.out.println(list);
		list.insert(2, 4); //insert 2 at index 4
		System.out.println(list); //we should get [0, 1, 2, 3, 2, 4, 5, 6, 7, 8, 9]
		list.insert(12, 6);
		System.out.println(list); //we should get [0, 1, 2, 3, 2, 4, 12, 5, 6, 7, 8, 9]

	}
}