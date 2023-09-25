package myfirstpackage;

public class MySecondClass
{
    private int x;
    private int y;

    public int GetX()
    {
        return x;
    }

    public int GetY()
    {
        return y;
    }

    public void SetX(int val)
    {
        x = val;
    }

    public void SetY(int val)
    {
        y = val;
    }

    public MySecondClass(int val1, int val2)
    {
        x = val1;
        y = val2;
    }

    public int BitwiseOr()
    {
        return (x | y);
    }
}