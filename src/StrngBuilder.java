public class StrngBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch =(char)('a'+i);
            builder.append(ch); //This is not creating new string agian and again it is mutable not like string.

        }
        System.out.println(builder);
    }
}
