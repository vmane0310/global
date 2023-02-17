package com.example.demo.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class ResponeError 
{
  private Date timestamp;
  private int statuscode;
  private String errormsg;
  private HttpStatus status;
  private String path;
public Date getTimestamp() {
	return timestamp;
}
public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
}
public int getStatuscode() {
	return statuscode;
}
public void setStatuscode(int statuscode) {
	this.statuscode = statuscode;
}
public String getErrormsg() {
	return errormsg;
}
public void setErrormsg(String errormsg) {
	this.errormsg = errormsg;
}
public HttpStatus getStatus() {
	return status;
}
public void setStatus(HttpStatus status) {
	this.status = status;
}
public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}
public ResponeError(Date timestamp, int statuscode, String errormsg, HttpStatus status, String path) {
	super();
	this.timestamp = timestamp;
	this.statuscode = statuscode;
	this.errormsg = errormsg;
	this.status = status;
	this.path = path;
}
public ResponeError() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "ResponeError [timestamp=" + timestamp + ", statuscode=" + statuscode + ", errormsg=" + errormsg
			+ ", status=" + status + ", path=" + path + "]";
}
  
  
}
