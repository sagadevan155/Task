package Task3;

public class Person extends Gun {
    int straight;
    int back;
    int left;
    int right;
    int jump;
    int initialstage = 0;
    int fire, move, reload;


    Gun gun=new Gun();

    Person()
    {

    }

    Person(int fire, int move, int reload)
    {
        this.fire = fire;
        this.move = move;
        this.reload = reload;
    }

    int fire()
    {
        this.fire = fire;
        return this.fire;
    }

    int getMove(int increment)
    {
        this.move = move + increment;
        return this.move;
    }

    int getReload(int increment)
    {
        return this.reload;
    }


    void straight()
    {
        straight += initialstage + 1;
        System.out.println("person move straight:" + straight + "steps");
    }

    void back()
    {
        back = straight--;
        System.out.println("person move back:" + back + "steps");
    }

    void left()
    {
        left = initialstage + left + 1;
        System.out.println("person move on left side:" + left + "steps");

    }

    void right()
    {
        right = initialstage + right + 1;
        System.out.println("person move on right side:" + right + "steps");
    }

    void jump()
    {
        jump += initialstage + 5;
        System.out.println("person jump on:" + jump + "meters");
    }
}
