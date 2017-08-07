package cn.shuoshuge.entity;

public class Book {
	
	private Integer id;
	private String b_name;
	private String b_author;
	private String b_press;
	private Integer b_total;
	private Integer b_current_num;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_author() {
		return b_author;
	}
	public void setB_author(String b_author) {
		this.b_author = b_author;
	}
	public String getB_press() {
		return b_press;
	}
	public void setB_press(String b_press) {
		this.b_press = b_press;
	}
	public Integer getB_total() {
		return b_total;
	}
	public void setB_total(Integer b_total) {
		this.b_total = b_total;
	}
	public Integer getB_current_num() {
		return b_current_num;
	}
	public void setB_current_num(Integer b_current_num) {
		this.b_current_num = b_current_num;
	}
	
	

}
