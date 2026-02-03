package ua.university;

class B extends A{
    @Override
    void process(Object obj){
        System.out.println("B:Object");
    };
    void process(String str){
        System.out.println("B:String");
    }
}
