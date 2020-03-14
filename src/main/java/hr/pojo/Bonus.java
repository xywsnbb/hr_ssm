package hr.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
//员工奖励表
public class Bonus implements Serializable{
	private Integer bon_id;//id
	private char major_kind_id;//部门id
	private String major_kind_name;//部门名称
	private char major_id;//职位id
	private String major_name;//职位名称
	private String human_id;//人员id
	private String human_name;//人员名称
	private String bonus_item;//奖项
	private double bonus_worth;//价值
	private String bonus_degree;//奖项级别
	private String remark;//评论
	private String register;//是否登记
	private String checker;//校对人员
	private Timestamp regist_time;//登记时间
	private Timestamp check_time;//校验时间
	private Integer check_status;//校验状态
	public Integer getBon_id() {
		return bon_id;
	}
	public void setBon_id(Integer bon_id) {
		this.bon_id = bon_id;
	}
	public char getMajor_kind_id() {
		return major_kind_id;
	}
	public void setMajor_kind_id(char major_kind_id) {
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
	public String getHuman_id() {
		return human_id;
	}
	public void setHuman_id(String human_id) {
		this.human_id = human_id;
	}
	public String getHuman_name() {
		return human_name;
	}
	public void setHuman_name(String human_name) {
		this.human_name = human_name;
	}
	public String getBonus_item() {
		return bonus_item;
	}
	public void setBonus_item(String bonus_item) {
		this.bonus_item = bonus_item;
	}
	public double getBonus_worth() {
		return bonus_worth;
	}
	public void setBonus_worth(double bonus_worth) {
		this.bonus_worth = bonus_worth;
	}
	public String getBonus_degree() {
		return bonus_degree;
	}
	public void setBonus_degree(String bonus_degree) {
		this.bonus_degree = bonus_degree;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getChecker() {
		return checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}
	public Timestamp getRegist_time() {
		return regist_time;
	}
	public void setRegist_time(Timestamp regist_time) {
		this.regist_time = regist_time;
	}
	public Timestamp getCheck_time() {
		return check_time;
	}
	public void setCheck_time(Timestamp check_time) {
		this.check_time = check_time;
	}
	public Integer getCheck_status() {
		return check_status;
	}
	public void setCheck_status(Integer check_status) {
		this.check_status = check_status;
	}
	
	
}
