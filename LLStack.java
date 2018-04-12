//John Liu
//APCS2 pd8
//HW #32: Leon Leonwood Stack
//2018-04-12
import java.util.LinkedList;
public class LLStack <PANCAKE> implements Stack<PANCAKE>
{
    private LinkedList<PANCAKE> list;
    public LLStack()
    {
	list = new LinkedList<PANCAKE>();
    }

    public boolean isEmpty()
    {
	return list.size()==0;
    }

    public PANCAKE peek()
    {
	if(isEmpty()){
	    return null;
	}
	return (PANCAKE)list.get(list.size()-1);
    }

    public PANCAKE pop(){
	if(isEmpty()){
	    return null;
	}
	return (PANCAKE)list.remove(list.size()-1);
    }

    public void	push( PANCAKE x )
    {
	list.addLast(x);
    }	
}
