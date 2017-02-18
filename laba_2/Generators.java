import java.util.Random;

public class Generators {
	static Random random = new Random();
	
	static IGenerable<Integer> intGenerator = (size) -> {
		Integer[] nums = new Integer[size];
		for(int i = 0 ; i < size; i++)
			nums[i] = Math.abs(random.nextInt() % 1000);
		return nums;
	};
	
	static IGenerable<Float> floatGenerator = (size) -> {
		Float[] nums = new Float[size];
		for(int i = 0 ; i < size; i++)
			nums[i] = random.nextFloat() * 1000;
		return nums;
	};
	
	static IGenerable<Double> doubleGenerator = (size) -> {
		Double[] nums = new Double[size];
		for(int i = 0 ; i < size; i++)
			nums[i] = random.nextDouble() * 1000;
		return nums;
	};
	
	static IGenerable<Long> longGenerator = (size) -> {
		Long[] nums = new Long[size];
		for(int i = 0 ; i < size; i++)
			nums[i] = Math.abs(random.nextLong() % 1000);
		return nums;
	};
	
}
