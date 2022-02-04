package Task3;

public class M416 implements WeaponOperation{

    int a=30;


  public   void fire()
    {
            System.out.println("Person fired M416 >> Bullet has been fired at position:" +a+"meter");
    }

   public void move()
    {
        a+=30;
        System.out.println("moved");

    }

   public void reload()
    {
        System.out.println("M416 has RE-LOADING >>");
    }

}
