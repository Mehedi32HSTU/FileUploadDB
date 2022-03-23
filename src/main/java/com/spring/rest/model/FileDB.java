package com.spring.rest.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@Table(name="file")
public class FileDB {
	
	@Id
	private String Id;
	
	@Column
	private String name;
	
	@Column
	private String type;
	
	@Lob
	private byte[] data;

	
	public FileDB() {
		
	}
	
	public FileDB(String Id, String name, String type, byte[] data) {
		this.Id = Id;
		this.name = name;
		this.type = type;
		this.data = data;
	}
	
	public String getId() {
		return Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "FileDB [Id=" + Id + ", name=" + name + ", type=" + type + ", data=" + Arrays.toString(data) + "]";
	}



}
