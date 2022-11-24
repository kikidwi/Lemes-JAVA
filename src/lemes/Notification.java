
package lemes;
import java.util.*;



public class Notification {
    private InformasiKolamLele WaktuPakan;
    Scanner scan = new Scanner(System.in);
    public void DisplayWaktuBeriPakan(){ //3 kali per hari
            int waktuMulai = 0;
            while (waktuMulai == 0){
                Calendar kalender = new GregorianCalendar();
                int jam = kalender.get(Calendar.HOUR);
                int AMPM = kalender.get(Calendar.AM_PM);
                String siangMalam;
                if (AMPM == 1){
                    siangMalam = "PM";
                }else{
                    siangMalam = "AM";
                }

                if ((jam == 9 && siangMalam == "AM") || (jam == 1 && siangMalam =="PM") || (jam == 4 && siangMalam == "PM") ){
                    System.out.println("WAKTUNYA MEMBERI PAKANN");
                    waktuMulai = 1;
                }else{
                    System.out.println("SEKARANG BELUM WAKTUNYA MEMBERI PAKAN");
                    waktuMulai = 1;
                }
            }
        }

    public void DisplayWaktuPanen(){ //Waktu panen 3 bulan, gimana caranya biar user input tanggal terus kita kasih pemberitahuan 3 bulan kemudian
            //// To take the input
            // Scanner scanner = new Scanner(System.in);
            // System.out.println("Enter the Date ");

            // String date = scanner.next();

            // SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
            // Date date2=null;
            // try {
            // //Parsing the String
            // date2 = dateFormat.parse(date);
            // } catch (ParseException e) {
            // // TODO Auto-generated catch block
            // e.printStackTrace();
            // }
            // System.out.println(date2);
            //Date date = new Date();
            //SimpleDateFOrmat ft = new SimpleDateFOrmat("E yyyy.mm.dd");
            //System.out.println("Sekarang tanggal : "+ft.format(date);
 
        }

    public void DisplaywaktuRestockpakan(){ //sehabisnya dari info awal inputan pakan

            System.out.print("Masukkan Jumlah Pakan : ");
            int jumlahPakan = scan.nextInt();
            RestockPakan waktuRestok = new RestockPakan(jumlahPakan);
            waktuRestok.hitungRestockPakan();
           
        }
}
