
public abstract class CBuffer<T> {
	protected int bufID;
	protected int bufSize;
	private static int BUF_COUNT = 0;
	
	public CBuffer(int size){
		this.bufID = ++CBuffer.BUF_COUNT;
		this.bufSize = size;
	}
	
	public int getId(){
		return bufID;
	}
	
	public int getBufCount(){
		return CBuffer.BUF_COUNT;
	}
	
	public int getSize(){
		return bufSize;
	}
	
	public abstract void generate(IGenerable<T> generator);
}
