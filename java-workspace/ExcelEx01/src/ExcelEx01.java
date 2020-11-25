import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workbook workbook = null;
		
		try {
			// workbook - Excel파일
			workbook = Workbook.getWorkbook(new File("./zipcode_seoul_euckr_type2.xls"));
			// Sheet 가져오기
			Sheet sheet = workbook.getSheet(0); // 0번째 sheet 
			
			//System.out.println(sheet.getRows());
			//System.out.println(sheet.getColumns());
			
			//일반적으로(행, 열) -> Cell(열, 행)
			Cell zipcode = sheet.getCell(0, 0);
			Cell sido = sheet.getCell(1, 0);
			Cell gugun = sheet.getCell(2, 0);
			Cell dong = sheet.getCell(3, 0);
			Cell ri = sheet.getCell(4, 0);
			Cell bunji = sheet.getCell(5, 0);
			
			System.out.println(zipcode.getContents());
			System.out.println(sido.getContents());
			System.out.println(gugun.getContents());
			System.out.println(dong.getContents());
			System.out.println(ri.getContents());
			System.out.println(bunji.getContents());
			
			
			
			
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(workbook!=null) workbook.close();
		}
	}

}
