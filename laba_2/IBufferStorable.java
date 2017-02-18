import java.io.FileNotFoundException;

public interface IBufferStorable {
	public void saveOnLine(String fileName) throws FileNotFoundException;
	public void saveSeparateLine(String filename) throws FileNotFoundException;
}
