package in_nk;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
public class Convert_Json_To_Object {

	public static void main(String[] args)throws Exception {
		
		//convert json data to java object
		ObjectMapper mapper = new ObjectMapper();
		Customer value = mapper.readValue(new File("customer.json"), Customer.class);
		System.out.println(value);
	}
}
