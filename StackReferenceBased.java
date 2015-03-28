public class StackReferenceBased implements StackInterface{

	private Node top;

	public StackReferenceBased() {
		top = null;
	}

	public boolean isEmpty(){
		return (top ==null);
	}

	public void push(Object newItem){
		top = new Node(newItem, top);
	}

	public Object pop() throws StackException{
		if(!isEmpty()){
			Node temp = top;
			top = top.getNext();
			return temp.getItem();
		} else {
			throw new StackException("StackException on pop: Stack empty");
	}

	public void popAll(){
		top = null;
	}

	public Object peek() throws StackException{
		if(!isEmpty()) return top.getItem();
		else{
			throw new StackException("StackException on peek: Stack empty");
		}
	}

   @Override
   public String toString()
   {
	  return null;
   } // end of toString

}