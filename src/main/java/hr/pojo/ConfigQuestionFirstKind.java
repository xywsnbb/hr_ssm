package hr.pojo;

import java.io.Serializable;

public class ConfigQuestionFirstKind implements Serializable{
	private int qfk_id;
	private String first_kind_id;
	private String first_kind_name;
	public int getQfk_id() {
		return qfk_id;
	}
	public void setQfk_id(int qfk_id) {
		this.qfk_id = qfk_id;
	}
	public String getFirst_kind_id() {
		return first_kind_id;
	}
	public void setFirst_kind_id(String first_kind_id) {
		this.first_kind_id = first_kind_id;
	}
	public String getFirst_kind_name() {
		return first_kind_name;
	}
	public void setFirst_kind_name(String first_kind_name) {
		this.first_kind_name = first_kind_name;
	}
	
}

