
public class CustomUncheckedException extends RuntimeException {

	private String mssge;
	private int exceptionCode;
	
	public CustomUncheckedException(String mssge,int exceptionCode) {
		this.mssge=mssge;
		this.exceptionCode=exceptionCode;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.mssge;
	}
	@Override
	public String getLocalizedMessage() {
		// TODO Auto-generated method stub
		return this.mssge;
	}
	
	
	public int getExceptionCode() {
		return this.exceptionCode;
	}
}
