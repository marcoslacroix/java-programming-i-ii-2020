public class Song {
    
    private String name;
    private int length;
    
    public Song(String initialName, int initialLenght){
        this.name = initialName;
        this.length = initialLenght;
    }
    
    public String name(){
        return this.name;
    }
    
    public int length(){
        return this.length;
    }
}
