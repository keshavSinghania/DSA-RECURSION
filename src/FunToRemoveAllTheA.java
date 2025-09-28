public class FunToRemoveAllTheA {
    public static void main(String[] args){
        String str = "aaakeaaashava";
        StringBuilder sb = new StringBuilder();
//        sb = removeA(str);
        System.out.println(sb);
    }

//    //function to remove a from string using simple loop
//    public static StringBuilder removeA(String str){
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) != 'a'){
//                sb.append(str.charAt(i));
//            }
//        }
//        return sb;
//    }

    //function to remove a from string using recursion
    public static void removeA(String str, StringBuilder sb){
        StringBuilder sb1 = new StringBuilder();
        //base condition
        if(str.length() == 0){
            return   ;
        }
    }
}
