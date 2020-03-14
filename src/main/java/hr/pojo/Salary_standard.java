package hr.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
//工资标准表
public class Salary_standard implements Serializable{
	private Integer ssd_id;//id
	private String standard_id;//薪资标准id
	private String standard_name;//薪资标准名称
	private String designer;//设计师
	private String register;//登记人
	private String checker;//审核人
	private String changer;//修改人
	private Timestamp regist_time;//登记时间
	private Timestamp check_time;//审核时间
	private Timestamp change_time;//修改时间
	private double salary_sum;//薪资总额
	private Integer check_status;//审核状态
	private Integer change_status;//修改状态
	private String check_comment;//审核评论
	private String remark;//评论
	public Integer getSsd_id() {
		return ssd_id;
	}
	public void setSsd_id(Integer ssd_id) {
		this.ssd_id = ssd_id;
	}
	public String getStandard_id() {
		return standard_id;
	}
	public void setStandard_id(String standard_id) {
		this.standard_id = standard_id;
	}
	public String getStandard_name() {
		return standard_name;
	}
	public void setStandard_name(String standard_name) {
		this.standard_name = standard_name;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
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
	public Timestamp getCheck_time() {
		return check_time;
	}
	public void setCheck_time(Timestamp check_time) {
		this.check_time = check_time;
	}
	public Timestamp getChange_time() {
		return change_time;
	}
	public void setChange_time(Timestamp change_time) {
		this.change_time = change_time;
	}
	public double getSalary_sum() {
		return salary_sum;
	}
	public void setSalary_sum(double salary_sum) {
		this.salary_sum = salary_sum;
	}
	public Integer getCheck_status() {
		return check_status;
	}
	public void setCheck_status(Integer check_status) {
		this.check_status = check_status;
	}
	public Integer getChange_status() {
		return change_status;
	}
	public void setChange_status(Integer change_status) {
		this.change_status = change_status;
	}
	public String getCheck_comment() {
		return check_comment;
	}
	public void setCheck_comment(String check_comment) {
		this.check_comment = check_comment;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
