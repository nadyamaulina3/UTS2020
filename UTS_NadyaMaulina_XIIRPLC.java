package uts_nadyamaulina_xiirplc;

public class uts {
            public static void main (String []args){
        //Default charachter in variable
        String StrN = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z#-";
        
        //Getting charachter with substring
        String sub_StrA = StrN.substring(26, 27);
        String sub_StrB = StrN.substring(0, 1);
        String sub_StrC = StrN.substring(6, 7);
        String sub_StrD = StrN.substring(48, 49);
        String sub_StrE = StrN.substring(0, 1);
        String sub_StrF = StrN.substring(52, 53);
        String sub_StrG = StrN.substring(24, 25);
        String sub_StrH = StrN.substring(0, 1);
        String sub_StrI = StrN.substring(40, 41);
        String sub_StrJ = StrN.substring(22, 23);
        String sub_StrK = StrN.substring(16, 17);
        String sub_StrL = StrN.substring(26, 27);
        String sub_StrM = StrN.substring(0, 1);
        String sub_StrN = StrN.substring(52, 53);
        String sub_StrO = StrN.substring(34, 35);
        String sub_StrP = StrN.substring(0, 1);
        String sub_StrQ = StrN.substring(14, 15);
        String sub_StrR = StrN.substring(0, 1);
        String sub_StrS = StrN.substring(34, 35);
        String sub_StrT = StrN.substring(18, 19);
        String sub_StrU = StrN.substring(0, 1);
        
        String sub_Str1 = StrN.substring(46, 47);
        String sub_Str2 = StrN.substring(16, 17);
        String sub_Str3 = StrN.substring(16, 17);
        String sub_Str4 = StrN.substring(52, 53);
        String sub_Str5 = StrN.substring(34, 35);
        String sub_Str6 = StrN.substring(30, 31);
        String sub_Str7 = StrN.substring(22, 23);
        String sub_Str8 = StrN.substring(52, 53);
        String sub_Str9 = StrN.substring(4, 5);
        
        String g = sub_StrA.concat(sub_StrB + sub_StrC + sub_StrD + sub_StrE + sub_StrF + sub_StrG + sub_StrH +
                sub_StrI + sub_StrJ + sub_StrK + sub_StrL + sub_StrM + sub_StrN + sub_StrO + sub_StrP + sub_StrQ +
                sub_StrR + sub_StrS + sub_StrT +sub_StrU);

        String c = sub_Str1.concat(sub_Str2 + sub_Str3 + sub_Str4 + sub_Str5 + sub_Str6 + sub_Str7 + sub_Str8 + sub_Str9);
        //Print
        System.out.println("Nama :" +g+"\n");
        System.out.println("Kelas :" +c+"\n");
    }
}
