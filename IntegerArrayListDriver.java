public class IntegerArrayListDriver {
	public static void main(String[] args) {
		IntegerArrayList list = new IntegerArrayList();
		for(int i=0; i<20; i++){
			list.add(i);
		}
		System.out.println(list);
		list.add(20);
		System.out.println(list);
	}
}