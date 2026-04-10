package smoketest;

public class datareader1 {

	public static void main(String[] args) {
		//public static void readXLS() {
		readXLS();
			
		}

	private static void readXLS() {
		String filename = "/Users/architsingh/Userloginpage..xlsx";
		String[][]data = utilities.Excel.getData(filename);
		for (String[] record : data) {
			System.out.println(record[0]);
			System.out.println(record[1]);
			System.out.println(record[2]);
			System.out.println(record[3]);


		}
	}
		
		
	}

///Users/architsingh/Userloginpage..xlsx
//

///Users/architsingh/Book1.xls

///Users/architsingh/Desktop/Archit\'s/UserLogin.xls