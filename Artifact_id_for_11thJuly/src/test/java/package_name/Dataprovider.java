package package_name;
import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;
public class Dataprovider {

	
	@DataProvider(name="testing")
	public Object[][] setup(Method m){
		Object[][] data=null;
		if(m.getName().equals("Excel")) {
			data=new Object[][]
			
			    { 
					{"standard_user","secret_sauce"},
					{"locked_out_","secret_sauc"},
					{"problem_user","secret_sauce"},
					{"performance_glitch_user","secret_sauce"}
			    
			   
				};
			
			
		}
		return data;
	}
}
