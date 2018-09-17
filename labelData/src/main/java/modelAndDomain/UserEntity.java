package modelAndDomain;
import java.io.Serializable;
public class UserEntity implements Serializable {
     private static final long serialVersionUID=1L;
     private Long id;
     private String userName;
     private String password;
     
     
     public UserEntity() {
    	 super();
     }
     public UserEntity(String userName,String password) {
    	 super();
    	 this.password=password;
    	 this.userName=userName;
     }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "userName"+this.userName+",password"+this.password;
	}
	
	
     
     
     

}
