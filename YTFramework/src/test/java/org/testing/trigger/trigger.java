package org.testing.trigger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class trigger 
{
	public static void main(String[] args) throws BiffException, IOException 
	{
		XmlSuite xs=new XmlSuite();
		ArrayList<XmlSuite> al3=new ArrayList<XmlSuite>();
		File f=new File("C:\\Users\\Dell\\OneDrive\\Desktop\\trigger.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet(0);
		int rows=s.getRows();
		ArrayList<XmlClass> al1=new ArrayList<XmlClass>();
		for(int i=0;i<rows;i++)
		{
			Cell c=s.getCell(4, i);
			if(c.getContents().equals("y"))
			{
				Cell pkg=s.getCell(2, i);
				Cell class_name=s.getCell(3, i);
				String m=pkg.getContents()+"."+class_name.getContents();
				XmlClass xc=new XmlClass(m);
				al1.add(xc);
			}
		}
		XmlTest xt=new XmlTest(xs);
		xt.setClasses(al1);
		ArrayList<XmlTest> al2=new ArrayList<XmlTest>();
		al2.add(xt);
		
		xs.setTests(al2);
		
		al3.add(xs);
		TestNG t=new TestNG();
		t.setXmlSuites(al3);
		t.run();
	}
}
