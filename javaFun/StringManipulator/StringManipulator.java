class StringManipulator{
    public String trimAndConcate(String string1, String string2){
        string1 =string1.trim();
        string2= string2.trim();
        return string1+string2;
    }
    public Integer getIndexOrNull1(String string, char x){
        if (string.indexOf(x)>0) {
            return string.indexOf(x);
        }
        else {
            return null;
        }
    }
    public Integer getIndexOrNull2(String string1, String string2){
        if (string1.indexOf(string2)>0) {
            return string1.indexOf(string2);
        }
        else {
            return null;
        }
    }
    public String concatSubstring(String string1, int x, int y, String string2){
        return string1.substring(x,y)+ string2;
    }


}
