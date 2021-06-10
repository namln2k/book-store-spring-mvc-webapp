package book_shop.entity;

public class Slide {
	private int id;
	private String img;
	private String caption;
	private String content;
	
	public Slide(int id, String img, String caption, String content) {
		super();
		this.id = id;
		this.img = img;
		this.caption = caption;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Slide() {
		super();
		// TODO Auto-generated constructor stub
	}
}
