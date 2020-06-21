package com.vyom.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
//    {
//    	"token":eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ2eW9tIiwiZXhwIjoxNTkzMjgxNTQ2LCJpYXQiOjE1OTI2NzY3NDZ9.aa2BQG3t0gE7ZFSHkfWzFHG7Lx7UK6JFTW0nuc8gIefMc9JF83GRYlO4_uQmv0FL5BuSUNTmQHVAZEU3XVQXlQ
//    }

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

