class Static{
   static int num;
    void display() 
{
  System.out.println("Default int: " + num);
   }

    public static void main(String[] args) 
{
        Static obj = new Static();
        obj.display();
    }
}
