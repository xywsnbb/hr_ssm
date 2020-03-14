package hr.pojo;

import java.io.Serializable;

public class EngageAnswerDetails implements Serializable{
	
	private int and_id;
	private String answer_number;
	private int subject_id;
	private String answer;
	public int getAnd_id() {
		return and_id;
	}
	public void setAnd_id(int and_id) {
		this.and_id = and_id;
	}
	public String getAnswer_number() {
		return answer_number;
	}
	public void setAnswer_number(String answer_number) {
		this.answer_number = answer_number;
	}
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
