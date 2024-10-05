package generic_DDT;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_read {

	static String value=null;
	static String path="F:\\TestData.xlsx";
	public static String ddt(String sheet,int row,int cell)
	{
		try {
			FileInputStream fis=new FileInputStream(path);
			Workbook book=WorkbookFactory.create(fis);
			value=book.getSheet(sheet).getRow(row).getCell(cell).toString();
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		}
		return value;
		
	}
}
