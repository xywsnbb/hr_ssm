package hr.pojo;

import java.io.Serializable;
//关键字设置表
public class Config_primary_key implements Serializable{
	private Integer prk_id;//id
	private String primary_key_table;//表名
	private String primary_key;//字段名
	private String key_name;//键名
	private Integer primary_key_status;//状态
	public Integer getPrk_id() {
		return prk_id;
	}
	public void setPrk_id(Integer prk_id) {
		this.prk_id = prk_id;
	}
	public String getPrimary_key_table() {
		return primary_key_table;
	}
	public void setPrimary_key_table(String primary_key_table) {
		this.primary_key_table = primary_key_table;
	}
	public String getPrimary_key() {
		return primary_key;
	}
	public void setPrimary_key(String primary_key) {
		this.primary_key = primary_key;
	}
	public String getKey_name() {
		return key_name;
	}
	public void setKey_name(String key_name) {
		this.key_name = key_name;
	}
	public Integer getPrimary_key_status() {
		return primary_key_status;
	}
	public void setPrimary_key_status(Integer primary_key_status) {
		this.primary_key_status = primary_key_status;
	}
	

}
