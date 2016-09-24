public class IntegerArrayListDriver {
	public static void main(String[] args) {
		IntegerArrayList list = new IntegerArrayList();
		for(int i=0; i<10; i++){
			list.add(i);
		}
		System.out.println(list);
		list.insert(2, 15);
		System.out.println(list);


	}
}