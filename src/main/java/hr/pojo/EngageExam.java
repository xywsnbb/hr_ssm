package hr.pojo;

import java.sql.Timestamp;

public class EngageExam {
	  private int exa_id;          //id
	  private String exam_number;  //考试编号
	  private String major_kind_id;	//部门id
	  private String major_kind_name;//部门名称
	  private String major_id;			//职位id
	  private String major_name;//职位名称
	  private String register;		//登记/意见
	  private Timestamp regist_time;//登记时间
	  private int limite_time;		//上限时间
	public int getExa_id() {
		return exa_id;
	}
	public void setExa_id(int exa_id) {
		this.exa_id = exa_id;
	}
	public String getExam_number() {
		return exam_number;
	}
	public void setExam_number(String exam_number) {
		this.exam_number = exam_number;
	}
	public String getMajor_kind_id() {
		return major_kind_id;
	}
	public void setMajor_kind_id(String major_kind_id) {
		this.major_kind_id = major_kind_id;
	}
	public String getMajor_kind_name() {
		return major_kind_name;
	}
	public void setMajor_kind_name(String major_kind_name) {
		this.major_kind_name = major_kind_name;
	}
	public String getMajor_id() {
		return major_id;
	}
	public void setMajor_id(String major_id) {
		this.major_id = major_id;
	}
	public String getMajor_name() {
		return major_name;
	}
	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public Timestamp getRegist_time() {
		return regist_time;
	}
	public void setRegist_time(Timestamp regist_time) {
		this.regist_time = regist_time;
	}
	public int getLimite_time() {
		return limite_time;
	}
	public void setLimite_time(int limite_time) {
		this.limite_time = limite_time;
	}
	  
}
