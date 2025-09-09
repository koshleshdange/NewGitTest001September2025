public class GitTestJavaClass
{
        public static void main(String[] args) {
            String name = "TOME";
            String reverse = "";
            String newReverse = new StringBuilder(name).reverse().toString();
            System.out.println("Reverse using StringBuilder:" +newReverse);
            for (int i = name.length()-1; i>=0; i--)
            {
                reverse = reverse + name.charAt(i);
            }
            System.out.println(reverse);

            if (name.equals(newReverse))
            {
                System.out.println("Number is palindrome");
            }
            else {
                System.out.println("Number is not palindrome");
            }
        }

    }


