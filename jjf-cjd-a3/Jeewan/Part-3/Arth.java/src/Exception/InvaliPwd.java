package Exception;

public class InvaliPwd extends RuntimeException {
	@Override
	public String getMessage() {
		return "Pwd is incorrect";
	}

}
