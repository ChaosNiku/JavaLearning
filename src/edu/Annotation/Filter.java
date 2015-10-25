 package edu.Annotation;
@Table("student")
public class Filter {
	  @Column("email")
	  private String email; 
	  @Column("Stuname")
	  private String stuName;
	  @Column("Nickname")
	  private String nickName;
	  @Column("id")
	  private int stuId;
	  
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	} 
	  
}
