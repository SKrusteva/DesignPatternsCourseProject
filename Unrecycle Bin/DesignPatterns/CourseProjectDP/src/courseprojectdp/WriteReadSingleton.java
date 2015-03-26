
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;




public class WriteReadSingleton {

    private static WriteReadSingleton instance = null;

   // ArrayList<String> data = new ArrayList<String>();
    ArrayList<String> data;
    ArrayList<String> columnNames = new ArrayList<String>();
    ArrayList<NoteModel> noteData = new ArrayList<NoteModel>();
 //   ArrayList<NoteModel> columnNames = new ArrayList<NoteModel>();
    protected String datafile;

    private WriteReadSingleton() {
    }

    //vra6ta arraylist sas vsi4ki belezki

    public void readFiles(String filePath) {
        datafile = filePath;
        initArrayList();
    }

    public ArrayList<String> listFilesForFolder(final File folder) {

    	ArrayList<String> fileNames = new ArrayList();

    	for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
               // listFilesForFolder(fileEntry);
            } else {
                System.out.println(fileEntry.getName());
                fileNames.add(fileEntry.getName());
            }
        }

    	return fileNames;
    }

    public void writeToFile(String fileName) {

    }

     private void initArrayList() {
          String aLine ;
       // data = new Vector();
       // columnNames = new Vector();
          data = new ArrayList<String>();
       //   columnNames = new ArrayList<String>();
        try {
          FileInputStream fin =  new FileInputStream(datafile);
          BufferedReader br = new BufferedReader(new InputStreamReader(fin));
          // extract column names
          if(columnNames.isEmpty()){
          StringTokenizer st1 =
             new StringTokenizer(br.readLine(), "|");
            while(st1.hasMoreTokens())
              columnNames.add(st1.nextToken());
          }else
          {
            br.readLine();
          }
             //   columnNames.addElement(st1.nextToken());
          // extract data
          while ((aLine = br.readLine()) != null) {
	             StringTokenizer st2 =
	             new StringTokenizer(aLine, "|");
	             while(st2.hasMoreTokens())
	             //   data.addElement(st2.nextToken());
	                  data.add(st2.nextToken());
             }
             System.out.println("The arraylist contains the following elements: " + data);
             System.out.println("---------------columnNames-------------------");
             System.out.println("The arraylist contains the following elements: " + columnNames);

             noteData.add(new NoteModel(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4)));
             br.close();
          }
        catch (Exception e) {
          e.printStackTrace();
          }
    }

    public static WriteReadSingleton instance() {
        if (instance == null) {
            //System.out.println("No NetworkPrinter instance. Initializing..");
            instance = new WriteReadSingleton();
        } else {
            System.out.println("WriteReadSingleton object instance exists.");
        }
        return instance;
    }

   

}
