package box;

public class BoxFive {
    float length;
    float width;
    float height;

    public BoxFive(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate() {
        if (length < 39.5 && width < 27.5 && height < 23){
            return true;
        }else {
            return false;
        }
    }
}
