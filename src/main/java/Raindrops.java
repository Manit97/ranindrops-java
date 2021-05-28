public class Raindrops {

    String convert(int num){
        String digits = "";
        if (isFactor(num, 3))
            digits+= "Pling";
        if (isFactor(num, 5))
            digits+= "Plang";
        if (isFactor(num, 7))
            digits+= "Plong";
        if (digits.isEmpty())
            digits = Integer.toString(num);
        return digits;
    }

    private boolean isFactor(int num, int factor) {
        return (num/factor) == (num/(double)factor);
    }

}
