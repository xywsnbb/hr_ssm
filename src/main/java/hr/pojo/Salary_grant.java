package hr.pojo;

import java.io.Serializable;
//薪资补助金表
import java.sql.Timestamp;
public class Salary_grant implements Serializable{
	private Integer sgr_id;//id
	private String salary_grant_id;//薪资补助id
	private String salary_standard_id;//薪资标准id
	private char first_kind_id;//一级机构种类id
	private String first_kind_name;//一级机构种类名称
	private char second_kind_id;//二级机构种类id
	private String second_kind_name;//二级机构种类名称
	private char third_kind_id;//三级机构种类id
	private String third_kind_name;//三级机构种类名称
	private Integer human_amount;//人员数量
	private Double salary_standard_sum;//标准薪资总额
	private Double salary_paid_sum;//已付工资总额
	private String register;//登记人
	private String checker;//审核人
	private Integer check_status;//审核状态
	private Timestamp regist_time    ;//登记时间
	private Timestamp check_time    ;//审核状态
	public Integer getSgr_id() {
		return sgr_id;
	}
	public void setSgr_id(Integer sgr_id) {
		this.sgr_id = sgr_id;
	}
	public String getSalary_grant_id() {
		return salary_grant_id;
	}
	public void setSalary_grant_id(String salary_grant_id) {
		this.salary_grant_id = salary_grant_id;
	}
	public String getSalary_standard_id() {
		return salary_standard_id;
	}
	public void setSalary_standard_id(String salary_standard_id) {
		this.salary_standard_id = salary_standard_id;
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
	public char getSecond_kind_id() {
		return second_kind_id;
	}
	public void setSecond_kind_id(char second_kind_id) {
		this.second_kind_id = second_kind_id;
	}
	public String getSecond_kind_name() {
		return second_kind_name;
	}
	public void setSecond_kind_name(String second_kind_name) {
		this.second_kind_name = second_kind_name;
	}
	public char getThird_kind_id() {
		return third_kind_id;
	}
	public void setThird_kind_id(char third_kind_id) {
		this.third_kind_id = third_kind_id;
	}
	public String getThird_kind_name() {
		return third_kind_name;
	}
	public void setThird_kind_name(String third_kind_name) {
		this.third_kind_name = third_kind_name;
	}
	public Integer getHuman_amount() {
		return human_amount;
	}
	public void setHuman_amount(Integer human_amount) {
		this.human_amount = human_amount;
	}
	public Double getSalary_standard_sum() {
		return salary_standard_sum;
	}
	public void setSalary_standard_sum(Double salary_standard_sum) {
		this.salary_standard_sum = salary_standard_sum;
	}
	public Double getSalary_paid_sum() {
		return salary_paid_sum;
	}
	public void setSalary_paid_sum(Double salary_paid_sum) {
		this.salary_paid_sum = salary_paid_sum;
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
	public Integer getCheck_status() {
		return check_status;
	}
	public void setCheck_status(Integer check_status) {
		this.check_status = check_status;
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
	
	
	
	
}
