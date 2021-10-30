package maven.pack;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class MavenClass 
{
	XSSFSheet sh;
public MavenClass() throws IOException
{
	FileInputStream f=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\My_Maven\\src\\main\\resources\\New Microsoft Excel Worksheet.xlsx");
	XSSFWorkbook w=new XSSFWorkbook(f);
	sh=w.getSheet("sheet1");	
}
public String readData(int i,int j)
{
	Row r=sh.getRow(i);
	Cell c=r.getCell(j);
	int cellType=c.getCellType();
	switch(cellType)
	{
	case Cell.CELL_TYPE_NUMERIC:
		double number=c.getNumericCellValue();
		return String.valueOf(number);
			
	case Cell.CELL_TYPE_STRING :
		String data=c.getStringCellValue();
		return data;
	default :
		return null;
	}
}
public void read()
{
	for(Row r : sh)
	{
		for(Cell c : r)
		{
			System.out.print(c+" ");
		}
		System.out.println();
	}
	}
}
