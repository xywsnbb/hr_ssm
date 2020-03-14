package hr.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
//职位缺省信息表 
public class Engage_major_release implements Serializable{
	private Integer mre_id;//id
	private char first_kind_id;//一级种类id
	private String first_kind_name;//一级种类名称
	private Integer second_kind_id;//二级种类id
	private String second_kind_name;//二级种类名称
	private Integer third_kind_id;//三级种类id
	private String third_kind_name;//三级种类名称
	private Integer major_kind_id;//部门id
	private String major_kind_name;//部门名称
	private char major_id;//职位id
	private String major_name;//职位名称
	private Integer human_amount;//需要职工数
	private String engage_type;//应聘类型
	private Timestamp deadline;//截止时间
	private String register;//登陆
	private String changer;//改变
	private Timestamp regist_time;//登录时间
	private Timestamp change_time;//改变时间
	private String major_describe;//主要描述
	private String engage_required;//招聘需求
	public Integer getMre_id() {
		return mre_id;
	}
	public void setMre_id(Integer mre_id) {
		this.mre_id = mre_id;
	}
	public char getFirst_kind_id() {
		return first_kind_id;
	}
	public void setFirst_kind_id(char first_kind_id) {
		this.first_kind_id = first_kind_id;
	}
	public String getFirst_kind_name() {
		return first_kind_name;
	}
	public void setFirst_kind_name(String first_kind_name) {
		this.first_kind_name = first_kind_name;
	}
	public Integer getSecond_kind_id() {
		return second_kind_id;
	}
	public void setSecond_kind_id(Integer second_kind_id) {
		this.second_kind_id = second_kind_id;
	}
	public String getSecond_kind_name() {
		return second_kind_name;
	}
	public void setSecond_kind_name(String second_kind_name) {
		this.second_kind_name = second_kind_name;
	}
	public Integer getThird_kind_id() {
		return third_kind_id;
	}
	public void setThird_kind_id(Integer third_kind_id) {
		this.third_kind_id = third_kind_id;
	}
	public String getThird_kind_name() {
		return third_kind_name;
	}
	public void setThird_kind_name(String third_kind_name) {
		this.third_kind_name = third_kind_name;
	}
	public Integer getMajor_kind_id() {
		return major_kind_id;
	}
	public void setMajor_kind_id(Integer major_kind_id) {
		this.major_kind_id = major_kind_id;
	}
	public String getMajor_kind_name() {
		return major_kind_name;
	}
	public void setMajor_kind_name(String major_kind_name) {
		this.major_kind_name = major_kind_name;
	}
	public char getMajor_id() {
		return major_id;
	}
	public void setMajor_id(char major_id) {
		this.major_id = major_id;
	}
	public String getMajor_name() {
		return major_name;
	}
	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}
	public Integer getHuman_amount() {
		return human_amount;
	}
	public void setHuman_amount(Integer human_amount) {
		this.human_amount = human_amount;
	}
	public String getEngage_type() {
		return engage_type;
	}
	public void setEngage_type(String engage_type) {
		this.engage_type = engage_type;
	}
	public Timestamp getDeadline() {
		return deadline;
	}
	public void setDeadline(Timestamp deadline) {
		this.deadline = deadline;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getChanger() {
		return changer;
	}
	public void setChanger(String changer) {
		this.changer = changer;
	}
	public Timestamp getRegist_time() {
		return regist_time;
	}
	public void setRegist_time(Timestamp regist_time) {
		this.regist_time = regist_time;
	}
	public Timestamp getChange_time() {
		return change_time;
	}
	public void setChange_time(Timestamp change_time) {
		this.change_time = change_time;
	}
	public String getMajor_describe() {
		return major_describe;
	}
	public void setMajor_describe(String major_describe) {
		this.major_describe = major_describe;
	}
	public String getEngage_required() {
		return engage_required;
	}
	public void setEngage_required(String engage_required) {
		this.engage_required = engage_required;
	}
	
	
	
}
