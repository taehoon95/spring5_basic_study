package spring5_basic_study.di;

public class RegisterRequest {

	private String email;
	private String password;
	private String comfirmPassword;
	private String name;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getComfirmPassword() {
		return comfirmPassword;
	}

	public void setComfirmPassword(String comfirmPassword) {
		this.comfirmPassword = comfirmPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPasswordEqualToConfirmPassword() {
		return password.equals(comfirmPassword);
	}

	@Override
	public String toString() {
		return String.format("RegisterRequest [email=%s, password=%s, comfirmPassword=%s, name=%s]", email, password,
				comfirmPassword, name);
	}
	
	
}
