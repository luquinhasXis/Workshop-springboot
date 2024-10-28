package com.techlucas.workmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO author;
	
	public CommentDTO() {
	}

	public CommentDTO(String text, Date date, AuthorDTO author) {
		super();
		this.text = text;
		this.date = date;
		this.author = author;
	}

	public String getTexto() {
		return text;
	}

	public void setTexto(String texto) {
		this.text = texto;
	}

	public Date getData() {
		return date;
	}

	public void setData(Date data) {
		this.date = data;
	}

	public AuthorDTO getAutor() {
		return author;
	}

	public void setAutor(AuthorDTO autor) {
		this.author = autor;
	}
}
