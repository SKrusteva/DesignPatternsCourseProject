


public class InputAdapter {
	
	String input = "";
	
	public InputAdapter(String data){
		this.input = data;
	}
	
	public int[] formatData(){
		
		int[] formatedData = new int[2];
		
		for(int i = 0; i < this.input.length(); i++){
			try {
                            formatedData[i] = Integer.parseInt(Character.toString(input.charAt(i)));
                        } catch (NumberFormatException ex) {
                            
                        }
		}
		
		return formatedData;
	}

}
