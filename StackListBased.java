public class StackListBased implements StackInterface{
	private ListInterface list;

	public StackListBased(){
		list = new ListReferenceBased();
	}

	public boolean isEmpty(){
		return list.isEmpty();
	}

	public void push(Object newItem){
		list.add(0, newItem);
	}

	public Object pop() throws StackException{
		if(!list.isEmpty()){
			Object temp = list.get(0);
			list.remove(0);
			return temp;
		} else {
			throw new StackException("StackException on pop: Stack Empty");
		}
	}

	public void popAll(){
		list.removeAll();
	}

	public Object peek() throws StackException{
		if(!isEmpty()) return list.get(0);
		else {
			throw new StackException("StackException on peek: Stack empty");
		}
	}

   @Override
   public String toString()
   {
 	  return null;
   } // end of toString

}