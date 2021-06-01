package pokergame;

public class numRandom {

    private int random;
    private String carta = "";

    public int NumRandom() {
        this.random = (int) (Math.random() * 13 + 1);
        return random;
    }

    public String carta(int random) {
        switch (random) {
            case 1:
                this.carta = "as-corazones";
                break;
            case 2:
                this.carta = "dos-corazones";
                break;
            case 3:
                this.carta = "tres-corazones";
                break;
            case 4:
                this.carta = "cuatro-corazones";
                break;
            case 5:
                this.carta = "cinco-corazones";
                break;
            case 6:
                this.carta = "seis-corazones";
                break;
            case 7:
                this.carta = "siete-corazones";
                break;
            case 8:
                this.carta = "ocho-corazones";
                break;
            case 9:
                this.carta = "nueves-corazones";
                break;
            case 10:
                this.carta = "diez-corazones";
                break;
            case 11:
                this.carta = "once-corazones";
                break;
            case 12:
                this.carta = "doce-corazones";
                break;
            case 13:
                this.carta = "trece-corazones";
                break;
            default:
                break;
        }
        
        return "imagenes/"+this.carta+".jpg";
    }

}
