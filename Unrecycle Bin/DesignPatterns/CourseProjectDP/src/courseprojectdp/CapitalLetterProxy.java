


public class CapitalLetterProxy implements DataOutput {

    private DataOutput target = null;

    public CapitalLetterProxy() {

    }

    public CapitalLetterProxy(DataOutput target) {
        this.target = target;
    }

    public void showData(String _data) throws ProxyValidationException {
       // make first character Uppercase
        String data = _data.trim();
        String newString = data.substring(0,1).toUpperCase() +
                data.substring(1);
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
