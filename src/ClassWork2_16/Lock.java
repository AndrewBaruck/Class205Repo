package ClassWork2_16;


    /**
     A simulated lock with digit buttons.
     */
    public class Lock
    {
        private int combination = 1729;
        private int input;

        /**
         Simulates a digit button push.
         @param button a digit 0 ... 9
         */
        public void push(int button)
        {
            b = b + Integer.toString(button) ;
        }
        String a = "1729";
        String b = "";
        /**
         Simulates a push of the open button.
         @return true if the lock opened
         */
        public boolean open()
        {
            System.out.println("b " + b);
            if(a.equals(b)){
                b = "";
                return true;}
            else{
                b = "";
                return false;
            }
        }
        public Lock(){

        }
    }


