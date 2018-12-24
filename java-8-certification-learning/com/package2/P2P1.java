package com.package2;
import com.package1.*;

public class P2P1 extends P1P1{
    public static void main(String... args){
        P2P1 superclass = new P2P1();
        superclass.name = "Azhar 2";
        System.out.println(superclass.getName());
    }

    protected void setName(String name){
        this.name = "Default Name";
    }

    public String getName(){
        return this.name;
    }
    
}

class P2P2{
    String p2p2func(){
        P2P1 p2p1 = new P2P1();
        p2p1.setName("Testing");

    }

}