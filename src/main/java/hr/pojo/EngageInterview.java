package hr.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class EngageInterview implements Serializable{
	 private int ein_id;			//id
	  private String human_name; 		 //应聘人员名字
	  private int interview_amount;	//面试数量
	  private String human_major_kind_id;	//human职位id
	  private String human_major_kind_name;//human职位名称
	  private String human_major_id;		//human部门id
	  private String human_major_name;//human部门名称
	  private String image_degree;		//照片
	  private String native_language_degree; //母语水平
	  private String foreign_language_degree;//外语水平
	  private String response_speed_degree; //应变能力
	  private String EQ_degree;				 //情商
	  private String IQ_degree;			//智商
	  private String multi_quality_degree;	//
	  private String register;				//意见/登记
	  private String checker;				//审核
	  private Timestamp registe_time;							//登记时间
	  private Timestamp check_time; //审核时间
	  private int resume_id;				//简历id
	  private String result;					//结果
	  private String interview_comment;					//面试评论
	  private String check_comment;						//校验评论
	  private int interview_status;			//面试状态(已面，未面)
	  private int check_status;				//检验状态
	public int getEin_id() {
		return ein_id;
	}
	public void setEin_id(int ein_id) {
		this.ein_id = ein_id;
	}
	public String getHuman_name() {
		return human_name;
	}
	public void setHuman_name(String human_name) {
		this.human_name = human_name;
	}
	public int getInterview_amount() {
		return interview_amount;
	}
	public void setInterview_amount(int interview_amount) {
		this.interview_amount = interview_amount;
	}
	public String getHuman_major_kind_id() {
		return human_major_kind_id;
	}
	public void setHuman_major_kind_id(String human_major_kind_id) {
		this.human_major_kind_id = human_major_kind_id;
	}
	public String getHuman_major_kind_name() {
		return human_major_kind_name;
	}
	public void setHuman_major_kind_name(String human_major_kind_name) {
		this.human_major_kind_name = human_major_kind_name;
	}
	public String getHuman_major_id() {
		return human_major_id;
	}
	public void setHuman_major_id(String human_major_id) {
		this.human_major_id = human_major_id;
	}
	public String getHuman_major_name() {
		return human_major_name;
	}
	public void setHuman_major_name(String human_major_name) {
		this.human_major_name = human_major_name;
	}
	public String getImage_degree() {
		return image_degree;
	}
	public void setImage_degree(String image_degree) {
		this.image_degree = image_degree;
	}
	public String getNative_language_degree() {
		return native_language_degree;
	}
	public void setNative_language_degree(String native_language_degree) {
		this.native_language_degree = native_language_degree;
	}
	public String getForeign_language_degree() {
		return foreign_language_degree;
	}
	public void setForeign_language_degree(String foreign_language_degree) {
		this.foreign_language_degree = foreign_language_degree;
	}
	public String getResponse_speed_degree() {
		return response_speed_degree;
	}
	public void setResponse_speed_degree(String response_speed_degree) {
		this.response_speed_degree = response_speed_degree;
	}
	public String getEQ_degree() {
		return EQ_degree;
	}
	public void setEQ_degree(String eQ_degree) {
		EQ_degree = eQ_degree;
	}
	public String getIQ_degree() {
		return IQ_degree;
	}
	public void setIQ_degree(String iQ_degree) {
		IQ_degree = iQ_degree;
	}
	public String getMulti_quality_degree() {
		return multi_quality_degree;
	}
	public void setMulti_quality_degree(String multi_quality_degree) {
		this.multi_quality_degree = multi_quality_degree;
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
	public Timestamp getRegiste_time() {
		return registe_time;
	}
	public void setRegiste_time(Timestamp registe_time) {
		this.registe_time = registe_time;
	}
	public Timestamp getCheck_time() {
		return check_time;
	}
	public void setCheck_time(Timestamp check_time) {
		this.check_time = check_time;
	}
	public int getResume_id() {
		return resume_id;
	}
	public void setResume_id(int resume_id) {
		this.resume_id = resume_id;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getInterview_comment() {
		return interview_comment;
	}
	public void setInterview_comment(String interview_comment) {
		this.interview_comment = interview_comment;
	}
	public String getCheck_comment() {
		return check_comment;
	}
	public void setCheck_comment(String check_comment) {
		this.check_comment = check_comment;
	}
	public int getInterview_status() {
		return interview_status;
	}
	public void setInterview_status(int interview_status) {
		this.interview_status = interview_status;
	}
	public int getCheck_status() {
		return check_status;
	}
	public void setCheck_status(int check_status) {
		this.check_status = check_status;
	}
	  
}
