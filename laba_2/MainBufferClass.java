public class MainBufferClass {
	public static void printNums(IGenerable<Integer> gener){
		Integer[] nums = gener.generate(10);
		for(int n : nums)
			System.out.println(n);
	}
	
	public static void main(String[] args) {
		try{
			Buffer<Integer> buffer = new Buffer<Integer>(30, Generators.intGenerator);
			buffer.sort();
			buffer.print();
			Buffer<Float> buffer1 = new Buffer<Float>(30, Generators.floatGenerator);
			buffer1.sort();
			buffer1.print();
		} catch(Exception e){
			System.out.println(e);
		}
	}
}
