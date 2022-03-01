package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;


public class ExcelUtils {
	
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path=null;
	String sheetName=null;
	
	public ExcelUtils(String path,String sheetName) throws IOException{
		
			try {
				fi=new FileInputStream(path);
				workbook=new XSSFWorkbook(fi);
				sheet=workbook.getSheet(sheetName);
				
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
		}
	
	
	public int getRowCount() throws IOException{
		
		int rowCount=sheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowCount;
	}
	
	public int getCellCount(int rowNum) throws IOException{
		
		row=sheet.getRow(rowNum);
		int cellCount=row.getLastCellNum();
		workbook.close();
		fi.close();
		return cellCount;
	}
	
	public String getCellData(int rowNum,int colNum) throws IOException{
		
		
		DataFormatter formatter = new DataFormatter();
		String value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
	//	System.out.println(value);
		return value;

		//workbook.close();
	//	fi.close();
	//	return data;
	
	}
	
	public void setCellData(int rowNum,int colNum,String data) throws IOException{
		
		
		cell=row.createCell(colNum);
		cell.setCellValue(data);
		
		fo=new FileOutputStream(path);
		workbook.write(fo);
		workbook.close();
        fi.close();
        fo.close();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
