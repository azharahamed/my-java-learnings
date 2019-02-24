class PassByValueVsReference {
    public static void main(String... args){
        Sample name1 = new Sample("Azhar");
        Sample name2 = new Sample("Jasmin");
        System.out.println("Before " + name1.getName() + " | " + name2.getName());
        swap(name1, name2);
        System.out.println("After " + name1.getName() + " | " + name2.getName());
        StringBuilder name = new StringBuilder("Initial");
        appendSample(name1);
        System.out.println("After Appending " + name1.getName() + " | " + name2.getName());
        System.out.println("Before : "+name);
        appendString(name);
        System.out.println("After : " +name);

    }
    static void swap(Sample name1, Sample name2){
        Sample temp = name1;
        name1 = name2;
        name2 = temp;
        temp.setName("I changed");
        System.out.println("Inside "+ name1.getName() + " | " + name2.getName());
    }

    static void appendString(StringBuilder name){
        StringBuilder test = name;
        test.append("-Really appending");
    }

    static void appendSample(Sample s){
        Sample b = s;
        b.appending(s);
    }
}

class Sample{
    String name;
    Sample(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void appending(Sample s){
        this.name += " Appending through function";
    }
}

