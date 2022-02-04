package Task3;

import java.util.Scanner;

 class Gun {

     WeaponOperation weaponOperation=null;

     Pistol pistol = new Pistol();
     M24 m24 = new M24();
     M416 m416 = new M416();
     AKM akm = new AKM();

     void choosegun()
     {

         int ch = 5;
         Scanner sc = new Scanner(System.in);
         while (ch <= 5) {
             System.out.println("GUN >>");
             System.out.println("\n 1.M416 \n 2.Pistol \n 3.AKM \n 4.M24 \n 5.Exit ");
             System.out.println("Enter your option: ");
             ch = sc.nextInt();
             switch (ch) {
                 case 1:
                     m416.fire();
                     weaponOperation=new M416();
                     break;
                 case 2:
                     pistol.fire();
                     weaponOperation=new Pistol();
                     break;
                 case 3:
                     akm.fire();
                     weaponOperation=new AKM();
                     break;
                 case 4:
                     m24.fire();
                     weaponOperation=new M24();
                     break;
                 case 5:
                     break;
             }
         }
     }
 }
