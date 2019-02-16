import java.io.*;
public class DataReader {
	
	
	public static LinkedList<Student> sList = new LinkedList<Student>();
	public static LinkedList<Book> bList = new LinkedList<Book>();
	public static LinkedList<Reservation> rList = new LinkedList<Reservation>();
	
	
	public static void readStudents() throws IOException
	{
		File file = new File(System.getProperty("user.dir")+"\\student.txt"); 
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  String st; 
		  while ((st = br.readLine()) != null) 
		  {
		    String[] s=st.split(",");
		    sList.add(new Student(Integer.parseInt(s[0]),s[1],s[2],Integer.parseInt(s[3]),s[4],s[5],Double.parseDouble(s[6])));
		  } 
		  br.close();
	}
	
	public static  void readBooks() throws IOException
	{
		bList.clear();
		 File file = new File(System.getProperty("user.dir")+"\\book.txt"); 
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  String st; 
		  while ((st = br.readLine()) != null) 
		  {
		    String[] s=st.split(",");
		   bList.add(new Book(Integer.parseInt(s[0]),Integer.parseInt(s[1]),s[2],s[3],s[4],(s[5]),s[6]));
		  } 
		  br.close();
	}
	
	public static void  writeBooks() throws IOException
	{
		File file = new File(System.getProperty("user.dir")+"\\book.txt"); 
		
		BufferedWriter br2 = new BufferedWriter(new FileWriter(file, true));
		for(int i = 0 ; i < DataReader.bList.size(); i++){
			String  t =((Book) DataReader.bList.get(i)).toString();
			br2.write(t);
		}
		br2.flush();
		br2.close();
	}
	
	public void  writeResv() throws IOException
	{
		File file = new File(System.getProperty("user.dir")+"\\res.txt"); 
		BufferedWriter br = new BufferedWriter(new FileWriter(file, true));
		for(int i = 0 ; i < DataReader.rList.size(); i++){
			String  t =((Reservation) DataReader.rList.get(i)).toString();
			br.write(t);
		}
		br.flush();
		br.close();
	}
	
	
	public static void readRes() throws IOException
	{
	  File file = new File(System.getProperty("user.dir")+"\\res.txt"); 
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  String st; 
	  while ((st = br.readLine()) != null) 
	  {
	    String[] s=st.split(",");
	    rList.add(new Reservation(Integer.parseInt(s[0]),Integer.parseInt(s[1]),s[2],new Boolean(false)));
	  } 
	  br.close();
	  
}
	
public static <T extends Comparable<T>> void quicksort(LinkedList<T> arr, int a, int b) {
		
        if (a < b) {
            int i = a, j = b;
            T x =  (T) arr.get((a+b)/ 2);

            while (i <= j) {
                while (arr.get(i).compareTo(x) < 0) i++;
                while (x.compareTo(arr.get(j)) < 0) j--;

                if ( i <= j) {
                    T tmp = arr.get(i);
                    arr.set(i,arr.get(j));
                   
                    arr.set(j,tmp);
                    i++;
                    j--;
                }
            } ;
            quicksort(arr, a, j);
            quicksort(arr, i, b);
        }

	}

public static <T extends Comparable<T>> int binarySearch(LinkedList<T> arr, T val){
	
		int middle,pos;     
		boolean found;   
		int f = 0;
		int  l = arr.size() - 1;
		pos = -1;
		found = false;
		while (!found && f <= l){
			middle = (f + l) / 2;
			if (arr.get(middle).compareTo(val)==0){
				found = true;
				pos = middle;
			}
			else if (arr.get(middle).compareTo(val)> 0) l = middle - 1;
      else
         f = middle + 1;
   }
   return pos;
}


}
