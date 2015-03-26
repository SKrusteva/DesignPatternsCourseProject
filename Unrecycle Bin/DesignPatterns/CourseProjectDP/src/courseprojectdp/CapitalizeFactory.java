import java.util.ArrayList;




public class CapitalizeFactory {
	
	public static DataOutput createProxy(String type){
		DataOutput result = null;
		
		if(type.equals("capitalize")){
			result = new CapitalLetterProxy(new DataValidatedOutput());
		}else if(type.equals("uppercase")){
			result = new AllToUpperProxy(new DataValidatedOutput());
		}else if(type.equals("multiply")){
			result = new MultiplicationProxy(new DataValidatedOutput());
		}
		return result;
	}

}
