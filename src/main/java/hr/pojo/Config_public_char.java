package hr.pojo;

import java.io.Serializable;
//员工基本信息适配表
public class Config_public_char implements Serializable{
	private Integer pbc_id;//id
	private String attribute_kind;//类型
	private String attribute_name;//名字
	public Integer getPbc_id() {
		return pbc_id;
	}
	public void setPbc_id(Integer pbc_id) {
		this.pbc_id = pbc_id;
	}
	public String getAttribute_kind() {
		return attribute_kind;
	}
	public void setAttribute_kind(String attribute_kind) {
		this.attribute_kind = attribute_kind;
	}
	public String getAttribute_name() {
		return attribute_name;
	}
	public void setAttribute_name(String attribute_name) {
		this.attribute_name = attribute_name;
	}
	

}
