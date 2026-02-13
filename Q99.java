class Q99{
    static int stringToIntHelper(String str, int index) {
        if (index == str.length())
            return 0;
        int digit = str.charAt(index) - '0';
        return digit * (int)Math.pow(10, str.length() - index - 1) + stringToIntHelper(str, index + 1);
    }
    static int stringToInt(String str) {
        return stringToIntHelper(str, 0);
    }
    public static void main(String[] args) {
        String str = "1235";
        System.out.println(stringToInt(str));
    }
}
