import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;



class UserModel {
    private String First_Name;
    private String Last_Name;
    private String Email;

    public UserModel(String First_Name, String Last_Name, String Email) {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Email = Email;
    }

    // register page
    public void Register(){

        // creating connection with the frame
        RegisterPage register=new RegisterPage();

    }

    //login page 
    public void Login(){

        LoginPage login=new LoginPage();
    }


}


// Note and its Components
class Note extends UserModel{
    public String title;
    public String Notes;
    public String Subject_Catagory;
    public Note(String First_Name, String Last_Name, String Email) {
        super(First_Name, Last_Name, Email);
        //TODO Auto-generated constructor stub
    
    }


    // Section for creating Notes 
    public void Create_Notes(){

    }
    // Editing Notes 
    public void Edit_Note(){
        String New_Note;
    }

    // delete Notes
    public void Delete_Note(){

    }


}


// Main Class  

public class Main
{public static void main(String[] args) throws Exception {

    // Java Database connectivity
    String dbURL = "jdbc:mysql://localhost:3306/notepad";
    String username = "root";
    String password = "*********";
    String query = "SELECT * FROM user";

    try (
            Connection conn = DriverManager.getConnection(dbURL, username, password);

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = stmt.executeQuery(query);

    ) {

        // Opertations goes here
    } 
    
    catch (Exception e) {
        e.printStackTrace();
    }
}
}
