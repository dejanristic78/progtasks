
package progtasks;


public abstract class Bounce {
    public static void bounce3() {
        int pos = 0;
        boolean moveUp = true;
        
        while(true) {
            if(moveUp) {
                if(pos < 3) {
                    pos++;
                }
                else {
                    moveUp = false;
                    pos--;
                }
            }
            else {
                if(pos > -3) {
                    pos--;
                }
                else {
                    moveUp = true;
                    pos++;
                }
            }
            System.out.println("Pos: "+pos);
            try{
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    }
}
