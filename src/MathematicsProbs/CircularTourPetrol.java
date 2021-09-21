package MathematicsProbs;

public class CircularTourPetrol {
    public static void main(String[] args) {
        int petrol[] ={ 4 ,6 ,7 ,4};
        int dist[]  ={6 ,5 ,3, 5};
        int val;
        for(int i=0;i<petrol.length;i++){
            if(petrol[i]>=dist[i]){
                val=i;
                for(int j=i;j< petrol.length-1;j++) {
                    int diff = petrol[i] - dist[i];
                    petrol[i + 1] = petrol[i + 1] + diff;
                    if (j == val) {
                        System.out.println(j);
                        break;
                    }
                    else if(j<petrol.length-1)
                        j=0;
                }
            }

        }
    }
}
