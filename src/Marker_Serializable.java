import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Marker_Serializable implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String  name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int state;
    public Marker_Serializable(int id, String name, int state){
        this.id = id;
        this.name = name; 
        this.state = state;
    }
    public void serialize(String filePath, Marker_Serializable ms) throws Exception{
        FileOutputStream fs = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fs);
        oos.writeObject(ms);
        oos.flush();
        oos.close();
    }
    public void deserialize(String filePaString) throws Exception{
        FileInputStream fis = new FileInputStream(filePaString);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Marker_Serializable s2 = (Marker_Serializable)ois.readObject();
        System.out.println("values read  "+ s2.id + " " + s2.name + s2.state);
        ois.close();

    }
    public static void main(String[] args) {
        Marker_Serializable ms = new Marker_Serializable(1,"abc",0);
        try {
            //C:\Users\hp\VSCODES\JavaProjects\demo\src
        ms.serialize("marker_Serializable.txt", ms);
        ms.deserialize("marker_Serializable.txt");
        }catch(Exception e){
            System.out.println("Exception " + e.getStackTrace());
        }
    }

}
