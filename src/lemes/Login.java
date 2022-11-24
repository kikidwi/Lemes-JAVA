
package lemes;


public class Login {
    private String username;
    private String password;
    MenuAdmin admin = new MenuAdmin();
    MenuUser user = new MenuUser();
    private SignUp[] akun;
    private int jumlahAkun;
    
    public  Login(int max){
        this.akun = new SignUp[max];
    }
    public void tambahAkun(SignUp newAkun){
        this.akun[jumlahAkun] = newAkun;
        jumlahAkun++;
    }

    public void validasi(String username, String password){
       if ((username.equals("admin")) && (password.equals("admin")) ){
            admin.pilihMenu();
       }else{
            for(int i = 0; i < akun.length; i++){
                if (akun[i] != null){
                    if((username.equals(akun[i].getUsername())) && (password.equals(akun[i].getPassword()) )){
                       user.pilihMenu();
                    }
                }else {
                    System.out.println("Data Invalid");
                }
                        
             }
            
       }
    }

    // public void logout(){
    //     break;
    // }
    
    public void displayProfil(){
        System.out.println("Nama : ");
        System.out.println("Nama username : " + this.username);
        System.out.println("Password : " + this.password);
    }
}
