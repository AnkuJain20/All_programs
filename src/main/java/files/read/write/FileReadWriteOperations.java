//package files.read.write;
//
//import java.io.*;
//import java.util.Properties;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//
//public class FileReadWriteOperations {
//    public static void main(String[] args) throws IOException {
//        System.out.println("Reading excel sheet");
//        readExcelSheetFromLocation();
//        System.out.println("Reading properties sheet");
//        readPropertiesFile();
//        System.out.println("Reading txt sheet");
//        readTextFile();
//    }
//
//    private static void readTextFile() throws IOException {
//        File file = new File("src/main/resources/sample.txt");
//
//        BufferedReader br = new BufferedReader(new FileReader(file));
//
//        String st;
//        while ((st = br.readLine()) != null)
//            System.out.println(st);
//    }
//
//
//    private static void readExcelSheetFromLocation() throws IOException {
//
//        File src = new File("C:\\Users\\Anku\\work\\testsheet.xlsx");
//        FileInputStream finput = new FileInputStream(src);
//
//        Workbook workbook = new XSSFWorkbook(finput);
//
//        Sheet guru99Sheet = workbook.getSheet("profile_info");
//        int rowCount = guru99Sheet.getLastRowNum() - guru99Sheet.getFirstRowNum();
//
//        for (int i = 0; i <= rowCount ; i++) {
//            Row row = guru99Sheet.getRow(i);
//            //Create a loop to print cell values in a row
//            for (int j = 0; j < row.getLastCellNum(); j++) {
//                if(j==0 && i>0){
//                    System.out.print(row.getCell(j).getNumericCellValue() + "|| ");
//                } else {
//                    System.out.print(row.getCell(j).getStringCellValue() + "|| ");
//                }
//            }
//            System.out.println();
//        }
//    }
//
//    private static void readPropertiesFile() {
//        BufferedReader reader;
//        Properties properties = null;
//        String propertyFilePath = "src/main/resources/configuration.properties";
//
//        try {
//            FileReader fileReader = new FileReader(propertyFilePath);
//            reader = new BufferedReader(fileReader);
//            properties = new Properties();
//            properties.load(reader);
//            reader.close();
//        } catch (Exception e){
//            System.out.println("exception occured: " + e.getMessage());
//        }
//
//        System.out.println("base URL: " + properties.getProperty("base_url"));
//    }
//
//}
