/*

Lab 4 Programming II 
   Benjamin O. Morales
   Programming II 
   CSCI 1437
   Due: 10/05/2026 
   
*/



    public class Bug {
        private String name;
        private int numOfLegs;
        private int numOfWings;

        class Bug {
        }

        public Bug(String name, int numOfLegs, int numOfWings) {
            this.name = name;
            this.numOfLegs = numOfLegs;
            this.numOfWings = numOfWings;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setNumOfLegs(int numOfLegs) {
            this.numOfLegs = numOfLegs;
        }

        public int getNumOfLegs() {
            return numOfLegs;
        }

        public void setNumOfWings(int numOfWings) {
            this.numOfWings = numOfWings;
        }

        public int getNumOfWings() {
            return numOfWings;
        }

        public String toString() {
            // return "Bug [name=" + name + ", numOfLegs=" + numOfLegs + ", numOfWings=" + numOfWings + "]";
        }



    

}
