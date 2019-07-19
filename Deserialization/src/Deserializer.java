import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class Deserializer {


    public static void main(String[] args) throws IOException,ClassNotFoundException {
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Serialization\\serialize.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Contact contact=(Contact)objectInputStream.readObject();
        System.out.println(contact.name +"\t"+contact.phoneNumber+"\t"+contact.relationship+"\t"+contact.designation);
    }
}
