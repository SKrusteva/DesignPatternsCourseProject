


public class MultiplicationProxy implements DataOutput {

	 private DataOutput target = null;
	 Integer res;

	    public MultiplicationProxy() {

	    }

	    public MultiplicationProxy(DataOutput target) {
	        this.target = target;
	    }

	    public void parseData(int[] _data) throws ProxyValidationException{
	      res = _data[0] * _data[1];
	      System.out.println(res.toString());
	      target.showData(res.toString());
 
	    }

	    public void setDisplay(Object display) {
	        target.setDisplay(display);
	    }

	    public Object getDisplay() {
	        return target.getDisplay();
	    }

		public void showData(String data) throws ProxyValidationException {
						
		}

}
