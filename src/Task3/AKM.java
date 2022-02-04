package Task3;

public class AKM implements WeaponOperation {

    int a=40;
    @Override
    public void fire()
    {
        System.out.println("Person fired AKM >> AKM Bullet has been fired at position:" +a+"meter");
    }
@Override
   public void move()
    {
        a+=40;
    }
    @Override
  public   void reload()
    {
        System.out.println("AKM has RE-LOADING >>");
    }
}
