class MyFirstClass { 

    public static void main(String[] s)
    { 
        MySecondClass o = new MySecondClass(10, 11);
        System.out.println(o.BitwiseOr());
        for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
			o.SetX(i);
			o.SetY(j);
			System.out.print(o.BitwiseOr());
			System.out.print(" ");
			} 
             System.out.println();
    } 

} 
}

class MySecondClass
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