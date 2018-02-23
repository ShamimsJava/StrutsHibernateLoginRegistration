package com.shamim.pojo;

import com.shamim.dao.UserDao;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user"
    ,catalog="crud"
)
public class User  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String username;
     private String password;

    public User() {
    }

    public User(String name, String username, String password) {
       this.name = name;
       this.username = username;
       this.password = password;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name", length=45)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="username", length=45)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", length=45)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String execute(){
        UserDao.saveUser(this);
        return "success";
    }
    
    public String login(){
        int i = UserDao.validate(this);
        if(i>0){
            return "success";
        }else{
            return "error";
        }
        
    }
}