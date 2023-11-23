
package pertemuan8.UTS;

import java.util.Random;

public class masterrole {
     //stat
     int atk;
     int HP;
     
     //action
    public void walking() {
        System.out.println("==========[karaktermu berjalan]==========");
    }

    public void attacking() {
        System.out.println("karaktermu menyerang"); 
    }
    
    public boolean iskabur (){
       Random random = new Random();
       int kabur = random.nextInt(10);
       return kabur < 5;
    }
    
    public boolean iskaburtrue (){
        if (this.iskabur() == true);
        return this.iskabur();
    }
    
    public boolean iskaburfalse (){
        if (this.iskabur() == false);
        return this.iskabur();
    }
    
    public void kabur (){
        System.out.println("==========[Karaktermu Melarikan Diri]=========="); 
        }
    
    public void notkabur (){
        System.out.println("==========[Karaktermu Gagal Melarikan Diri]==========");
    }
    
    public void mati(){
        System.out.println("==========[Gameover]==========");
        System.out.println("==========[Karaktermu Mati]==========");
    }
    
  

}
       
    
