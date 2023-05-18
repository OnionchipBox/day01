package day01;

public class StaticExam{
    public static void main(String []args){
        CarStatic taxi = new CarStatic();
        CarStatic suv = new CarStatic();
        
        taxi.wheelCount = 10;
        suv.wheelCount = 4;
        
        System.out.println("taxi의 바퀴수:"+ taxi.wheelCount);
        System.out.println("suv의 바퀴수:"+ suv.wheelCount);
    }
}