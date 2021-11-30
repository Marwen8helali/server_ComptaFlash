package com.grokonez.jwtauthentication.entitys;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.grokonez.jwtauthentication.model.User;

@Entity
@Table(name = "notifications")
public class Notifications {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String message;
	

    private String title;
    
	@ManyToOne
	@JoinColumn(nullable = true,name="users_id")
	private User user;


	private LocalDateTime adddate = LocalDateTime.now();
	
	private boolean isSeen = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	public LocalDateTime getAdddate() {
		return adddate;
	}

	public void setAdddate(LocalDateTime adddate) {
		this.adddate = adddate;
	}

	public boolean isSeen() {
		return isSeen;
	}

	public void setSeen(boolean isSeen) {
		this.isSeen = isSeen;
	}



	public Notifications() {
		super();
	}
	 
	 
	 
	
	
	
    
}
