package Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        TestClass r = new TestClass();
        Class<?> c1 = Class.forName(TestClass.class.getName());
        while (c1!=null) {

            for(Method m : c1.getDeclaredMethods()){
                System.out.println(Modifier.toString(m.getModifiers())+ " " +
                        m.getReturnType().getCanonicalName()
                        +" "+m.getName()+ Arrays.toString(m.getParameters())
                );
            }
            c1=c1.getSuperclass();
            System.out.println("----to super class----");
        }
    }
}

class TestClass{
    private int i;
    private int j;
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int forSum(){
        return i+j;

    }
}
