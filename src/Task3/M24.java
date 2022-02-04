package Task3;

public class M24 implements WeaponOperation{

    int a=20;
  public   void fire()
    {
        System.out.println("Person fired M24 >> M24 Bullet has been fired at position:" +a+"meter");
    }

   public void move()
    {
        a+=20;
        System.out.println("moved");
    }
   public void reload()
    {
        System.out.println("M24 has RE-LOADING >>");
    }
}
