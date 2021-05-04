package ru.geekbrains.java_core.lesson11;

public class GenericArray<T> {

    private T[] array;

    public GenericArray(T... array){
        this.array = array;
    }

    @Override
    public String toString(){
        String str="";
        for (T o:array)
        {
            str+=o+" ";
        }
        return str;
    }

    public void replaceElements(int index1, int index2){

        if ((index1>array.length-1)||(index2>array.length-1)) {
            System.out.println("Индексы за пределами размера массива");
        }

        else {
            T bufer = array[index1];
            array[index1] = array[index2];
            array[index2] = bufer;
        }

    }


    public void convertArrayToArrayList(T[] array){




    }

}
