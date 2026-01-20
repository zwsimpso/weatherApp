import java.util.Scanner;

void main(){


    try{
        //Create a scanner class to get user input
        Scanner scanner = new Scanner(System.in);
        String city;
        String no = "No";

        //Do while loop to allow users to check multiple cities, break out on "No"
        do{
            IO.println("///////////////");
            IO.print("Please insert a city (No to quit): ");
            city = scanner.nextLine();

            if(city.equalsIgnoreCase(no)) break;

            //put input into a string variable for easy printing
            IO.println("hello " + city);
        }while(!city.equalsIgnoreCase(no));

    }catch(Exception e){
        IO.println("Scanner error");
    }

}
