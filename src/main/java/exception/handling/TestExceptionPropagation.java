package exception.handling;

import java.io.IOException;

public class TestExceptionPropagation {

    void m() throws IOException{
       throw new java.io.IOException("device error");//checked exception
    }


    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String args[]){
        TestExceptionPropagation obj=new TestExceptionPropagation();
        obj.p();
        System.out.println("normal flow");
    }
}
