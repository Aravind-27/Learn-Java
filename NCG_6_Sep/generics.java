package NCG_6_Sep;

public class generics<T> {
    private T t;

    public T get(){
        return this.t;
    }

    public void set(T t1){
        this.t=t1;
    }

    public static void main(String args[]){
        generics<String> type = new generics<>();
        type.set("Java");

        generics type1 = new generics();
        type1.set("Java");
        type1.set(10);
    }
}
