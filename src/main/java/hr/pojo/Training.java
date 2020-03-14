package hr.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
//培训信息表
public class Training implements Serializable{
	private Integer tra_id;//id
	private char major_kind_id;//部门id
	private String major_kind_name;//部门名称
	private char major_id;//职位id
	private String major_name;//职位名称
	private String human_id;//人员id
	private String human_name;//人员名称
	private String training_item;//培训项目
	private Timestamp training_time;//培训开始时间
	private Integer training_hour;//培训时长
	private String training_degree;//培训程度
	private String register;//登记人
	private String checker;//审核人
	private Timestamp regist_time;//登记时间
	private Timestamp check_time;//审核时间
	private Integer checkstatus;//审核状态
	private String remark;//评论
	
	
	public Timestamp getTraining_time() {
		return training_time;
	}
	public void setTraining_time(Timestamp training_time) {
		this.training_time = training_time;
	}
	public Integer getTraining_hour() {
		return training_hour;
	}
	public void setTraining_hour(Integer training_hour) {
		this.training_hour = training_hour;
	}
	public String getTraining_degree() {
		return training_degree;
	}
	public void setTraining_degree(String training_degree) {
		this.training_degree = training_degree;
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
	public Integer getCheckstatus() {
		return checkstatus;
	}
	public void setCheckstatus(Integer checkstatus) {
		this.checkstatus = checkstatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getTra_id() {
		return tra_id;
	}
	public void setTra_id(Integer tra_id) {
		this.tra_id = tra_id;
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
	public String getTraining_item() {
		return training_item;
	}
	public void setTraining_item(String training_item) {
		this.training_item = training_item;
	}
	
}
