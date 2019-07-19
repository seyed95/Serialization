import java.io.*;


public class Controller {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Contact contact=new Contact(9442371183l,"self","seyed");
        contact.designation="Employee";
        FileOutputStream fileoutputStream= new FileOutputStream("serialize.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileoutputStream);
        objectOutputStream.writeObject(contact);
        objectOutputStream.close();
        fileoutputStream.close();
        System.out.println("Before Serialization:"+contact);
        //Deserialization deserialization=new Deserialization();
        //deserialization.deserialize();
    }
}
