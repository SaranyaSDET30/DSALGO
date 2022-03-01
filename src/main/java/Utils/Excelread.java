package Utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;



public class Excelread {
private String sheetName;
private String path;


//	
//	String path="./ExcelData/Exceltestdata.xlsx";
//	String sheetName="Sheet1";


	public Excelread(String path,String sheetName) {
		
		this.path=path;
		this.sheetName=sheetName;
	}

	
	public String[][] getData(String path,String sheetName) throws IOException {
		
		
		ExcelUtils excelutils=new ExcelUtils(path,sheetName);
		int totalrows=excelutils.getRowCount();
		int totalcells=excelutils.sheet.getRow(0).getLastCellNum();
		System.out.println("total cells"+totalcells);
		
		String loginData[][]=new String[totalrows][totalcells];
		
	//    for(int i=1;i<=totalrows;i++) {
		for(int i=0;i<totalrows;i++) {
	    	for(int j=0;j<totalcells;j++) {
	    		
	    	loginData[i][j]=excelutils.getCellData(i, j);
			System.out.println("logindata"+loginData[i][j]);	
	    	}
	    }

		return loginData;
		
	}
	
	
	
	
}
