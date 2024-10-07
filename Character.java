public class Character {

        // atrebuts
        int hunger = 0;
        private int boredom = 0;
        private ArreyList<Sting> words = new ArreyList<String>();
        private boolean isAlive;
        public Sting name;
        Randon ran = new Random();

        public Character() {
            isAlive = true;
            words.add("Hello");
        }

        public void tick (){
            hunger++;
            boredom++;
            if (hunger > 10|| boredom > 10) {
                isAlive = false;
            }



        }

}
