package com.pro.custom;

import java.io.Serializable;

public class Bank implements Serializable {

      transient String branch;
      int ifsc;
      
      Bank(){
    	  super();
      }
      Bank(String branch, int ifsc){
    	  super();
    	  this.branch=branch;
    	  this.ifsc=ifsc;
      }
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getIfsc() {
		return ifsc;
	}
	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}
	@Override
	public String toString() {
		return "Bank [branch=" + branch + ", ifsc=" + ifsc + "]";
	}
}