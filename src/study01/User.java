package study01;

public class User {
	
	int 번호;
	String 이메일;
	String 비밀번호;
	@Override
	public String toString() {
		return "User [번호=" + 번호 + ", 이메일=" + 이메일 + ", 비밀번호=" + 비밀번호 + ", 삭제여부=" + 삭제여부 + "]";
	}
	boolean 삭제여부;
	public int get번호() {
		return 번호;
	}
	public void set번호(int 번호) {
		this.번호 = 번호;
	}
	public String get이메일() {
		return 이메일;
	}
	public void set이메일(String 이메일) {
		this.이메일 = 이메일;
	}
	public String get비밀번호() {
		return 비밀번호;
	}
	public void set비밀번호(String 비밀번호) {
		this.비밀번호 = 비밀번호;
	}
	public boolean is삭제여부() {
		return 삭제여부;
	}
	public void set삭제여부(boolean 삭제여부) {
		this.삭제여부 = 삭제여부;
	}
	
}
