import java.util.Date;

public class block{

	public String hash; // WILL HOLD THE DIGITAL SIGNATURE 
	public String previousHash;

	private String data; // SIMPLE MESSAGE
	private long timeStamp; // NUMBER OF MILLISECONDS

	// BLOCK CONSTRUCTOR

	public block(String data,String previousHash ) {
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
	}
}