
public interface IBufferPrintable {
	public void printInfo();
	public void print();
	public void printFirstN(int n) throws ArrayIndexOutOfBoundsException;
	public void printLastN(int n) throws ArrayIndexOutOfBoundsException;
}
