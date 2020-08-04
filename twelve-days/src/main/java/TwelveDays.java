class TwelveDays {

    String select(int x) {

        String localstr = "";

        switch (x) {
            case 1:
                localstr = "a Partridge in a Pear Tree.";
                break;

            case 2:
                localstr = "two Turtle Doves";
                break;

            case 3:
                localstr = "three French Hens";
                break;

            case 4:
                localstr = "four Calling Birds";
                break;

            case 5:
                localstr = "five Gold Rings";
                break;

            case 6:
                localstr = "six Geese-a-Laying";
                break;

            case 7:
                localstr = "seven Swans-a-Swimming";
                break;

            case 8:
                localstr =  "eight Maids-a-Milking";
                break;

            case 9:
                localstr =  "nine Ladies Dancing";
                ;
                break;

            case 10:
                localstr = "ten Lords-a-Leaping";
                break;

            case 11:
                localstr =  "eleven Pipers Piping";
                break;

            case 12:
                localstr = "twelve Drummers Drumming";
                break;
        }
        return localstr;
    }


    String make(int offset){

        String cumalitive_str = "";

        if(offset == 1)
            return "a Partridge in a Pear Tree.";

        for(int i = offset ; i >= 1 ; i--){

            if (i == 1) {
                cumalitive_str = cumalitive_str + "and " + "a Partridge in a Pear Tree.";
                break;
            }

            cumalitive_str = cumalitive_str + select(i) + ", ";
        }

        return cumalitive_str;
    }

    String verse(int verseNumber) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

        String localstr = "";

        switch(verseNumber){
            case 1:
                localstr = "On the first day of Christmas my true love gave to me: " + make(1) + '\n';break;
            case 2:
                localstr = "On the second day of Christmas my true love gave to me: " + make(2) + '\n';break;
            case 3:
                localstr = "On the third day of Christmas my true love gave to me: " + make(3) + '\n';break;
            case 4:
                localstr = "On the fourth day of Christmas my true love gave to me: " + make(4) + '\n';break;
            case 5:
                localstr = "On the fifth day of Christmas my true love gave to me: " + make(5) + '\n';break;
            case 6:
                localstr = "On the sixth day of Christmas my true love gave to me: " + make(6) + '\n';break;
            case 7:
                localstr = "On the seventh day of Christmas my true love gave to me: " + make(7) + '\n';break;
            case 8:
                localstr = "On the eighth day of Christmas my true love gave to me: " + make(8) + '\n';break;
            case 9:
                localstr = "On the ninth day of Christmas my true love gave to me: " + make(9) + '\n';break;
            case 10:
                localstr = "On the tenth day of Christmas my true love gave to me: " + make(10) + '\n';break;
            case 11:
                localstr = "On the eleventh day of Christmas my true love gave to me: " + make(11) + '\n';break;
            case 12:
                localstr = "On the twelfth day of Christmas my true love gave to me: " + make(12) + '\n';break;
        }
        return localstr;
    }

    String verses(int startVerse, int endVerse) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String str = "";
        for(int itr = startVerse ; itr  < endVerse ; itr++){
            str = str + verse(itr) + '\n';
        }

        str = str +  verse(endVerse);
        return str;
    }

    String sing() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return verses(1,12);
    }
}