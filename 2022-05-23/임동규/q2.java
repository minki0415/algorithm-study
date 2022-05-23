public class q2 {
    public static int solution(String[] instructions){
        
        int ans = 0;

        for(int i = 0; i < instructions.length; i++) {
            
            String command = instructions[i];

            if(command.equals("LEFT")) {
                ans -= 90;
            } else if(command.equals("RIGHT")) {
                ans += 90;
            } else if(command.equals("TURN AROUND")) {
                ans += 180;
            } else if(command.equals("HALT")) {
                break;
            } else {
                String[] arr = command.split(" ");

                if(arr[0].equals("LEFT")) {
                    ans -= Integer.parseInt(arr[1]);
                } else if(arr[0].equals("RIGHT")) {
                    ans += Integer.parseInt(arr[1]);
                }
            }

            if(ans >= 360) {
                ans -= 360;
            } else if(ans <= -360) {
                ans += 360;
            }

        }

        if(ans < 0) {
            ans += 360;
        }
        
        return ans;

    }

    public static void main(String[] args) {

        String[] instructions = {"LEFT 5","RIGHT 10","LEFT 15","RIGHT 20","LEFT 25","RIGHT 30","LEFT 35","RIGHT 40"};

        System.out.println(solution(instructions));
    }
}
