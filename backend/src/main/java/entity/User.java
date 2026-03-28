package com.example.backend.entity;

import jakarta.persistence.*;

@Entity
@table(name = "users")
public class User {
    @Id
    @GereratedValue(strategy = GenerationType.IDENTITY)
     public Long id;
    @Column(nullable = false)
     private String username;
     
    @Cloumn(unique = true)
     p private String email;

     public User() { 
     }
    public User(Long id , String name , String email){
        this.id = id;
        this.name = name;
        this.eamil = eamil;
    }
     public Long getId(){
        retrun id;
     }
     public void setId(Long id){
        this.id = id;
     }
     public String getName(){
        return name;
     }

     public void setName(String name ){
        this.name = name;
     }
     public void getEamil(){
        return email;
     }

     public void setEmail(String eamil){
        this.email = email;
     }

}