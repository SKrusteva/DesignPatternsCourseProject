



public interface DataOutput {

    public static final int PROXY_VALIDATION = 1;
    public static final int PROXY_CAPITAL = 2;

    public void showData(String data) throws ProxyValidationException;
    public void setDisplay(Object display);
    public Object getDisplay();
    public void  parseData(int[] data) throws ProxyValidationException;
}
