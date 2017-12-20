package entity;
/**
 * 
 * <p>Program Name: Member
 * <p>Description: Member card
 * <p>Date: 2017-12-20 15:30:59
 * @author Li Zhaobin
 * @version 1.0.0
 */
public class Member {
	private int id;
	private String name;
	private String password;
	private int type;
	private double account;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * @return the account
	 */
	public double getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(double account) {
		this.account = account;
	}
}
