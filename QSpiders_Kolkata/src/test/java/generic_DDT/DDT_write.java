package generic_DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_write {
	static String path="F:\\TestData.xlsx";
	public static void ddt(String value,String sheet_name,int row,int cell)
	{
		try {
			FileInputStream fis=new FileInputStream(path);
			Workbook book=WorkbookFactory.create(fis);
			String Sheetname=book.getSheetName(cell);
			if(Sheetname==sheet_name)
			{
				Sheet existing_sheet=book.getSheet(sheet_name);
				try {
					Row r = existing_sheet.createRow(row);
					Cell c=r.createCell(cell);
					c.setCellValue(value);
					FileOutputStream fos=new FileOutputStream(path);
					book.write(fos);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
				
			}
			else
			{
				Sheet sh=book.getSheet(Sheetname);
				Row r1=sh.getRow(cell);
				Cell c1=r1.getCell(cell);
				c1.toString();
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

}
}
