public class CD extends product {

    private String artist;
    private int numSong;
    private String label;

    public CD() {
        super();//constructor dari superclass
        artist = "Lady GaGa";    
        numSong = 10;
        label = "Sony Music";

    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void print() {
        super.print();
        System.out.println("Artist\t: " + artist);
        System.out.println("Number of Song\t: " + numSong);
        System.out.println("Label\t: " + label);  

}

}
