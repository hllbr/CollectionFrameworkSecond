
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        /*
        LinkedList ArrayList performans karşılaştırması 
        LinkedList verileri sıralı olarak depolamıyor.Sadece referanslar birbirini gösteriyor.
        verşler bellekte sıralı değil birbirlerine bağlı olarak depolanmış durumda
        */
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //burdaki iki yapınında birbirlerine üstün geldiği noktalar var.
        zamanhesapla("LinkedList", linkedList);
        zamanhesapla("ArrayList", arrayList);
        System.out.println("bu durumda ArrayList daha avantajlı");
        zamanHesaplaDeger("likedList", linkedList);
        zamanHesaplaDeger("arraylist", arrayList);
        System.out.println("bu durumda LinkedList daha avantajlı");
        System.out.println("******************************************************");
        System.out.println("birinci işlemde arraqylist arka arkaya belek açıp ekliyor ve devam ediyordu bu yüzden linkedlistten hızlıydı\n"
                + "bu esnada linkedlist ise referans ile değer eşleştirmesi yaparak gittiği için sıkntı yaşadı\n"
                + "ikinci durumda ise linkedlist elemanı sildi yükledi bitti.\n"
                + "linkedlist ilk iki indexteki elemanı değiştiriyior(Güncelliyor) referansları koparıyor arraylist kıyaslarsak daha kolay\n"
                + "arraylist ise kaydırma özelliği anlamını yitirdiği için sürekli aynı noktaya yükleme yapıldığı için işlem süresi uzuyor.");
        }
    public static void zamanhesapla(String verTipi,List<Integer> list){
        //başlangıc ve bitiş zamanlarını almak için 
        long baslangıc ;
        long bitis ;
        baslangıc = System.currentTimeMillis();
    //listin sonuna değer ekleme
    for(int i = 0;i<=2000000;i++){
        list.add(i);
    }
    bitis = System.currentTimeMillis();
        System.out.println(verTipi +" ekeleme süresi = "+ (bitis-baslangıc));
    }
        public static void zamanHesaplaDeger(String verTipi,List<Integer> list){
        //başlangıc ve bitiş zamanlarını almak için 
        long baslangıc ;
        long bitis ;
        baslangıc = System.currentTimeMillis();
    //listin sonuna değer ekleme
    for(int i = 0;i<=10000;i++){
        list.add(0,i);
    }
    bitis = System.currentTimeMillis();
        System.out.println(verTipi +" ekeleme süresi = "+ (bitis-baslangıc));
    }
    
}
