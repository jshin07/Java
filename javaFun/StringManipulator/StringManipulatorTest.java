class StringManipulatorTest {
    public static void main(String[] args){
        StringManipulator iD = new StringManipulator();
        String trimAndConcate = iD.trimAndConcate(" Hello ", "   World ");
        System.out.println(trimAndConcate);

        Integer getIndexOrNull1 = iD.getIndexOrNull1("Hello World", 'x');
        System.out.println(getIndexOrNull1);

        Integer getIndexOrNull2 = iD.getIndexOrNull2("Hello World and Ninjas", "and");
        System.out.println(getIndexOrNull2);

        String concatSubstring = iD.concatSubstring("Hello",1,3,"world");
        System.out.println(concatSubstring);
    }
}
