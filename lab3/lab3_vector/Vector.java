package lab3_vector;

import lab3_vector.*;

public class Vector<T>{
    private T[] arr;
    private int len;
    private int capacity;

    public Vector(){
        this.arr = (T[])new Object[1];
        this.capacity = 1;
        this.len = 0;
    }

    public Vector(int _capacity){
        this.arr = (T[])new Object[_capacity];
        this.capacity = _capacity;
        this.len = 0;
    }
    
    private Vector(T[] _arr, int _len, int _cap){
        this.arr = _arr;
        this.len = _len;
        this.capacity = _cap;
    }

    public Vector(Vector<T> vec){
        this(vec.arr, vec.len, vec.capacity);
    }

    private void resize(){
        T[] new_arr = (T[])new Object[2*this.capacity];
        for (int i = 0; i < this.capacity; i++){
            new_arr[i] = this.arr[i];
        }
        this.arr = new_arr;
        this.capacity = 2*this.capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
    public int getLen(){
        return this.len;
    }

    public void push(T element){
        if (this.len == this.capacity){
            resize();
        }
        this.arr[len] = element;
        this.len++;
    }

    public T pop() throws Exception{
        if (this.len == 0){
            throw new Exception("Error: nothing to pop");
        }
        len--;
        return this.arr[len];
    }

    public T get(int index) throws Exception{
        if (index > this.len || index < 0){
            throw new Exception("Bad Index");
        }

        return this.arr[index];

    }


}