package Practice;
    class MostFrequent {

        public static void main(String[] args) {
            int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
            int taille = tab1.length;

            /*******************************************
             * Completez le programme a partir d'ici.
             *******************************************/
                int val=0;
            int count=0;
                for (int i=0;i< taille;i++){
                        int tempelement=tab1[i];
                        int tempcount=0;
                    for (int j=0;j< taille;j++){

                        if (tab1[j]==tempelement)
                            tempcount++;
                        if (tempcount>count){
                            val=tempcount;
                            count=tempcount;

                        }



                    }System.out.println("Le nombre le plus frequent dans le tableau est le : "+val+"("+count+" )");

                }

            /*******************************************
             * Ne rien modifier apres cette ligne.
             *******************************************/

        }
    }


