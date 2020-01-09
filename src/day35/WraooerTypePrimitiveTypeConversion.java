package day35;

public class WraooerTypePrimitiveTypeConversion {
    public static void main(String[] args) {

        Integer num1 = 100; //autobox -- new Integer (100)
        //Integer.valueOf - return integer object
        //it has 2 overloded version.one accepts string or int
        //BOTH return INt object
        int num2 = Integer.valueOf("200");
        //auto-unboxing into 200

        int num3 = Integer.parseInt("200");

        //Integer.parseInt("number here")
        //  return: INT VALUE CONVERTED FROM STRING
        // which is pimitive


        // Integer.valueOf("number here")
        //return:  INTEGER OBJECT by wrapping up the number

        //YOU may SUE WHICHEVER YOU WANT BECAUSE :
        // Auto- boxing and auto-unboxing will take care of it anyway


        //TASK :
        //USe this number IPR2012 - 00001 and store this year into int variable

//        String caseNumber = "IPR2012 - 00001";
//        int year ;
//        String strYear = caseNumber.substring(3,7);
//        year = Integer.parseInt(strYear);
//        System.out.println("year = " + year);

        System.out.println(getYearOutOfCaseNumber("IPR2012 - 00001"));
        System.out.println(getYearOutOfCaseNumber("DPR2002 - 02301"));
        System.out.println(getYearOutOfCaseNumber("IPR2010 - 00501"));
        System.out.println(getYearOutOfCaseNumber("PER2016 - 23401"));




//        int year = Integer.parseInt(str.substring(str.indexOf("-")-4,str.indexOf("-")));
//        System.out.println("year = " + year);
//
//
//        int num = Integer.valueOf("IPR2012-00001".substring(3,7));



    }

    public static int getYearOutOfCaseNumber (String caseNumber) {

        //do validation on your case number
        //TODO: case number should alwasy start with either
        // CBM, IRP, PGR, DER
        // FOLLOWED BY 4 Digit number
        // Followed by -
        // followed by 4 digit number
//        int year ;
//        String strYear = caseNumber.substring(3,7);
//        year = Integer.parseInt(strYear);
//
//        return year;

        //OR

        return Integer.parseInt(caseNumber.substring(3,7));
    }
}
