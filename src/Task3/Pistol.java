package Task3;

class Pistol implements WeaponOperation
{
    int a=5;
    public void fire()
{
  System.out.println("Person fired Pistol >> Pistol Bullet has been fired at position:" +a+"meter");
}

 public void move()
 {
     a+=5;
 }
   public void reload()
    {
        System.out.println("PISTOL has RE-LOADING >>");
    }
}
