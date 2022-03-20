public class roundBracket {

    // 균형잡힌 문자열을 분리하기 위한 인덱스 추출함수
    public static int splitString(String p) {
        String[] splitString = p.split("");
        int count = 0;
        int index = 0;
        for(int i = 0; i< splitString.length; i++) {
            if(splitString[i].equals("(")) count++;
            else count--;

            if(count == 0) {
                index = i + 1;
                break;
            }
        }
        return index;
    }

    // 올바른 문자열인지 구분하는 함수
    public static boolean validateString(String p) {
        String[] split = p.split("");
        int count = 0;
        for(String s : split) {
            if(s.equals("(")) count++;
            else count--;

            if(count < 0) return false;
        }
        return true;
    }

    // 올바른 문자열로 변환해주는 함수
    public static String setValidateString(String p) {
        String[] split = p.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < split.length-1; i++) {
            if(split[i].equals("(")) sb.append(")");
            else sb.append("(");
        }
        return sb.toString();
    }

    public static String getValidateString(String p){
        int index = splitString(p);
        String u = p.substring(0, index);
        String v = p.substring(index);
        StringBuilder sb = new StringBuilder();

        if(validateString(u)) sb.append(u);
        else {
            sb.append("(");
            if(!v.equals("")){
               getValidateString(v);
               v = "";
            }
            sb.append(")");
            sb.append(setValidateString(u));
        }
        if(!v.equals("")){
            getValidateString(v);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getValidateString("()))((()"));
    }
}