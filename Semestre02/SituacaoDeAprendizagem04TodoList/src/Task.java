import javax.swing.JButton;

public class Task {
    String description;
    Boolean done;
    // Construtor
    public Task(String description, String string, int i, boolean b) {
        this.description = description;
        this.done = false;
    }
    // Gets and Sets
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Boolean isDone() {
        return done;
    }
    public void setDone(Boolean done) {
        this.done = done;
    }
    public static void add(JButton deleteButton) {
    }
    public boolean isSelected() {
        return false;
    }
    public String getTitle() {
        return null;
    }
    public int getPriority() {
        return 0;
    }
    public void setSelected(boolean b) {
    }
    
}
