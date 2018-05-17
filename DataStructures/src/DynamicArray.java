
public class DynamicArray <E> {
	private int size = 0;
	private Object[] elements;
	
	public DynamicArray() {
		elements = new Object[8];
	}
	
	public void add(E e) {
		size++;
	}
}
