package hr.pojo;

import java.io.Serializable;
//薪资标准详情
public class Salary_standard_details implements Serializable{
	private Integer sdt_id;//id
	private String standard_id;//薪资详情id
	private String standard_name;//薪资详情名称
	private Integer item_id;//项目id
	private String item_name;//项目名称
	private double salary;//薪资
	public Integer getSdt_id() {
		return sdt_id;
	}
	public void setSdt_id(Integer sdt_id) {
		this.sdt_id = sdt_id;
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
	public Integer getItem_id() {
		return item_id;
	}
	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
