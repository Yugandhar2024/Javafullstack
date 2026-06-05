// MAX OUT OF 4 NUMBERS USING CONDITIONAL OPERATOR

class Max4
{
    public static void main(String[] args)
    {
        int a = 25, b = 5, c = 15, d = 60;

        int res = (a > b) ?
                    ((a > c) ? ((a > d) ? a : d)
                             : ((c > d) ? c : d))
                  :
                    ((b > c) ? ((b > d) ? b : d)
                             : ((c > d) ? c : d));

        System.out.println(res);
    }
}
