import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class sortProxy implements sortProxyInterface {
	
	public static Comparator<NoteModel> StuNameComparator = new Comparator<NoteModel>() {
    	
    	public int compare(NoteModel noteTitle1, NoteModel noteTitle2) {
    		
    		String nTitle1 = noteTitle1.getNoteTitle().toUpperCase();
    		String ntitle2 = noteTitle2.getNoteTitle().toUpperCase();
    		return nTitle1.compareTo(ntitle2);
    	}
    
    };

	public void sortByTitle(ArrayList<NoteModel> nm) {
		
	   System.out.println("Note title Sorting:");
 	   Collections.sort(nm, sortProxy.StuNameComparator);

 	   for(NoteModel str: nm){
 			System.out.println(str.getNoteTitle());
 	   }
   
       sortProxyInterface sProxy = new sortProxy();
		
		
	}



	

}
