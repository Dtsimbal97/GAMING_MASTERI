
public abstract class FilledBuffer<T> extends CBuffer<T> {
	protected T[] numbers;
	
	public FilledBuffer(int size, IGenerable<T> generator){
		super(size);
		generate(generator);
	}
	
	@Override
	public void generate(IGenerable<T> generator){
		numbers = generator.generate(bufSize);
	}
}
