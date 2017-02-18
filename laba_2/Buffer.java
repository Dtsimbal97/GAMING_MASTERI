import java.io.*;

public class Buffer<T extends Comparable<T>> extends FilledBuffer<T> implements IBufferPrintable, 
IBufferSortable, IBufferComputeable<T>, IBufferStorable{
	
	private T max, min, sum;
	
	public Buffer(int size, IGenerable<T> generator){
		super(size, generator);
		_calcMin();
		_calcMax();
		//_calcSum();
	}
	
	private void _calcMin(){
		if(numbers.length == 0)
			return;
		min = numbers[0];
		for(int i = 1; i < numbers.length; i++)
			if(numbers[i].compareTo(min) < 0)
				min = numbers[i];
	}
	
	private void _calcMax(){
		if(numbers.length == 0)
			return;
		max = numbers[0];
		for(int i = 1; i < numbers.length; i++)
			if(numbers[i].compareTo(max) > 0)
				max = numbers[i];
	}
	
	/*private void _calcSum(){
		sum = zero();
		for(int i = 0; i < numbers.length; i++)
			sum =  sum + numbers[i];
	}*/
	
	@Override
	public void printInfo(){
		System.out.println("id: <" + bufID + ">; " + "type: <float>;" + " size: <" + bufSize + ">");
	}
	
	@Override
	public void print(){
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();
	}
	
	@Override
	public void printFirstN(int n) throws ArrayIndexOutOfBoundsException{
		if(n < 0 || n > numbers.length)
			throw new ArrayIndexOutOfBoundsException("printFirstN(): Out of range");
		for(int i = 0; i < n; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();
	}
	
	@Override
	public void printLastN(int n) throws ArrayIndexOutOfBoundsException{
		if(n < 0 || n > numbers.length)
			throw new ArrayIndexOutOfBoundsException("printLastN(): Out of range");
		for(int i = numbers.length - n; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();
	}
	
	@Override
	public void sort(){
		if(numbers.length <= 1)
			return;
		T temp;
		for(int i = numbers.length-1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if(numbers[j].compareTo(numbers[j + 1]) > 0){
					temp = numbers[j]; 
					numbers[j] = numbers[j + 1]; 
					numbers[j + 1] = temp;
				}
			}
		}
	}
	
	@Override
	public T max(){
		return max;
	}
	
	@Override
	public T min(){
		return min;
	}
	
	@Override
	public T sum(){
		return sum;
	}
	
	private void _save(String fileName, String ends) throws FileNotFoundException{
		PrintWriter writer = new PrintWriter(new File(fileName));
		for(int i = 0 ; i < numbers.length; i++)
			writer.print(numbers[i] + ends);
		writer.close();
		System.out.println("Success write to " + fileName);
	}
	
	@Override
	public void saveOnLine(String fileName) throws FileNotFoundException {
		_save(fileName, " ");
	}
	
	@Override
	public void saveSeparateLine(String fileName)throws FileNotFoundException{
		_save(fileName, "\n");
	}
}
