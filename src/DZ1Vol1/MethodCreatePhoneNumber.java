package DZ1Vol1;

public class MethodCreatePhoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(1,2,3,4,5,6,7,8,9,0));

    }
    /*
    если нельзя пользоваться ... то в метод передавал бы заранее созданный массив(number)
     */
//    static int[] number = {1,2,3,4,5,6,7,8,9,0};//
    static String createPhoneNumber(int ...arg){
        /*
        можно for, тоже криво будет
         */
        String formatNumber = "";
        formatNumber += "(" + arg[0] + arg[1] + arg[2] + ")";
        formatNumber += " " + arg[3] + arg[4] + arg[5] + "-";
        formatNumber += "" + arg[6] + arg[7] + arg[8] + arg[9];

        return  formatNumber;
    }

}
