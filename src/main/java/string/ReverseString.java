package string;

public class ReverseString {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length -1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        System.out.println();
        for(char temp:s){
            System.out.print(temp);
        }
    }

    public static void main(String[] args) {
        char[] arr={'h','e','l','l','o'};
        ReverseString reverseString=new ReverseString();
        reverseString.reverseString(arr);
    }
}
