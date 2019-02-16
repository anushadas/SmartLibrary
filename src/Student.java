

public class Student implements Comparable<Student> {

	private int sid;
	private String fname;
	private String lname;
	private int age;
	private String cell;
	private String email;
	private double fine;
	
	public Student(int id , String fname, String lname , int age ,String cell , String email,double fine)  {
		
		this.setSid(id);
		this.setFname(fname);
		this.setLname(lname);
		this.setAge(age); 
		this.setCell(cell);
		this.setEmail(email);
		fine = 0;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		Integer a = new Integer(this.sid); 
        Integer b = new Integer(o.sid);
		return a.compareTo(b);
		
	}
	
	public String toString(){
		return this.getSid()+" "+ this.getFname();
	}
	
	
	
	
}
