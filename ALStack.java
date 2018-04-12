import java.util.ArrayList;
public class ALStack<PANCAKE> implements Stack<PANCAKE>
{
    private ArrayList<PANCAKE> list;
    public ALStack()
    {
	list = new ArrayList<PANCAKE>();
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
	list.add(x);
    }	
}
