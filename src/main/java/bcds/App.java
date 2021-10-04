package bcds;

import java.util.List;
import java.util.stream.Collectors;

import bcds.dataStructs.BCClassifier;

/**
 *
*/
public class App
{
    public static void main(String[] args) {
        CSVReader csvIn = new CSVReader("resources/breast-cancer-wisconsin.csv");

        // setting streamed data into a usable list.
        List<Integer[]> valued_csvdata = csvIn.Data.stream().map((String[] elem) -> {
            Integer[] val = new Integer[elem.length];
            // remove data breakers
            for (int i = 0; i < val.length; i++)
                val[i] = (elem[i].equals("?")) ? Integer.valueOf(0) : Integer.parseInt(elem[i]);

            return val;
        }).collect(Collectors.toList());

        // loop and get classification
        boolean[] diagnosis_arr = new boolean[valued_csvdata.size()];
        BCClassifier bcc = new BCClassifier();
        for (int i = 0; i < diagnosis_arr.length; i++) {
            diagnosis_arr[i] = bcc.diagnose(valued_csvdata.get(i));
        }

        // summarize classification
        int amount_right = 0;
        for (int i = 0; i < diagnosis_arr.length; i++) {
            Integer[] temp = valued_csvdata.get(i);

            // check expected vs actual
            if (diagnosis_arr[i] && temp[temp.length - 1] == 4) {
                ++amount_right;
            }
            else if (!diagnosis_arr[i] && temp[temp.length - 1] == 2) {
                ++amount_right;
            }
        }

        // how right is the model?
        float percent_correct = ((float)amount_right / valued_csvdata.size()) * 100;
        System.out.println(
            "The model has correctly categorized " + percent_correct + "% of " + valued_csvdata.size() + " rows"
        );

    }
}
