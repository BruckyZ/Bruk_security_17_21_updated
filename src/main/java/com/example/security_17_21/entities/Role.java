package com.example.security_17_21.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(unique=true)
	private String role;

	@ManyToMany(mappedBy = "roles")
	private Set<User> users;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getRole()
	{
		return role;
	}

	public void setRole(String role)
	{
		this.role = role;
	}

	public Set<User> getUsers()
	{
		return users;
	}

	public void setUsers(Set<User> users)
	{
		this.users = users;
	}
}