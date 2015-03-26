

public class AllToUpperProxy  implements DataOutput{
	
	 private DataOutput target = null;
	 
	 public AllToUpperProxy(){
		
	 }
	 public AllToUpperProxy(DataOutput target){
		 this.target =  target;
	 }

	public void showData(String _data) throws ProxyValidationException {
		
		String data = _data.trim();
        String newString = data.substring(0,1).toLowerCase() +
                data.substring(1).toUpperCase();
        target.showData(newString);
		
	}

	public void setDisplay(Object display) {
		target.setDisplay(display);
		
	}

	public Object getDisplay() {
		return target.getDisplay();
	}
	public void parseData(int[] data) throws ProxyValidationException {
		// TODO Auto-generated method stub
		
	}
	

}
