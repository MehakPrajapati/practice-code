public class stringbuillder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("hyyyy");
        sb.append(1);
        sb.append(" + myyyyy"); // adding word
        System.out.println(sb.length());
        System.out.println(sb.substring(1, 3));
        System.out.println(sb.charAt(1));
        System.out.println(sb);
        sb.append("mbmb;");   // capacity increase 
        System.out.println(sb.capacity()); // (old capacity * 2 )+ 2
    }
}
