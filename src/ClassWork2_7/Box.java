package ClassWork2_7;

public class Box<T>{

    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

}
