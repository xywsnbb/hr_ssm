package hr.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class EngageSubjects implements Serializable{
	private int sub_id;  		//id
	private String first_kind_id;		//一级种类id
	private String first_kind_name;//一级种类名称
	private String second_kind_id;		//二级种类id
	private String second_kind_name;//二级种类名称
	private String register;		//登录人员
	private Timestamp regist_time;					//登录时间
	private String derivation;		//来源
	private String content;						//内容
	private String key_a;				//a
	private String key_b;						//b
	private String key_c;						//c
	private String key_d;					//d
	private String key_e;						//e
	private String correct_key; //正确的答案
	private String changer;		//修改人
	private Timestamp change_time;//修改时间
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
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
	public String getDerivation() {
		return derivation;
	}
	public void setDerivation(String derivation) {
		this.derivation = derivation;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getKey_a() {
		return key_a;
	}
	public void setKey_a(String key_a) {
		this.key_a = key_a;
	}
	public String getKey_b() {
		return key_b;
	}
	public void setKey_b(String key_b) {
		this.key_b = key_b;
	}
	public String getKey_c() {
		return key_c;
	}
	public void setKey_c(String key_c) {
		this.key_c = key_c;
	}
	public String getKey_d() {
		return key_d;
	}
	public void setKey_d(String key_d) {
		this.key_d = key_d;
	}
	public String getKey_e() {
		return key_e;
	}
	public void setKey_e(String key_e) {
		this.key_e = key_e;
	}
	public String getCorrect_key() {
		return correct_key;
	}
	public void setCorrect_key(String correct_key) {
		this.correct_key = correct_key;
	}
	public String getChanger() {
		return changer;
	}
	public void setChanger(String changer) {
		this.changer = changer;
	}
	public Timestamp getChange_time() {
		return change_time;
	}
	public void setChange_time(Timestamp change_time) {
		this.change_time = change_time;
	}
}
