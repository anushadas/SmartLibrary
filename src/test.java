import java.io.IOException;
import java.sql.Date;

public class test {

	public static void main(String[] args) throws IOException {
		DataReader d = new DataReader();
		
		d.readStudents();
		d.readBooks();
		for(int i = 0 ; i < DataReader.sList.size(); i++){
			String  t =((Student) DataReader.sList.get(i)).toString();
			System.out.println(t);
			
		}
		
		
		DataReader.quicksort( DataReader.sList ,  0, DataReader.sList.size()-1);
		DataReader.quicksort( DataReader.sList ,  0, DataReader.sList.size()-1);
		System.out.println("After Sorting     ______________________________________");
		
		for(int i = 0 ; i < DataReader.sList.size(); i++){
			String  t =((Student) DataReader.sList.get(i)).toString();
			System.out.println(t);
		}
		
//		DataReader.quicksort(DataReader.bList , 0 , DataReader.bList.size()-1);
//		for(int i = 0 ; i < DataReader.bList.size(); i++){
//			String  t =((Book) DataReader.bList.get(i)).toString();
//			System.out.println(t);
//			
//		}
		
		
		System.out.println("Search test ---------------------------------------");
		//Student st  = new Student(22,"","",0,"","",0);
		//System.out.println(DataReader.sList.get(DataReader.binarySearch(DataReader.sList, st)).toString());
		int id=14,flag=0;
		Book sBook =new Book(id,0,"","","","","");
		sBook.setFlag(flag);
		for(int i=0;i<DataReader.bList.size();i++)
		{
			DataReader.bList.get(i).setFlag(flag);
		}
		if(DataReader.binarySearch(DataReader.bList, sBook)==-1)
				System.out.println("not found");
		else
		 System.out.println(DataReader.bList.get(DataReader.binarySearch(DataReader.bList, sBook)).toString());
		
		/*
		
		
		LinkedList<Book> searchList=new LinkedList<Book>();
		searchList.add(DataReader.bList.get(i2));*/
	}


	

}
