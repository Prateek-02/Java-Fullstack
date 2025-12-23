public class DoWhileLoopCode {
    public static void main(String[] args) {
        //initialization
        int i = 1;
        do{
            System.out.println(i);
            //Updation
            i++;
        }
        while(i <= 3); // condition

        //Workflow

        // Iteration:
        // I-1: sout(i);->i++(i=1+1)->2<=3-> true
        // I-2: sout(i)->i++(i=2+1)->3<=3->true
        // I-3: sout(i)->i++(i=3+1)->4<=3->false

        // O/P -> 1,2,3

    }
}
