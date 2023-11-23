
package pertemuan8.UTS;
import java.util.Scanner;
import java.util.Random;
public class run extends masterrole {  

    
    public static void main(String[] args) {
        //variabel bantuan
        int pilihan,rand;
        
        //myobject
        Scanner scan = new Scanner (System.in);
        menu mykarakter = new menu ();
        assassin myassassin = new assassin();
        fighter myfighter = new fighter ();
        enemyskeleton myskeleton = new enemyskeleton ();
        masterrole myaction = new masterrole ();
        Random random = new Random ();
        loginSession login = new loginSession ();

        

        login.loginPrompt();
        mykarakter.menu();
        pilihan = scan.nextInt();
        
        switch (pilihan){
            case 1://assassin
                myassassin.assassin();
                loops1:
                while (true)
                {
                    System.out.print("tekan 1 untuk berjalan: ");
                    pilihan = scan.nextInt();
                    switch (pilihan)
                    {
                        case 1:
                            myaction.walking();
                            rand = random.nextInt(10);
                            
                            if (rand < 5)
                            {
                                System.out.println("Kamu diserang oleh musuh");
                                myskeleton.skeleton();
                                
                                loops2:
                                while (true)
                                {
                                    System.out.println("==========[Giliranmu]==========");
                                    mykarakter.menuaction();
                                    pilihan = scan.nextInt();
                                    switch (pilihan)
                                {       case 1:
                                        myassassin.attacking();
                                        myskeleton.HP = myskeleton.HP - myassassin.atk;
                                        
                                        if(myskeleton.HP >=0)
                                        {
                                         System.out.println("HP Musuh: " +myskeleton.HP);
                                        }
                                        else
                                        {
                                            System.out.println("HP Musuh: 0");
                                        }
                                        
                                        break ;
                                        
                                        case 2 :
                                        if (myaction.iskaburtrue())
                                        {
                                        myaction.kabur();
                                        break loops2;
                                        }
                                        else if (myaction.iskaburfalse()) 
                                        {
                                        myaction.notkabur();
                                        continue loops2;
                                        } 
                                }
                                    if (myskeleton.HP >0)
                                  {
                                    System.out.println("==========[Giliran Lawan Menyerang]==========");
                                    myskeleton.attacking();
                                    myassassin.HP = myassassin.HP - myskeleton.atk;
                                    if(myassassin.HP >=0)
                                    {
                                    System.out.println("HP karaktermu tersisa: " +myassassin.HP);
                                    }
                                    else{
                                        System.out.println("HP karaktermu tersisa: 0");
                                    }
                                    if (myskeleton.HP <=0 || myassassin.HP <=0)
                                    {
                                        break loops2;
                                    }
                                  }
                                    else
                                    {
                                        break loops2;
                                    }

                                }
                                if(myskeleton.HP <= 0){
                                    myskeleton.mati();
                                }
                                else if (myassassin.HP <= 0){
                                    myaction.mati();
                                    break loops1;
                                }
                           }
                            else 
                            {
                                continue loops1;
                            }
                    }
                }
                break;
            case 2://fighter
                 myfighter.fighter();
                loops1:
                while (true)
                {
                    System.out.print("tekan 1 untuk berjalan: ");
                    pilihan = scan.nextInt();
                    switch (pilihan)
                    {
                        case 1:
                            myaction.walking();
                            rand = random.nextInt(10);
                            
                            if (rand < 5)
                            {
                                System.out.println("Kamu diserang oleh musuh");
                                myskeleton.skeleton();
                                
                                loops2:
                                while (true)
                                {
                                    mykarakter.menuaction();
                                    pilihan = scan.nextInt();
                                    switch (pilihan)
                                {       case 1:
                                        myfighter.attacking();
                                        myskeleton.HP = myskeleton.HP - myfighter.atk;
                                        if(myskeleton.HP >=0)
                                        {
                                         System.out.println("HP Musuh: " +myskeleton.HP);
                                        }
                                        else
                                        {
                                            System.out.println("HP Musuh: 0");
                                        }
                                        break ;
                                        case 2 :
                                        if (myaction.iskaburtrue())
                                        {
                                        myaction.kabur();
                                        break loops2;
                                        }
                                        else if (myaction.iskaburfalse()) 
                                        {
                                        myaction.notkabur();
                                        continue loops2;
                                        } 
                                }
                                    if (myskeleton.HP >0)
                                  {
                                    System.out.println("==========[Giliran Lawan Menyerang]==========");
                                    myskeleton.attacking();
                                    myfighter.HP = myfighter.HP - myskeleton.atk;
                                    if(myfighter.HP >=0)
                                    {
                                    System.out.println("HP karaktermu tersisa: " +myfighter.HP);
                                    }
                                    else{
                                        System.out.println("HP karaktermu tersisa: 0");
                                    }
                                    if (myskeleton.HP <=0 || myfighter.HP <=0)
                                    {
                                        break loops2;
                                    }
                                  }
                                    else
                                    {
                                        break loops2;
                                    }
                                }
                                if(myskeleton.HP <= 0){
                                    myskeleton.mati();
                                }
                                else if (myfighter.HP <= 0){
                                    myaction.mati();
                                    break loops1;
                                }
                           }
                            else 
                            {
                                continue loops1;
                            }
                    }
                }
               
}
        System.out.println("Terimakasih Telah Bermain");
                
      
}
}
