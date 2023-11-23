
package pertemuan8.UTS;
import java.util.Scanner;

public class loginSession {
    Scanner loginScan = new Scanner(System.in);
    private String username;
    private String password;
    boolean loginStatus = false;
    
    String setUsername (String Username){
        this.username = Username;
        return Username;
    }
    
    String setPassword (String Password){
        this.password = Password;
        return Password;
    }
    
    String getUsername(){
        return username;
    }
    
    String getPassword(){
        return password;
    }
    
    public void loginPrompt(){
            System.out.println("Welcome to the GAME!");
            System.out.println("Buat Akun Terlebih Dahulu");
            System.out.print("Username: ");
            this.setUsername(username = loginScan.nextLine());
            System.out.print("Password: ");
            this.setPassword(password = loginScan.nextLine());
        do{
            System.out.println("Silahkan Masukkan Username dan Password yang Telah Dibuat");
            System.out.print("Enter Username    : ");
            String trueUser = loginScan.nextLine();
            System.out.print("Enter Password    : ");
            String truePass = loginScan.nextLine();

            if(this.getUsername().equals(trueUser) && this.getPassword().equals(truePass)){
                loginStatus = true;
            }
            else{
                System.out.println("Wrong Username or Password Bro, try again!");
            }
        }while(loginStatus==false);
        System.out.println("==========Welcome==========");
    }
    
    
}