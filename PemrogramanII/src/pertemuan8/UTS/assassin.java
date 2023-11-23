
package pertemuan8.UTS;
import java.util.Random;
public class assassin extends masterrole {
    public void assassin() {
        HP = 100;
        atk = 30;
        System.out.println("==========[Assassin]==========");
        System.out.println("HP:  " + HP);
        System.out.println("Attack:  " + atk);
   
    }
    @Override
    public void attacking(){
        Random random = new Random ();
        atk = 30;
        atk = random.nextInt(10) + atk;
        System.out.println("==========[Karaktermu memulai menyerang]==========");
        System.out.println("Karaktermu mengurangi darah musuh sebesar: " + atk);
    }   
}
