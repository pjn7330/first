package test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JEditorPane;

import org.apache.commons.io.FileUtils;

public class Vlookup {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JEditorPane editorPane = new JEditorPane();
		editorPane.setPage(new URL("http://www.google.com"));
		//List<String> list = new ArrayList<String>();
		List<String> namelist = FileUtils.readLines(new File("studentnames.txt"));	
		 System.out.println("");
		 
		 
		};
		
		String B1[] = {
						
		};
		
		String C1[] = {
				"mkn2952"
				,"nbm0615"
				,"pand02"
				,"vmn2950"
				,"abn8414"
				,"adm1138"
				,"agn9555"
				,"ain7513"
				,"ann3454"
					
		};
		
		String D1[]={
				
				"11th ",
				"11th ",
				"11th ",
				"11th ",
				"10th ",
				"10th ",
				"10th ",
				"10th ",
				"10th ",
					
		};
		
		

		for (int i =0; i <9; i++)
		{
			for (int j = 0; j<20; j++)
			{
			
			if(C1[i]==A1[j])
			{
				System.out.println("The user "+ C1[i]+"  wrong password is "+ D1[i] + " as per documentum  and " + B1[i] + " as per AD" );
				break;
			}
			}
		}
		
		
	}

}
