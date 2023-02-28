// ae keo javaW6 ra khoi java-w6 roi moi het loi

package javaW6.b1;

public class IntegerArray {
    private Integer[] list;
    

    public IntegerArray(Integer[] list) {
        this.list = list;
    }

    public int Count() {
        return list.length;
    }

    public boolean Search(int x)
    {
        for (int i = 0; i < list.length; i++) 
        {
            if (list[i] == x) return true;
        }

        return false;
    }

    public void Delete(int index)
    {
        if (index < 0 || index >= list.length)
        {
            return;
        }

        for (int i = index; i < list.length - 1; i++)
        {
            list[i] = list[i + 1];
        }

        list[list.length - 1] = null;
    }
    
    public void display()
    {
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
