
public class TestClass<T extends Comparable<T>> {
	private T nums[];
	
	public TestClass(int size, IGenerable<T> generator){
		this.nums = generator.generate(size);
	}
	
	public void print(){
		for(T n : nums){
			System.out.println(n);
		}
	}
}
