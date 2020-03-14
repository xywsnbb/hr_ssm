package hr.pojo;

import java.io.Serializable;

public class EngageExamDetails implements Serializable{
	private int exd_id;		//id
	  private String exam_number;//考试编号
	  private String first_kind_id;	//一级机构id
	  private String first_kind_name;//一级机构名称
	  private String second_kind_id;	//二级机构id
	  private String second_kind_name;//二级机构名称
	  private int question_amount; 	//问题数量
	public int getExd_id() {
		return exd_id;
	}
	public void setExd_id(int exd_id) {
		this.exd_id = exd_id;
	}
	public String getExam_number() {
		return exam_number;
	}
	public void setExam_number(String exam_number) {
		this.exam_number = exam_number;
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
	public String getSecond_kind_id() {
		return second_kind_id;
	}
	public void setSecond_kind_id(String second_kind_id) {
		this.second_kind_id = second_kind_id;
	}
	public String getSecond_kind_name() {
		return second_kind_name;
	}
	public void setSecond_kind_name(String second_kind_name) {
		this.second_kind_name = second_kind_name;
	}
	public int getQuestion_amount() {
		return question_amount;
	}
	public void setQuestion_amount(int question_amount) {
		this.question_amount = question_amount;
	}
	  
}
