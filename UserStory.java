// class that represents my user
public class UserStory {

    private String[] species;
    private int[] year;
    private String[] dangers;
    private int[] values;

    /* no- argument constructor
    introduces the species, year, dangers, values
    makes the index 0
  */
    public UserStory() {
        species = new String[0];
        year = new int[0];
        dangers = new String[0];
        values = new int[0];
    }

    /*  gets data from the files into the arrays
    implemented FileReaderMethods
    */
    public UserStory(String speciesFile, String yearFile, String dangersFile, String valuesFile) {
        species = FileReader.toStringArray(speciesFile);
        year = FileReader.toIntArray(yearFile);
        dangers = FileReader.toStringArray(dangersFile);
        values = FileReader.toIntArray(valuesFile);
    }

    // finds the species with the highest value
    public String getMostDangerous() {
        if (values.length == 0) return "none";

        int maxIndex = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] > values[maxIndex]) {
                maxIndex = i;
            }
        }
        return species[maxIndex];
    }

    /* our toString() method
       gives information + prints data
    */
    public String toString() {
        String result = "";
        result += "Total species: " + species.length + "\n";
        result += "Most dangerous: " + getMostDangerous() + "\n\n";

        for (int i = 0; i < species.length; i++) {
            result += species[i] + ", " + year[i] + ", " + dangers[i] + ", " + values[i] + "\n";
        }
        return result;
    }
}
