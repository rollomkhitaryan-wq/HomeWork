import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Ex. 1

        int o = 1;
        switch (o){
            case 1:
                System.out.println("Dasi enq");
                break;
            case 2:
                System.out.println("Azat enq");
                break;
            case 3:
                System.out.println("Dasi enq");
                break;
            case 4:
                System.out.println("Azat enq");
                break;
            case 5:
                System.out.println("Dasi enq");
                break;
            case 6:
                System.out.println("Azat enq");
                break;
            case 7:
                System.out.println("Hangstyan or");
                break;
            default:
                System.out.println("Shabatva aydpisi or goyutyun chuni");

        }

        //Ex.21-40

        int a = 10, b = 20, c = 25;

        //Ex.21

        if (a > b && a > c){
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }

        //Ex.22

        if (a < b && a < c){
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }

        //Ex.23

        if (a==1 || b==1 || c==1){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        //Ex.24

        if (a==2 && b==2){
            System.out.println("true");
        } else if (a==2 && c==2) {
            System.out.println("true");
        } else if (b==2 && c==2) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //Ex.25

        if ((a+b) > c && (a+c) > b && (b+c) > a){
            System.out.println("y=1");
        }
        else {
            System.out.println("y=2");
        }

        //Ex.26

        if ((a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0) ){
            System.out.println("mek");
        }
        else {
            System.out.println("erku");
        }

        //Ex.27

        if ((b - a) == (c - b)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //Ex.28

        if ((c / b ) == (b / a)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //Ex.29

        if ((a < b) && (b < c)){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }

        //Ex.30

        if ((c > b) && (b > a)){
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }

       int x = 10, y = 15, z = 20, d = 30;

        //Ex.31

        if (x>y && x>z && x>d){
            System.out.println(x);
        } else if (y>x && y>z && y>d) {
            System.out.println(y);
        } else if (z>x && z>y && z>d) {
            System.out.println(z);
        }
        else {
            System.out.println(d);
        }

        //Ex.32

        if (x<y && x<z && x<d){
            System.out.println(x);
        } else if (y<x && y<z && y<d) {
            System.out.println(y);
        } else if (z<x && z<y && z<d) {
            System.out.println(z);
        }
        else {
            System.out.println(d);
        }

        //Ex.33

        if (x==1 || y==1 || z==1 || d==1){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //Ex.34

        if (x + y == z + d || x + z == y + d){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //Ex.35

        if (x == z + y + d){
            System.out.println("true");
        } else if (z == x + y + d) {
            System.out.println("true");
        } else if (y == x + z + d) {
            System.out.println("true");
        } else if (d == x + y +z) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //Ex.36

        if (x % 2 != 0 && y % 2 != 0){
            System.out.println("Mek");
        } else if (x % 2 != 0 && z % 2 != 0 ) {
            System.out.println("Mek");
        }
        else if (x % 2 != 0 && d % 2 != 0 ) {
            System.out.println("Mek");
        }
        else if (y % 2 != 0 && z % 2 != 0 ) {
            System.out.println("Mek");
        }else if (y % 2 != 0 && d % 2 != 0 ) {
            System.out.println("Mek");
        }
        else if (z % 2 != 0 && d % 2 != 0 ) {
            System.out.println("Mek");
        }
        else {
            System.out.println("Erku");
        }

        //Ex.37

        if (d - z == z - y && z - y == y){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //Ex.38

        if (d / z == z / y && z / y == y / x){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //Ex.39

        if (x<y && x<z &&
            if (y<z && y<d){
                if (z<d){
                    System.out.println(x +" "+ y +" "+ z +" "+ d);
                }
            } else if (z<d && z<y) {
                if (d<y){
                    System.out.println(x +" "+ z +" "+ d +" "+ y);
                }
            }
        }


        //HomeWork.2

        int t = 549;

        int miavor = t % 10;
        int tasnavor = t /10 % 10;
        int haryuravor = t / 100;

        // Ex.51

        if (miavor == tasnavor + haryuravor){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //Ex.52

        if (haryuravor==tasnavor || tasnavor==miavor || miavor==haryuravor){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //Ex.53

        int k = 21;

        if (t>k){
            System.out.println(t / miavor+tasnavor+haryuravor);
        }
        else {
            System.out.println(miavor+tasnavor+haryuravor / t);
        }

        //Ex.54

        if (haryuravor>tasnavor && haryuravor>miavor){
            System.out.println(haryuravor);
        } else if (tasnavor>haryuravor && tasnavor>miavor) {
            System.out.println(tasnavor);
        }
        else {
            System.out.println(miavor);
        }

        //Ex.55

        if (haryuravor<tasnavor && haryuravor<miavor){
            System.out.println(haryuravor);
        } else if (tasnavor<haryuravor && tasnavor<miavor) {
            System.out.println(tasnavor);
        }
        else {
            System.out.println(miavor);
        }

        //Ex.56

        if (miavor>tasnavor){
            System.out.println(tasnavor+miavor+haryuravor / t);
        }
        else {
            System.out.println(t);
        }

        //Ex.57

        if (t>300){
            System.out.println(tasnavor/miavor);
        }
        else {
            System.out.println(haryuravor/miavor);
        }

        //Ex.58


        char f = 'a';

        if (tasnavor + haryuravor < 5){
            System.out.println(f);
        }
        else {
            System.out.println("b");
        }


        //Ex.59

        if (tasnavor<=miavor && tasnavor<=haryuravor){
            if (miavor<=haryuravor){
                System.out.println(tasnavor + " " + haryuravor +" "+ miavor);
            }
            if (haryuravor<=miavor){
                System.out.println(tasnavor + " " + miavor + " " + haryuravor);
            }
        }

        if (miavor<=tasnavor && miavor<=haryuravor){
            if (tasnavor<=haryuravor){
                System.out.println(miavor + " " + tasnavor +" "+ haryuravor);
            }
            else {
                System.out.println(miavor + " " + haryuravor + " " + tasnavor);
            }
        } else if (tasnavor<=miavor && tasnavor<=haryuravor) {
            if (miavor<=haryuravor){
                System.out.println(tasnavor + " " + miavor + " " + haryuravor);
            }
            else {
                System.out.println(tasnavor + " " + haryuravor + " " + miavor);
            }
        }

        else if (haryuravor<=miavor && haryuravor<=tasnavor) {
            if (miavor<=tasnavor){
                System.out.println(haryuravor + " " + miavor + " " + tasnavor);
            }
            else {
                System.out.println(haryuravor + " " + tasnavor + " " + miavor);
            }
        }

        //Ex.60

        if (tasnavor<=miavor && tasnavor<=haryuravor){
            if (miavor<=haryuravor){
                System.out.println(tasnavor + " " + haryuravor +" "+ miavor);
            }
            if (haryuravor<=miavor){
                System.out.println(tasnavor + " " + miavor + " " + haryuravor);
            }
        }

        if (miavor>=tasnavor && miavor>=haryuravor){
            if (tasnavor>=haryuravor){
                System.out.println(miavor + " " + tasnavor +" "+ haryuravor);
            }
            else {
                System.out.println(miavor + " " + haryuravor + " " + tasnavor);
            }
        } else if (tasnavor>=miavor && tasnavor>=haryuravor) {
            if (miavor>=haryuravor){
                System.out.println(tasnavor + " " + miavor + " " + haryuravor);
            }
            else {
                System.out.println(tasnavor + " " + haryuravor + " " + miavor);
            }
        }

        else if (haryuravor>=miavor && haryuravor>=tasnavor) {
            if (miavor>=tasnavor){
                System.out.println(haryuravor + " " + miavor + " " + tasnavor);
            }
            else {
                System.out.println(haryuravor + " " + tasnavor + " " + miavor);
            }
        }


        int v = 1569;
        int miavor1 = v % 10;
        int tasnavor1 = v / 10 % 10;
        int haryuravor1 = v / 100 % 10;
        int hazaravor = v / 1000;

        //Ex.61

        if (miavor1+tasnavor1 == haryuravor1+hazaravor){
            System.out.println("true");
        }
        else {
            System.out.println(false);
        }

        //Ex.62

        if (x<5000){
            System.out.println(v/(miavor1+haryuravor1));
        }
        else {
            System.out.println(v/(hazaravor+tasnavor1));
        }

        //Ex.63

        if (miavor1==1 || tasnavor1==1 || haryuravor1==1 || hazaravor==1){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

        //Ex.64

        if (miavor1+tasnavor1==5){
            System.out.println("s");
        }
        else {
            System.out.println("d");
        }

        //Ex.65

        if (miavor1*tasnavor1==12){
            System.out.println("y=12");
        }
        else {
            System.out.println("y=0");
        }

        //Ex.66

        if (hazaravor==4 || miavor1==4){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        //Ex.67

        int g = miavor1+tasnavor1+haryuravor1+hazaravor;
        if (v==g*g){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        //Ex.68

        if (miavor1>tasnavor1){
            System.out.println(miavor1*haryuravor1);
        }
        else {
            System.out.println("1");
        }

        //Ex.69

        if (g>20){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

        //Ex.70

        int A = haryuravor1*tasnavor1*miavor1*hazaravor;
        if (A>200){
            System.out.println("0");
        }
        else {
            System.out.println("1");
        }

    }
}

