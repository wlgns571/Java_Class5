package java_day18.homepage;

public class Member {
	
	private String id;
	private String password;
	
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public Member() {
		
	}

	@Override
	public String toString() {
		return "[아이디: " + id + ", 비밀번호: " + password + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
