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
					{"locked_out_user","secret_sauce"},
					{"problem_user","secret_sauc"},
					{"performance_glitch_user","secret_sauce"}
			    
			   
				};
			
			
		}
		return data;
	}
}
