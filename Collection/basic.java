import java.util.ArrayList;

class basic {
    public static void main(String[]args ){
        ArrayList<Double> list = new ArrayList<>();
        list.add(3.0);
        list.add(4.3);
        list.add(5.4);
        list.add(4.4);
        list.add(5.4);
        list.add(6.4);
        list.add(3.4);
        list.add(9.4);
        list.add(2.4);
        list.add(15.4);
        // list.add(5.4);
        for(double i=0 ;i<lastIndexOf(list);i++){
           if(i%2==0){
               System.out.println(list.get(2));

           }

        }

    }
}