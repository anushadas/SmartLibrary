//import java.util.ArrayList;
//import java.util.List;

public class LinkedList<E> 
{
    
    int size = 0;
    Node<E> head;
    Node<E> tail;
    Node<E>ref;
    public LinkedList(){
        head = new Node<E>(null,null,null);
        tail = new Node<E>(null,null,head);
        head.next = tail;
    }

    public void add(E value){

        Node<E> temp = new Node<E>(value,tail,tail.previous);
        tail.previous = temp;
        temp.previous.next = temp;
        size++;

    }

    public E get(int index){
     setRef(index);
     return ref.value;
    }

    public E set(int index, E value){
        setRef(index);
        E result = ref.value;
        ref.value = value;
        return result;
    }

    public void add(int index, E value) {
       setRef(index);
      Node<E> temp = new Node<E>(value,ref,ref.previous);
      temp.previous.next = temp;
      ref.previous = temp;
      size++;
    }


    public int size(){
        return size;
    }

    public E remove(int index){
      setRef(index);
        E result = ref.next.value;
        ref.previous.next = ref.next;
        ref.next.previous = ref.previous;
        size --;
        return result;
    }

    public void clear(){
       size = 0;
       head.next = tail;
       tail.previous = head;
       ref = null;

    }

   
    public boolean isEmpty(){
        if(size == 0 ){
            return true;
        }
        else{
            return false;
        }
    }

    private void setRef(int index){
    	if(index>=0)
    	{
    		ref = head.next;
    		for(int i = 0; i < index; i++){
    		    ref = ref.next;
    		    }
    	}
    	else
    		ref=new Node<E>(null,null,null);
    

    }

   
    public int indexOf(Object obj) {

         int index = 0;
        Node<E> current = head.next;
        while (current != null) {
            if (current.equals( obj)) {
                return index;
            }

            index++;
            current = current.next;
        }
        if(index == size && obj == null){
            return -1;
        }
        else{
            return index;
        }
    }

    
    public boolean contains(Object obj){
        boolean isTrue;
        if(!(this.indexOf(obj) == -1)){
            isTrue = true;
        }
        else{
            isTrue = false;
        }
        return isTrue;

    }

    public String toString() {
        String result = "[";
        Node<E> current = head;
        while(current.next != null){

            current = current.next;
            result += current.value + ", ";

        }
        return   result += "]";
    }
//
//    public ArrayList<E> getelements(){
//    		ArrayList<E> temp= new ArrayList<E>();
//    	Node<E> current = head.next;
//        while (current != null) {
//           
//
//          temp.add(current.value);
//            current = current.next;
//            
//        }
//        return temp;
//    	
//    }
    
    
    public class Node<E> 
    {
        E value;
        Node<E> next;
        Node<E> previous;
        Node(E tempValue, Node<E> tempNext, Node<E> tempPrev){
        this.value = tempValue;
        this.next = tempNext;
        this.previous = tempPrev;
        }


    }
    










        





}