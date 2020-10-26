package jp.co.internous.ecsite.model.dto;

import jp.co.internous.ecsite.model.entity.User;
// Data Tranfer Object  Javaから画面に送るデータの管理//
public class LoginDto {
	
	private long id;
	private String userName;
	private String password;
	private String fullName;
	//3パターンでインスタンス化できるように３つのコンストラクタを作る//
	// コンストラクタ1 インスタンス化の際に初期設定せずSetterでデータセット//
	public LoginDto() {}

	//コンストラクタ2　User Entityをまとめて受け取りデータセット//
	public LoginDto(User user) {
		this.id = user.getId();
		this.userName = user.getUserName();
		this.password = user.getPassword();
		this.fullName = user.getFullName();
	}
	
	//コンストラクタ3　引数を分けて受け取りデータをセット//
	public LoginDto(long id, String userName, String password, String fullName) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void serUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName(){
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
