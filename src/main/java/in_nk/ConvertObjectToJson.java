package in_nk;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
public class ConvertObjectToJson {

	public static void main(String[] args)throws Exception {
		
		Customer c = new Customer(101, "Nischitha", "nischitha123@gmail.com");
	
		//Convert object to json
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		
		System.out.println("Completed");
	}
}
