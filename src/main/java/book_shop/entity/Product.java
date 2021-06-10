package book_shop.entity;

import java.sql.Date;

public class Product {
	private int id;
	private int id_category;
	private String author;
	private String name;
	private double price;
	private int sale;
	private String title;
	private int highlight;
	private int is_new_product;
	private String detail;
	private Date created_at;
	private Date updated_at;
	
	public Product(int id, int id_category, String author, String name, double price, int sale, String title,
			int highlight, int is_new_product, String detail, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.id_category = id_category;
		this.author = author;
		this.name = name;
		this.price = price;
		this.sale = sale;
		this.title = title;
		this.highlight = highlight;
		this.is_new_product = is_new_product;
		this.detail = detail;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_category() {
		return id_category;
	}
	public void setId_category(int id_category) {
		this.id_category = id_category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHighlight() {
		return highlight;
	}
	public void setHighlight(int highlight) {
		this.highlight = highlight;
	}
	public int getIs_new_product() {
		return is_new_product;
	}
	public void setIs_new_product(int is_new_product) {
		this.is_new_product = is_new_product;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
