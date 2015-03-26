import java.util.ArrayList;
import java.util.Comparator;


public class NoteModel implements sortProxyInterface{
	
	private String noteTitle;
	private String note;
    private String data;
    private String time;
    private String priority;

    public NoteModel(String _noteTitle, String _note, String _date, String _time, String _priority) {
        this.noteTitle = _noteTitle;
        this.note = _note;
        this.data = _date;
        this.time = _time;
        this.priority = _priority;
    }
    
    

    public String getNoteTitle() {
		return noteTitle;
	}

	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public void sortByTitle() {
		// TODO Auto-generated method stub
		
	}



	public void sortByTitle(ArrayList<NoteModel> nm) {
		// TODO Auto-generated method stub
		
	}



}
