
package pertemuan8.UTS;

import java.util.Random;

public class fighter extends masterrole {
   
    
    public void fighter() {
        HP = 150;
        atk = 20;
        System.out.println("==========[Fighter]==========");
        System.out.println("HP: "+ HP );
        System.out.println("Attack: " + atk  );
    }
    @Override
    public void attacking(){
        Random random = new Random ();
        atk = 20;
        atk = random.nextInt(10) + atk;
        System.out.println("==========[Karaktermu memulai menyerang]==========");
        System.out.println("Karaktermu mengurangi darah musuh sebesar: " + atk);   
    } 
    
}
