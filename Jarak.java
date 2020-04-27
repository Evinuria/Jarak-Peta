public class Jarak{
    float JP;
    int JS;
    int Skala;
    
    public Jarak(){   
}
    public void jarak(){
        if(Skala<=0){System.out.println("Angka yang anda masukkan salah");
        }
        else{
        JP= JS/Skala;
        System.out.println("Jarak Pada Peta adalah = " + JP + " cm");
 }
    }
}