package com.zcw.entity;

public class UserEntity {

	private Long utId;

	private String utName;

	private String utEmail;

	private String utAddr;

	private short utGender;

	private String utOrgid;

	public UserEntity() {
	}

	public UserEntity(String utName, String utEmail, String utAddr, short utGender, String utOrgid) {
		super();
		this.utName = utName;
		this.utEmail = utEmail;
		this.utAddr = utAddr;
		this.utGender = utGender;
		this.utOrgid = utOrgid;
	}

	public Long getUtId() {
		return utId;
	}

	public void setUtId(Long utId) {
		this.utId = utId;
	}

	public String getUtName() {
		return utName;
	}

	public void setUtName(String utName) {
		this.utName = utName;
	}

	public String getUtEmail() {
		return utEmail;
	}

	public void setUtEmail(String utEmail) {
		this.utEmail = utEmail;
	}

	public String getUtAddr() {
		return utAddr;
	}

	public void setUtAddr(String utAddr) {
		this.utAddr = utAddr;
	}

	public short getUtGender() {
		return utGender;
	}

	public void setUtGender(short utGender) {
		this.utGender = utGender;
	}

	public String getUtOrgid() {
		return utOrgid;
	}

	public void setUtOrgid(String utOrgid) {
		this.utOrgid = utOrgid;
	}

	@Override
	public String toString() {
		return "UserEntity [utId=" + utId + ", utName=" + utName + ", utEmail=" + utEmail + ", utAddr=" + utAddr
				+ ", utGender=" + utGender + ", utOrgid=" + utOrgid + "]";
	}

}
