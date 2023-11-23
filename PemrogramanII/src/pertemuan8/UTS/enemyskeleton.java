
package pertemuan8.UTS;
import java.util.Random;
public class enemyskeleton extends masterrole{
    public void skeleton (){
        HP = 50;
        atk = 10;
        System.out.println("==[Jenis Musuh: Skeleton]==");
        System.out.println("==========[Stats]==========");
        System.out.println("HP: "+HP);
        System.out.println("Attack: "+atk);
    }
    
    @Override
    public void attacking (){
    Random random = new Random ();
    atk = 10;
    atk = random.nextInt(3)+ atk;
    System.out.println("Lawan Meberikan Damage Kepadamu Sebesar: " + atk  ); 
    }
    
    @Override
    public void mati (){
        System.out.println("==========[Musuh Telah Dikalahkan]==========");
    }

    
}
