/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlosmartinez
 */
import java.util.ArrayList;

public class StackArrayList <E> implements Stack <E> {

protected ArrayList<E> data;
public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

@Override
	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

@Override
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

@Override
	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
@Override
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
@Override
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
    
    
}
