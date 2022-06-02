package sample.code.lessons.Enums;
//1. What they are? - Enum stands for enumeration. they define a pre-defined set of values that don't change. eg days of the week
public class EmumTutorial {

    //2. When they Should be Used? -
    public static void main(String[] args){

        DaysOfTheWeek day = DaysOfTheWeek.Friday;
        if(day == DaysOfTheWeek.Friday){
            System.out.println("Yeah!!! The weekend is here");
        }

        //This returns an array of all values in the enum
        //DaysOfTheWeek.values();
        for (DaysOfTheWeek myDay:DaysOfTheWeek.values()){
            System.out.println(myDay);
        }

        System.out.println(Cereals.COCOA_PUFFS.levelOfDeliciousness);
        System.out.println(Cereals.COCOA_PUFFS.price);
        for(Cereals myCereals: Cereals.values()){
            System.out.println(myCereals);
        }

    }
}
