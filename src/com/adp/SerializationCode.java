package com.adp;

public class SerializationCode {
private int ISBN;
private String title;
private String author;
private transient int edition=1;
public SerializationCode(int iSBN, String title, String author, int edition) {
	super();
	ISBN = iSBN;
	this.title = title;
	this.author = author;
	this.edition = edition;
}
@Override
public String toString() {
	return "SerializationCode [ISBN=" + ISBN + ", title=" + title + ", author=" + author + "]";
}




}
