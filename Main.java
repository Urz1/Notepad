
import java.util.Scanner;
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
    public String Title;
    public String Notes;
    public String Subject_Catagory;
    public Note(String First_Name, String Last_Name, String Email) {
        super(First_Name, Last_Name, Email);
        //TODO Auto-generated constructor stub
    
    }


    // Section for creating Notes 
    public void Create_Notes(ResultSet resultSet){
        String Title,Content,Catagory;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert the title of the ");
        // String queryString="insert into note(Note-Title,Content,Note_Catagory) values (" + Title + ", " + Content + ", " + Catagory + ")";
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
{
    public static void main(String[] args) throws Exception {
        // Creating the instance of 
        NotesPage create=new NotesPage();
        create.Design();
    }
}
