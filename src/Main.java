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

        


    }
}

