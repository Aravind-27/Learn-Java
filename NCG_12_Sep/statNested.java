package NCG_12_Sep;

class statNested{
    static int data=30;
    static class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        statNested.Inner obj=new statNested.Inner();
        obj.msg();
    }
}
