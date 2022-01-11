class Level {
    private int width;
    private int height;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class LevelLoader {
    public void load(Level level) throws LevelTooBigException {
        if (level.getHeight()* level.getWidth()>100000){
            throw new LevelTooBigException();
        }
        System.out.println("Level loaded");
    }
}
class LevelTooBigException extends Exception{
    LevelTooBigException() {
        super("Level to big");

    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
      
}
}