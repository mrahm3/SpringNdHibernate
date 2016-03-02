package com.training.tags;

import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class ForEachTag extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Object> list;
	
	public ForEachTag() {
		super();	
	}
		
	public void setList(ArrayList<Object> list) {
		this.list = list;
	}



	@Override
	public int doStartTag() throws JspException {
		try {
			JspWriter out=pageContext.getOut();
			
			if(list==null)
				out.println("Nothing for printing");
			else
			{
				for(Object obj:list)
				{
					out.println(obj);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Tag.SKIP_BODY;
	}
	
	
	
	
}
