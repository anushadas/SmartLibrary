

public class Book implements Comparable<Book>{

	private int bid;
	private int isbn;
	private String btitle;
	private String author;
	private String yop;
	private String sub;
	private String desc;
	private int flag=0;
	
	public Book(int id, int isbn, String title, String author, String sub , String yop , String desc) {
		this.setBid(id) ;
		this.setIsbn(isbn);
		this.setBtitle(title);
		this.setAuthor(author);
		this.setSub(sub);
		this.setYop(yop);
		this.setDesc(desc);
		
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getYop() {
		return yop;
	}

	public void setYop(String yop) {
		this.yop = yop;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	@Override
	public int compareTo(Book o) {
		if(flag==0)//id
		{Integer a = new Integer(this.bid); 
        Integer b = new Integer(o.bid);
			return a.compareTo(b);}
		else if(flag==1)//title
			return this.btitle.compareTo(o.btitle);
		else if(flag==2)//author
			return this.author.compareTo(o.author);
		return -1;
		
	}

	
	public String toString(){
		return this.getBid() +","+this.getIsbn()+","+ this.getBtitle()+ "," + this.getAuthor()+","+this.getSub()+","+this.yop+","+this.getDesc()+"\r\n";
	}
}
