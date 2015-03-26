



import javax.swing.JTextField;

public class DataValidatedOutput implements DataOutput {
	
	JTextField display = null;
	
	public DataValidatedOutput(){
		
	}
	
	public DataValidatedOutput(Object display){
		this.display = (JTextField) display;
	}

    

    public void showData(String data) {
        display.setText(data);
    }

    public void setDisplay(Object display) {
        this.display = (JTextField) display;
    }

    public Object getDisplay() {
        return this.display;
    }

	public void parseData(int[] data) throws ProxyValidationException {
		// TODO Auto-generated method stub
		
	}

}
